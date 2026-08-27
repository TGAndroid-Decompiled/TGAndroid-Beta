package r2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class b extends a {
    public int h;

    public int f46696n;

    public long f46697r;

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(d());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(28);
        byteBufferAllocate.position(6);
        p2.b.p(this.f46695f, byteBufferAllocate);
        p2.b.p(0, byteBufferAllocate);
        p2.b.p(0, byteBufferAllocate);
        byteBufferAllocate.putInt((int) 0);
        p2.b.p(this.h, byteBufferAllocate);
        p2.b.p(this.f46696n, byteBufferAllocate);
        p2.b.p(0, byteBufferAllocate);
        p2.b.p(0, byteBufferAllocate);
        if (this.f4667e.equals("mlpa")) {
            byteBufferAllocate.putInt((int) this.f46697r);
        } else {
            byteBufferAllocate.putInt((int) (this.f46697r << 16));
        }
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        c(writableByteChannel);
    }

    @Override
    public final long getSize() {
        long jB = b() + ((long) 28);
        return jB + ((long) (8 + jB >= 4294967296L ? 16 : 8));
    }

    @Override
    public final String toString() {
        return "AudioSampleEntry{bytesPerSample=0, bytesPerFrame=0, bytesPerPacket=0, samplesPerPacket=0, packetSize=0, compressionId=0, soundVersion=0, sampleRate=" + this.f46697r + ", sampleSize=" + this.f46696n + ", channelCount=" + this.h + ", boxes=" + this.f4673b + '}';
    }
}
