package tf;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f48691b;
    public final AudioBufferConverter f48692c = new AudioBufferConverter();
    public long d;
    public int e;
    public int f48693f;
    public int f48694g;
    public int h;
    public ShortBuffer f48695i;
    public boolean f48696j;

    public c(String str) {
        this.f48691b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s10;
        if (this.f48696j) {
            int i10 = this.f48693f;
            if (i10 < this.e) {
                this.f48693f = i10 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f48695i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s10 = this.f48695i.get();
            } else {
                s10 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f48695i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s10;
            }
            this.f48696j = false;
            return s10;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f48691b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f48696j;
    }

    @Override
    public final void d() {
        this.f48695i = null;
        this.f48696j = false;
        AudioDecoder audioDecoder = this.f48691b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i10, int i11) {
        this.f48694g = i10;
        this.h = i11;
        this.f48696j = true;
        this.f48691b.start();
        this.e = AudioConversions.usToShorts(this.d, this.f48694g, this.h);
        this.f48693f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f48695i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f48691b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f48695i = this.f48692c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f48694g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f48695i = null;
    }

    public c(String str, int i10) {
        this.f48691b = new AudioDecoder(str, i10);
    }
}
