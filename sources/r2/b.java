package r2;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class b extends a {
    public int h;
    public int f47006n;
    public long f47007r;

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(28);
        allocate.position(6);
        p2.b.p(this.f47005f, allocate);
        p2.b.p(0, allocate);
        p2.b.p(0, allocate);
        allocate.putInt((int) 0);
        p2.b.p(this.h, allocate);
        p2.b.p(this.f47006n, allocate);
        p2.b.p(0, allocate);
        p2.b.p(0, allocate);
        if (this.f4225e.equals("mlpa")) {
            allocate.putInt((int) this.f47007r);
        } else {
            allocate.putInt((int) (this.f47007r << 16));
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override
    public final long getSize() {
        int i9;
        long b10 = b() + 28;
        if (8 + b10 >= 4294967296L) {
            i9 = 16;
        } else {
            i9 = 8;
        }
        return b10 + i9;
    }

    @Override
    public final String toString() {
        return "AudioSampleEntry{bytesPerSample=0, bytesPerFrame=0, bytesPerPacket=0, samplesPerPacket=0, packetSize=0, compressionId=0, soundVersion=0, sampleRate=" + this.f47007r + ", sampleSize=" + this.f47006n + ", channelCount=" + this.h + ", boxes=" + this.f4231b + '}';
    }
}
