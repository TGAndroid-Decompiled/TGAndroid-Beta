package vi;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
import org.telegram.ui.bh1;
public final class w {
    public final File f50662a;
    public final int f50663b;
    public final boolean f50664c;
    public final n d;
    public final bh1 e;
    public MP4Builder f50667i;
    public MediaFormat f50668j;
    public MediaFormat f50669k;
    public long f50672n;
    public long f50673o;
    public long f50674p;
    public long f50676r;
    public int f50677s;
    public ByteBuffer f50678t;
    public boolean v;
    public boolean f50680w;
    public boolean f50681x;
    public final ArrayList f50665f = new ArrayList();
    public final v f50666g = new v(33333);
    public final v h = new v(21333);
    public int f50670l = -1;
    public int f50671m = -1;
    public long f50675q = Long.MIN_VALUE;
    public final MediaCodec.BufferInfo f50679u = new MediaCodec.BufferInfo();

    public w(File file, int i10, boolean z10, n nVar, bh1 bh1Var) {
        this.f50662a = file;
        this.f50663b = i10;
        this.f50664c = z10;
        this.d = nVar;
        this.e = bh1Var;
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
        int i10;
        int i11;
        String str;
        p(byteBuffer, bufferInfo);
        int i12 = bufferInfo.offset;
        int i13 = bufferInfo.size + i12;
        int f7 = f(byteBuffer, i12, i13);
        if (f7 == bufferInfo.offset) {
            i10 = o(byteBuffer, f7, i13);
            i11 = 0;
            while (f7 >= 0) {
                i11++;
                f7 = f(byteBuffer, o(byteBuffer, f7, i13) + f7, i13);
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d(byteBuffer, bufferInfo));
        sb2.append(", format=");
        if (i11 > 0) {
            str = "annex-b";
        } else {
            str = "avcc";
        }
        sb2.append(str);
        sb2.append(", nalCount=");
        sb2.append(i11);
        sb2.append(", firstPrefix=");
        sb2.append(i10);
        sb2.append(", head=");
        int i14 = bufferInfo.offset;
        StringBuilder sb3 = new StringBuilder();
        int min = Math.min(16, i13 - i14);
        for (int i15 = 0; i15 < min; i15++) {
            if (i15 > 0) {
                sb3.append(' ');
            }
            int i16 = byteBuffer.get(i14 + i15) & 255;
            if (i16 < 16) {
                sb3.append('0');
            }
            sb3.append(Integer.toHexString(i16));
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public static int f(ByteBuffer byteBuffer, int i10, int i11) {
        int i12;
        while (true) {
            int i13 = i10 + 2;
            if (i13 < i11) {
                if (byteBuffer.get(i10) != 0 || byteBuffer.get(i10 + 1) != 0 || (byteBuffer.get(i13) != 1 && ((i12 = i10 + 3) >= i11 || byteBuffer.get(i13) != 0 || byteBuffer.get(i12) != 1))) {
                    i10++;
                }
            } else {
                return -1;
            }
        }
        return i10;
    }

    public static boolean m(MediaFormat mediaFormat, MediaFormat mediaFormat2, String... strArr) {
        if (mediaFormat != null) {
            for (String str : strArr) {
                ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                ByteBuffer byteBuffer2 = mediaFormat2.getByteBuffer(str);
                if (byteBuffer != null && byteBuffer2 != null) {
                    int a2 = a(byteBuffer);
                    int a10 = a(byteBuffer2);
                    int limit = byteBuffer.limit() - a2;
                    if (limit == byteBuffer2.limit() - a10) {
                        for (int i10 = 0; i10 < limit; i10++) {
                            if (byteBuffer.get(a2 + i10) == byteBuffer2.get(a10 + i10)) {
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

    public static int o(ByteBuffer byteBuffer, int i10, int i11) {
        if (i10 + 3 < i11 && byteBuffer.get(i10 + 2) == 0) {
            return 4;
        }
        return 3;
    }

    public static void p(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i10 = bufferInfo.offset;
        int i11 = bufferInfo.size;
        long j10 = i10 + i11;
        if (i10 >= 0 && i11 >= 0 && j10 <= byteBuffer.limit()) {
            return;
        }
        throw new IOException("Invalid codec buffer range: offset=" + bufferInfo.offset + ", size=" + bufferInfo.size + ", position=" + byteBuffer.position() + ", limit=" + byteBuffer.limit() + ", capacity=" + byteBuffer.capacity());
    }

    public final MediaCodec.BufferInfo b(boolean z10, MediaCodec.BufferInfo bufferInfo, long j10) {
        v vVar;
        long max;
        v vVar2 = this.h;
        v vVar3 = this.f50666g;
        if (z10) {
            vVar = vVar3;
        } else {
            vVar = vVar2;
        }
        if (j10 < 0) {
            max = Math.max(0L, j10 + bufferInfo.presentationTimeUs);
        } else {
            if (this.f50675q != j10) {
                this.f50675q = j10;
                this.f50676r = Math.max(j10, Math.max(vVar3.a(), vVar2.a()));
                vVar3.f50656a = Long.MIN_VALUE;
                vVar3.f50657b = Long.MIN_VALUE;
                vVar2.f50656a = Long.MIN_VALUE;
                vVar2.f50657b = Long.MIN_VALUE;
            }
            if (vVar.f50656a == Long.MIN_VALUE) {
                vVar.f50656a = bufferInfo.presentationTimeUs;
            }
            max = this.f50676r + Math.max(0L, bufferInfo.presentationTimeUs - vVar.f50656a);
        }
        long j11 = bufferInfo.presentationTimeUs;
        long j12 = vVar.f50657b;
        if (j12 != Long.MIN_VALUE) {
            long j13 = j11 - j12;
            if (j13 > 0 && j13 < 1000000) {
                vVar.d = j13;
            }
        }
        vVar.f50657b = j11;
        vVar.f50658c = Math.max(vVar.f50658c, max);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, max, bufferInfo.flags);
        return bufferInfo2;
    }

    public final synchronized void c(File file) {
        if (this.f50667i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f50667i.finishMovie(file);
                n nVar = this.d;
                nVar.b("MP4 preview written: file=" + file.getName() + ", size=" + file.length() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
            } catch (Exception e) {
                throw new IOException("Unable to create preview MP4", e);
            }
        } else {
            throw new IOException("MP4 tracks are not initialized");
        }
    }

    public final synchronized void g() {
        if (this.f50681x) {
            return;
        }
        if (this.f50667i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f50667i.finishMovie();
                this.f50681x = true;
                l(this.f50662a.length());
                n nVar = this.d;
                nVar.b("MP4 finalized: file=" + this.f50662a.getName() + ", size=" + this.f50662a.length() + ", videoSamples=" + this.f50673o + ", audioSamples=" + this.f50674p + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                return;
            } catch (Exception e) {
                throw new IOException("Unable to finish MP4", e);
            }
        }
        throw new IOException("MP4 tracks are not initialized");
    }

    public final synchronized long h() {
        long a2;
        try {
            a2 = this.f50666g.a();
            if (this.f50664c) {
                a2 = Math.max(a2, this.h.a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a2 / 1000;
    }

    public final synchronized int i() {
        return this.f50677s;
    }

    public final void j() {
        ArrayList arrayList = this.f50665f;
        if (this.f50668j != null) {
            boolean z10 = this.f50664c;
            if (!z10 || this.f50669k != null) {
                Mp4Movie mp4Movie = new Mp4Movie();
                File file = this.f50662a;
                mp4Movie.setCacheFile(file);
                int i10 = this.f50663b;
                mp4Movie.setSize(i10, i10);
                try {
                    MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, true, false);
                    this.f50667i = createMovie;
                    this.f50670l = createMovie.addTrack(this.f50668j, false);
                    if (z10) {
                        this.f50671m = this.f50667i.addTrack(this.f50669k, true);
                    }
                    n nVar = this.d;
                    nVar.b("MP4 initialized: file=" + file.getName() + ", output=" + i10 + "x" + i10 + ", includeAudio=" + z10 + ", pendingSamples=" + arrayList.size());
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        u uVar = (u) arrayList.get(i11);
                        r(uVar.f50630a, uVar.f50631b, uVar.f50632c);
                    }
                    arrayList.clear();
                } catch (Exception e) {
                    throw new IOException("Unable to initialize MP4", e);
                }
            }
        }
    }

    public final void k(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int position;
        int limit;
        int i10;
        int i11;
        p(byteBuffer, bufferInfo);
        int i12 = bufferInfo.offset;
        int i13 = bufferInfo.size + i12;
        int f7 = f(byteBuffer, i12, i13);
        if (f7 != bufferInfo.offset) {
            int i14 = bufferInfo.size;
            ByteBuffer byteBuffer2 = this.f50678t;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i14) {
                this.f50678t = ByteBuffer.allocateDirect(i14);
            }
            this.f50678t.clear();
            position = byteBuffer.position();
            limit = byteBuffer.limit();
            try {
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                this.f50678t.put(byteBuffer);
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                this.f50678t.flip();
                this.f50679u.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                return;
            } finally {
            }
        }
        int i15 = 0;
        int i16 = f7;
        int i17 = 0;
        while (i16 >= 0) {
            int o10 = o(byteBuffer, i16, i13) + i16;
            i16 = f(byteBuffer, o10, i13);
            if (i16 < 0) {
                i11 = i13;
            } else {
                i11 = i16;
            }
            if (i11 > o10) {
                i15++;
                i17 = ((i11 + 4) - o10) + i17;
            }
        }
        if (i15 != 0) {
            ByteBuffer byteBuffer3 = this.f50678t;
            if (byteBuffer3 == null || byteBuffer3.capacity() < i17) {
                this.f50678t = ByteBuffer.allocateDirect(i17);
            }
            this.f50678t.clear();
            position = byteBuffer.position();
            limit = byteBuffer.limit();
            while (f7 >= 0) {
                try {
                    int o11 = f7 + o(byteBuffer, f7, i13);
                    int f10 = f(byteBuffer, o11, i13);
                    if (f10 < 0) {
                        i10 = i13;
                    } else {
                        i10 = f10;
                    }
                    if (i10 > o11) {
                        this.f50678t.putInt(i10 - o11);
                        byteBuffer.position(o11);
                        byteBuffer.limit(i10);
                        this.f50678t.put(byteBuffer);
                    }
                    f7 = f10;
                } finally {
                }
            }
            byteBuffer.limit(limit);
            byteBuffer.position(position);
            this.f50678t.flip();
            this.f50679u.set(0, this.f50678t.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
            return;
        }
        throw new IOException("Annex-B video sample contains no NAL units");
    }

    public final void l(long j10) {
        if (j10 > this.f50672n) {
            this.f50672n = j10;
            if (this.f50680w) {
                return;
            }
            bh1 bh1Var = this.e;
            u0 u0Var = (u0) bh1Var.f38044b;
            q0 q0Var = (q0) bh1Var.f38045c;
            synchronized (u0Var.f50638g) {
                try {
                    long j11 = q0Var.f50576c;
                    long j12 = j10 - j11;
                    if (j12 > 0 && !q0Var.d) {
                        q0Var.f50576c = j10;
                        u0Var.f50641k.execute(new a3.h0(u0Var, q0Var, j11, j12, 16));
                    }
                } finally {
                }
            }
        }
    }

    public final synchronized void n(MediaFormat mediaFormat, boolean z10) {
        MediaFormat mediaFormat2;
        String str;
        try {
            if (this.f50681x) {
                return;
            }
            if (this.f50667i != null) {
                if (z10) {
                    mediaFormat2 = this.f50668j;
                } else {
                    mediaFormat2 = this.f50669k;
                }
                if ((z10 && !m(mediaFormat2, mediaFormat, "csd-0", "csd-1")) || (!z10 && this.f50664c && !m(mediaFormat2, mediaFormat, "csd-0"))) {
                    StringBuilder sb2 = new StringBuilder();
                    if (z10) {
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
            if (z10) {
                this.f50668j = mediaFormat;
            } else if (this.f50664c) {
                this.f50669k = mediaFormat;
            }
            j();
        } finally {
        }
    }

    public final synchronized void q(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j10) {
        try {
            if (!this.f50681x) {
                if (!z10) {
                    if (this.f50664c) {
                    }
                }
                if (bufferInfo.size > 0) {
                    MediaCodec.BufferInfo b10 = b(z10, bufferInfo, j10);
                    if (this.f50667i == null) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        allocateDirect.put(byteBuffer).flip();
                        b10.offset = 0;
                        this.f50665f.add(new u(z10, allocateDirect, b10));
                        return;
                    }
                    r(z10, byteBuffer, b10);
                }
            }
        } finally {
        }
    }

    public final void r(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer byteBuffer2;
        MediaCodec.BufferInfo bufferInfo2;
        String str;
        String d;
        int i10;
        n nVar = this.d;
        String str2 = null;
        if (z10) {
            try {
                if (!this.v) {
                    str2 = e(byteBuffer, bufferInfo);
                }
                k(byteBuffer, bufferInfo);
                byteBuffer2 = this.f50678t;
                bufferInfo2 = this.f50679u;
                if (!this.v) {
                    this.v = true;
                    nVar.b("first video sample prepared: " + str2 + ", outputSize=" + bufferInfo2.size);
                }
            } catch (Exception e) {
                if (z10) {
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
                if (!z10) {
                    str = "audio";
                } else {
                    str = "video";
                }
                nVar.a(a1.g.q(str, ", ", str2, sb2), e);
                StringBuilder sb3 = new StringBuilder("Unable to write ");
                if (z10) {
                    str3 = "video";
                }
                throw new IOException(a1.g.q(str3, " MP4 sample: ", str2, sb3), e);
            }
        } else {
            byteBuffer2 = byteBuffer;
            bufferInfo2 = bufferInfo;
        }
        MP4Builder mP4Builder = this.f50667i;
        if (z10) {
            i10 = this.f50670l;
        } else {
            i10 = this.f50671m;
        }
        long writeSampleData = mP4Builder.writeSampleData(i10, byteBuffer2, bufferInfo2, false);
        if (z10) {
            this.f50673o++;
        } else {
            this.f50674p++;
        }
        if (writeSampleData > 0) {
            l(writeSampleData);
        }
    }
}
