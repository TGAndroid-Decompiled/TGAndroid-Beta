package wi;

import android.media.MediaCodec;
import android.media.MediaFormat;
import bi.h4;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
import org.telegram.ui.Cells.f1;
public final class x {
    public final File f58119a;
    public final int f58120b;
    public final boolean f58121c;
    public final n d;
    public final org.telegram.ui.web.a0 f58122e;
    public MP4Builder f58125i;
    public MediaFormat f58126j;
    public MediaFormat f58127k;
    public long f58130n;
    public long f58131o;
    public long f58132p;
    public long f58134r;
    public int f58135s;
    public ByteBuffer f58136t;
    public boolean v;
    public boolean f58138w;
    public boolean f58139x;
    public final ArrayList f58123f = new ArrayList();
    public final w f58124g = new w(33333);
    public final w h = new w(21333);
    public int f58128l = -1;
    public int f58129m = -1;
    public long f58133q = Long.MIN_VALUE;
    public final MediaCodec.BufferInfo f58137u = new MediaCodec.BufferInfo();

    public x(File file, int i7, boolean z9, n nVar, org.telegram.ui.web.a0 a0Var) {
        this.f58119a = file;
        this.f58120b = i7;
        this.f58121c = z9;
        this.d = nVar;
        this.f58122e = a0Var;
    }

    public static int a(ByteBuffer byteBuffer) {
        if (byteBuffer.limit() >= 4 && byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 0 && byteBuffer.get(3) == 1) {
            return 4;
        }
        if (byteBuffer.limit() >= 3 && byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 1) {
            return 3;
        }
        return 0;
    }

    public static String d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        return "offset=" + bufferInfo.offset + ", size=" + bufferInfo.size + ", ptsUs=" + bufferInfo.presentationTimeUs + ", flags=" + bufferInfo.flags + ", position=" + byteBuffer.position() + ", limit=" + byteBuffer.limit() + ", capacity=" + byteBuffer.capacity();
    }

    public static String e(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i7;
        int i10;
        String str;
        p(byteBuffer, bufferInfo);
        int i11 = bufferInfo.offset;
        int i12 = bufferInfo.size + i11;
        int f10 = f(byteBuffer, i11, i12);
        if (f10 == bufferInfo.offset) {
            i7 = o(byteBuffer, f10, i12);
            i10 = 0;
            while (f10 >= 0) {
                i10++;
                f10 = f(byteBuffer, o(byteBuffer, f10, i12) + f10, i12);
            }
        } else {
            i7 = 0;
            i10 = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d(byteBuffer, bufferInfo));
        sb2.append(", format=");
        if (i10 > 0) {
            str = "annex-b";
        } else {
            str = "avcc";
        }
        sb2.append(str);
        sb2.append(", nalCount=");
        sb2.append(i10);
        sb2.append(", firstPrefix=");
        sb2.append(i7);
        sb2.append(", head=");
        int i13 = bufferInfo.offset;
        StringBuilder sb3 = new StringBuilder();
        int min = Math.min(16, i12 - i13);
        for (int i14 = 0; i14 < min; i14++) {
            if (i14 > 0) {
                sb3.append(' ');
            }
            int i15 = byteBuffer.get(i13 + i14) & 255;
            if (i15 < 16) {
                sb3.append('0');
            }
            sb3.append(Integer.toHexString(i15));
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public static int f(ByteBuffer byteBuffer, int i7, int i10) {
        int i11;
        while (true) {
            int i12 = i7 + 2;
            if (i12 < i10) {
                if (byteBuffer.get(i7) != 0 || byteBuffer.get(i7 + 1) != 0 || (byteBuffer.get(i12) != 1 && ((i11 = i7 + 3) >= i10 || byteBuffer.get(i12) != 0 || byteBuffer.get(i11) != 1))) {
                    i7++;
                }
            } else {
                return -1;
            }
        }
        return i7;
    }

    public static boolean m(MediaFormat mediaFormat, MediaFormat mediaFormat2, String... strArr) {
        if (mediaFormat != null) {
            for (String str : strArr) {
                ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                ByteBuffer byteBuffer2 = mediaFormat2.getByteBuffer(str);
                if (byteBuffer != null && byteBuffer2 != null) {
                    int a10 = a(byteBuffer);
                    int a11 = a(byteBuffer2);
                    int limit = byteBuffer.limit() - a10;
                    if (limit == byteBuffer2.limit() - a11) {
                        for (int i7 = 0; i7 < limit; i7++) {
                            if (byteBuffer.get(a10 + i7) == byteBuffer2.get(a11 + i7)) {
                            }
                        }
                        continue;
                    }
                } else if (byteBuffer == byteBuffer2) {
                }
            }
            return true;
        }
        return false;
    }

    public static int o(ByteBuffer byteBuffer, int i7, int i10) {
        if (i7 + 3 < i10 && byteBuffer.get(i7 + 2) == 0) {
            return 4;
        }
        return 3;
    }

    public static void p(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i7 = bufferInfo.offset;
        int i10 = bufferInfo.size;
        long j3 = i7 + i10;
        if (i7 >= 0 && i10 >= 0 && j3 <= byteBuffer.limit()) {
            return;
        }
        throw new IOException("Invalid codec buffer range: offset=" + bufferInfo.offset + ", size=" + bufferInfo.size + ", position=" + byteBuffer.position() + ", limit=" + byteBuffer.limit() + ", capacity=" + byteBuffer.capacity());
    }

    public final MediaCodec.BufferInfo b(boolean z9, MediaCodec.BufferInfo bufferInfo, long j3) {
        w wVar;
        long max;
        w wVar2 = this.h;
        w wVar3 = this.f58124g;
        if (z9) {
            wVar = wVar3;
        } else {
            wVar = wVar2;
        }
        if (j3 < 0) {
            max = Math.max(0L, j3 + bufferInfo.presentationTimeUs);
        } else {
            if (this.f58133q != j3) {
                this.f58133q = j3;
                this.f58134r = Math.max(j3, Math.max(wVar3.a(), wVar2.a()));
                wVar3.f58116a = Long.MIN_VALUE;
                wVar3.f58117b = Long.MIN_VALUE;
                wVar2.f58116a = Long.MIN_VALUE;
                wVar2.f58117b = Long.MIN_VALUE;
            }
            if (wVar.f58116a == Long.MIN_VALUE) {
                wVar.f58116a = bufferInfo.presentationTimeUs;
            }
            max = this.f58134r + Math.max(0L, bufferInfo.presentationTimeUs - wVar.f58116a);
        }
        long j10 = bufferInfo.presentationTimeUs;
        long j11 = wVar.f58117b;
        if (j11 != Long.MIN_VALUE) {
            long j12 = j10 - j11;
            if (j12 > 0 && j12 < 1000000) {
                wVar.d = j12;
            }
        }
        wVar.f58117b = j10;
        wVar.f58118c = Math.max(wVar.f58118c, max);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, max, bufferInfo.flags);
        return bufferInfo2;
    }

    public final synchronized void c(File file) {
        if (this.f58125i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f58125i.finishMovie(file);
                n nVar = this.d;
                nVar.b("MP4 preview written: file=" + file.getName() + ", size=" + file.length() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
            } catch (Exception e10) {
                throw new IOException("Unable to create preview MP4", e10);
            }
        } else {
            throw new IOException("MP4 tracks are not initialized");
        }
    }

    public final synchronized void g() {
        if (this.f58139x) {
            return;
        }
        if (this.f58125i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f58125i.finishMovie();
                this.f58139x = true;
                l(this.f58119a.length());
                n nVar = this.d;
                nVar.b("MP4 finalized: file=" + this.f58119a.getName() + ", size=" + this.f58119a.length() + ", videoSamples=" + this.f58131o + ", audioSamples=" + this.f58132p + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                return;
            } catch (Exception e10) {
                throw new IOException("Unable to finish MP4", e10);
            }
        }
        throw new IOException("MP4 tracks are not initialized");
    }

    public final synchronized long h() {
        long a10;
        try {
            a10 = this.f58124g.a();
            if (this.f58121c) {
                a10 = Math.max(a10, this.h.a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a10 / 1000;
    }

    public final synchronized int i() {
        return this.f58135s;
    }

    public final void j() {
        ArrayList arrayList = this.f58123f;
        if (this.f58126j != null) {
            boolean z9 = this.f58121c;
            if (!z9 || this.f58127k != null) {
                Mp4Movie mp4Movie = new Mp4Movie();
                File file = this.f58119a;
                mp4Movie.setCacheFile(file);
                int i7 = this.f58120b;
                mp4Movie.setSize(i7, i7);
                try {
                    MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, true, false);
                    this.f58125i = createMovie;
                    this.f58128l = createMovie.addTrack(this.f58126j, false);
                    if (z9) {
                        this.f58129m = this.f58125i.addTrack(this.f58127k, true);
                    }
                    n nVar = this.d;
                    nVar.b("MP4 initialized: file=" + file.getName() + ", output=" + i7 + "x" + i7 + ", includeAudio=" + z9 + ", pendingSamples=" + arrayList.size());
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        v vVar = (v) arrayList.get(i10);
                        r(vVar.f58101a, vVar.f58102b, vVar.f58103c);
                    }
                    arrayList.clear();
                } catch (Exception e10) {
                    throw new IOException("Unable to initialize MP4", e10);
                }
            }
        }
    }

    public final void k(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int position;
        int limit;
        int i7;
        int i10;
        p(byteBuffer, bufferInfo);
        int i11 = bufferInfo.offset;
        int i12 = bufferInfo.size + i11;
        int f10 = f(byteBuffer, i11, i12);
        if (f10 != bufferInfo.offset) {
            int i13 = bufferInfo.size;
            ByteBuffer byteBuffer2 = this.f58136t;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i13) {
                this.f58136t = ByteBuffer.allocateDirect(i13);
            }
            this.f58136t.clear();
            position = byteBuffer.position();
            limit = byteBuffer.limit();
            try {
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                this.f58136t.put(byteBuffer);
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                this.f58136t.flip();
                this.f58137u.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                return;
            } finally {
            }
        }
        int i14 = 0;
        int i15 = f10;
        int i16 = 0;
        while (i15 >= 0) {
            int o4 = o(byteBuffer, i15, i12) + i15;
            i15 = f(byteBuffer, o4, i12);
            if (i15 < 0) {
                i10 = i12;
            } else {
                i10 = i15;
            }
            if (i10 > o4) {
                i14++;
                i16 = ((i10 + 4) - o4) + i16;
            }
        }
        if (i14 != 0) {
            ByteBuffer byteBuffer3 = this.f58136t;
            if (byteBuffer3 == null || byteBuffer3.capacity() < i16) {
                this.f58136t = ByteBuffer.allocateDirect(i16);
            }
            this.f58136t.clear();
            position = byteBuffer.position();
            limit = byteBuffer.limit();
            while (f10 >= 0) {
                try {
                    int o10 = f10 + o(byteBuffer, f10, i12);
                    int f11 = f(byteBuffer, o10, i12);
                    if (f11 < 0) {
                        i7 = i12;
                    } else {
                        i7 = f11;
                    }
                    if (i7 > o10) {
                        this.f58136t.putInt(i7 - o10);
                        byteBuffer.position(o10);
                        byteBuffer.limit(i7);
                        this.f58136t.put(byteBuffer);
                    }
                    f10 = f11;
                } finally {
                }
            }
            byteBuffer.limit(limit);
            byteBuffer.position(position);
            this.f58136t.flip();
            this.f58137u.set(0, this.f58136t.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
            return;
        }
        throw new IOException("Annex-B video sample contains no NAL units");
    }

    public final void l(long j3) {
        if (j3 > this.f58130n) {
            this.f58130n = j3;
            if (this.f58138w) {
                return;
            }
            org.telegram.ui.web.a0 a0Var = this.f58122e;
            t0 t0Var = (t0) a0Var.f51074b;
            p0 p0Var = (p0) a0Var.f51075c;
            synchronized (t0Var.f58079g) {
                try {
                    long j10 = p0Var.f58011c;
                    long j11 = j3 - j10;
                    if (j11 > 0 && !p0Var.d) {
                        p0Var.f58011c = j3;
                        t0Var.f58082k.execute(new h4(t0Var, p0Var, j10, j11, 8));
                    }
                } finally {
                }
            }
        }
    }

    public final synchronized void n(MediaFormat mediaFormat, boolean z9) {
        MediaFormat mediaFormat2;
        String str;
        try {
            if (this.f58139x) {
                return;
            }
            if (this.f58125i != null) {
                if (z9) {
                    mediaFormat2 = this.f58126j;
                } else {
                    mediaFormat2 = this.f58127k;
                }
                if ((z9 && !m(mediaFormat2, mediaFormat, "csd-0", "csd-1")) || (!z9 && this.f58121c && !m(mediaFormat2, mediaFormat, "csd-0"))) {
                    StringBuilder sb2 = new StringBuilder();
                    if (z9) {
                        str = "Video";
                    } else {
                        str = "Audio";
                    }
                    sb2.append(str);
                    sb2.append(" codec configuration changed between segments");
                    throw new IOException(sb2.toString());
                }
                return;
            }
            if (z9) {
                this.f58126j = mediaFormat;
            } else if (this.f58121c) {
                this.f58127k = mediaFormat;
            }
            j();
        } finally {
        }
    }

    public final synchronized void q(boolean z9, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j3) {
        try {
            if (!this.f58139x) {
                if (!z9) {
                    if (this.f58121c) {
                    }
                }
                if (bufferInfo.size > 0) {
                    MediaCodec.BufferInfo b10 = b(z9, bufferInfo, j3);
                    if (this.f58125i == null) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        allocateDirect.put(byteBuffer).flip();
                        b10.offset = 0;
                        this.f58123f.add(new v(z9, allocateDirect, b10));
                        return;
                    }
                    r(z9, byteBuffer, b10);
                }
            }
        } finally {
        }
    }

    public final void r(boolean z9, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer byteBuffer2;
        MediaCodec.BufferInfo bufferInfo2;
        String str;
        String d;
        int i7;
        n nVar = this.d;
        String str2 = null;
        if (z9) {
            try {
                if (!this.v) {
                    str2 = e(byteBuffer, bufferInfo);
                }
                k(byteBuffer, bufferInfo);
                byteBuffer2 = this.f58136t;
                bufferInfo2 = this.f58137u;
                if (!this.v) {
                    this.v = true;
                    nVar.b("first video sample prepared: " + str2 + ", outputSize=" + bufferInfo2.size);
                }
            } catch (Exception e10) {
                if (z9) {
                    if (str2 == null) {
                        try {
                            d = e(byteBuffer, bufferInfo);
                        } catch (Exception unused) {
                            d = d(byteBuffer, bufferInfo);
                        }
                        str2 = d;
                    }
                } else {
                    str2 = d(byteBuffer, bufferInfo);
                }
                StringBuilder sb2 = new StringBuilder("MP4 sample write failed: track=");
                String str3 = "audio";
                if (!z9) {
                    str = "audio";
                } else {
                    str = "video";
                }
                nVar.a(f1.n(str, ", ", str2, sb2), e10);
                StringBuilder sb3 = new StringBuilder("Unable to write ");
                if (z9) {
                    str3 = "video";
                }
                throw new IOException(f1.n(str3, " MP4 sample: ", str2, sb3), e10);
            }
        } else {
            byteBuffer2 = byteBuffer;
            bufferInfo2 = bufferInfo;
        }
        MP4Builder mP4Builder = this.f58125i;
        if (z9) {
            i7 = this.f58128l;
        } else {
            i7 = this.f58129m;
        }
        long writeSampleData = mP4Builder.writeSampleData(i7, byteBuffer2, bufferInfo2, false);
        if (z9) {
            this.f58131o++;
        } else {
            this.f58132p++;
        }
        if (writeSampleData > 0) {
            l(writeSampleData);
        }
    }
}
