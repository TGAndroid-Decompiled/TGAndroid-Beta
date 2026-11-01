package tf;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f48702b;
    public final AudioBufferConverter f48703c = new AudioBufferConverter();
    public long d;
    public int e;
    public int f48704f;
    public int f48705g;
    public int h;
    public ShortBuffer f48706i;
    public boolean f48707j;

    public c(String str) {
        this.f48702b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s10;
        if (this.f48707j) {
            int i10 = this.f48704f;
            if (i10 < this.e) {
                this.f48704f = i10 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f48706i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s10 = this.f48706i.get();
            } else {
                s10 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f48706i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s10;
            }
            this.f48707j = false;
            return s10;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f48702b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f48707j;
    }

    @Override
    public final void d() {
        this.f48706i = null;
        this.f48707j = false;
        AudioDecoder audioDecoder = this.f48702b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i10, int i11) {
        this.f48705g = i10;
        this.h = i11;
        this.f48707j = true;
        this.f48702b.start();
        this.e = AudioConversions.usToShorts(this.d, this.f48705g, this.h);
        this.f48704f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f48706i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f48702b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f48706i = this.f48703c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f48705g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f48706i = null;
    }

    public c(String str, int i10) {
        this.f48702b = new AudioDecoder(str, i10);
    }
}
