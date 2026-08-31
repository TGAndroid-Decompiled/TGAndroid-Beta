package t2;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class b extends a {
    public int h;
    public int f47834n;
    public long f47835r;

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(28);
        allocate.position(6);
        r2.b.p(this.f47833f, allocate);
        r2.b.p(0, allocate);
        r2.b.p(0, allocate);
        allocate.putInt((int) 0);
        r2.b.p(this.h, allocate);
        r2.b.p(this.f47834n, allocate);
        r2.b.p(0, allocate);
        r2.b.p(0, allocate);
        if (this.f4130e.equals("mlpa")) {
            allocate.putInt((int) this.f47835r);
        } else {
            allocate.putInt((int) (this.f47835r << 16));
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override
    public final long getSize() {
        int i10;
        long b10 = b() + 28;
        if (8 + b10 >= 4294967296L) {
            i10 = 16;
        } else {
            i10 = 8;
        }
        return b10 + i10;
    }

    @Override
    public final String toString() {
        return "AudioSampleEntry{bytesPerSample=0, bytesPerFrame=0, bytesPerPacket=0, samplesPerPacket=0, packetSize=0, compressionId=0, soundVersion=0, sampleRate=" + this.f47835r + ", sampleSize=" + this.f47834n + ", channelCount=" + this.h + ", boxes=" + this.f4136b + '}';
    }
}
