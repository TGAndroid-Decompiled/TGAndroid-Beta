package zf;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f48074b;
    public final AudioBufferConverter f48075c = new AudioBufferConverter();
    public long d;
    public int e;
    public int f48076f;
    public int f48077g;
    public int h;
    public ShortBuffer f48078i;
    public boolean f48079j;

    public c(String str) {
        this.f48074b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s10;
        if (this.f48079j) {
            int i10 = this.f48076f;
            if (i10 < this.e) {
                this.f48076f = i10 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f48078i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s10 = this.f48078i.get();
            } else {
                s10 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f48078i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s10;
            }
            this.f48079j = false;
            return s10;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f48074b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f48079j;
    }

    @Override
    public final void d() {
        this.f48078i = null;
        this.f48079j = false;
        AudioDecoder audioDecoder = this.f48074b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i10, int i11) {
        this.f48077g = i10;
        this.h = i11;
        this.f48079j = true;
        this.f48074b.start();
        this.e = AudioConversions.usToShorts(this.d, this.f48077g, this.h);
        this.f48076f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f48078i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f48074b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f48078i = this.f48075c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f48077g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f48078i = null;
    }

    public c(String str, int i10) {
        this.f48074b = new AudioDecoder(str, i10);
    }
}
