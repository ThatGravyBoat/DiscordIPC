### Discord IPC

This is a continuation of the original DiscordIPC project by jagrosh. 

This adds additional fixes and features such as:

- Added ability to add buttons to RPC
- Updated junixsocket version
- Fixed crash for unix pipe
- Added ability to change activity type

## Getting Started

First you'll need to add the repository to your build.gradle file:

```kts
maven("https://maven.teamresourceful.com/repository/thatgravyboat/")
```

Then you can add the dependency:

```kts
compileOnly("com.jagrosh:DiscordIPC:${version}")
```

## Example

```java
IPCClient client = new IPCClient(345229890980937739L);
client.setListener(new IPCListener(){
    @Override
    public void onReady(IPCClient client)
    {
        RichPresence.Builder builder = new RichPresence.Builder();
        builder.setState("West of House")
            .setDetails("Frustration level: Over 9000")
            .setStartTimestamp(OffsetDateTime.now())
            .setLargeImage("canary-large", "Discord Canary")
            .setSmallImage("ptb-small", "Discord PTB")
            .setParty("party1234", 1, 6)
            .setMatchSecret("xyzzy")
            .setJoinSecret("join")
            .setSpectateSecret("look");
        client.sendRichPresence(builder.build());
    }
});
client.connect();
```