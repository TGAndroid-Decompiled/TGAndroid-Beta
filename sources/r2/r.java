package r2;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import e2.j0;
import e9.e2;
import e9.m2;
import e9.y0;
import i2.l0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import k2.w0;
import org.telegram.ui.Wallet.t8;
public abstract class r extends i2.b {
    public static final byte[] Y0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public boolean B0;
    public int C0;
    public int D0;
    public int E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public final Context I;
    public long I0;
    public final k J;
    public boolean J0;
    public final i K;
    public boolean K0;
    public final float L;
    public boolean L0;
    public final h2.h M;
    public boolean M0;
    public final h2.h N;
    public i2.m N0;
    public final h2.h O;
    public i2.e O0;
    public final g P;
    public q P0;
    public final MediaCodec.BufferInfo Q;
    public long Q0;
    public final ArrayDeque R;
    public boolean R0;
    public final w0 S;
    public boolean S0;
    public final AtomicInteger T;
    public boolean T0;
    public b2.x U;
    public long U0;
    public b2.x V;
    public i2.c V0;
    public n2.g W;
    public i2.c W0;
    public n2.g X;
    public y0 X0;
    public l0 Y;
    public MediaCrypto Z;
    public final long f43861a0;
    public float f43862b0;
    public float f43863c0;
    public l f43864d0;
    public b2.x f43865e0;
    public MediaFormat f43866f0;
    public boolean f43867g0;
    public float f43868h0;
    public ArrayDeque f43869i0;
    public p f43870j0;
    public o f43871k0;
    public int f43872l0;
    public boolean m0;
    public boolean f43873n0;
    public boolean f43874o0;
    public boolean f43875p0;
    public boolean f43876q0;
    public long f43877r0;
    public boolean f43878s0;
    public long f43879t0;
    public int f43880u0;
    public int f43881v0;
    public ByteBuffer f43882w0;
    public boolean f43883x0;
    public boolean f43884y0;
    public boolean f43885z0;

    public r(Context context, int i10, k kVar, float f7) {
        super(i10);
        i iVar = i.f43839b;
        this.I = context.getApplicationContext();
        this.J = kVar;
        this.K = iVar;
        this.L = f7;
        this.T = new AtomicInteger();
        this.M = new h2.h(0, 0);
        this.N = new h2.h(0, 0);
        this.O = new h2.h(2, 0);
        ?? hVar = new h2.h(2, 0);
        hVar.v = 32;
        this.P = hVar;
        this.Q = new MediaCodec.BufferInfo();
        this.f43862b0 = 1.0f;
        this.f43863c0 = 1.0f;
        this.f43861a0 = -9223372036854775807L;
        this.R = new ArrayDeque();
        this.P0 = q.f43856g;
        hVar.b(0);
        hVar.f10326c.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.f14040a = c2.n.f4147a;
        obj.f14042c = 0;
        obj.f14041b = 2;
        this.S = obj;
        this.f43868h0 = -1.0f;
        this.f43872l0 = 0;
        this.C0 = 0;
        this.f43880u0 = -1;
        this.f43881v0 = -1;
        this.f43879t0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.f43877r0 = -9223372036854775807L;
        this.D0 = 0;
        this.E0 = 0;
        this.O0 = new Object();
        this.T0 = false;
        this.U0 = 0L;
        int i11 = y0.f8654c;
        this.X0 = e2.f8556s;
        i2.c cVar = i2.c.f10927b;
        this.V0 = cVar;
        this.W0 = cVar;
    }

    @Override
    public void A(float f7, float f10) {
        this.f43862b0 = f7;
        this.f43863c0 = f10;
        A0(this.f43865e0);
    }

    public final boolean A0(b2.x xVar) {
        if (this.f43864d0 != null && this.E0 != 3 && this.f10919n != 0) {
            float f7 = this.f43863c0;
            xVar.getClass();
            b2.x[] xVarArr = this.f10921s;
            xVarArr.getClass();
            float P = P(f7, xVar, xVarArr);
            float f10 = this.f43868h0;
            if (f10 != P) {
                if (P == -1.0f) {
                    if (this.F0) {
                        this.D0 = 1;
                        this.E0 = 3;
                        return false;
                    }
                    n0();
                    X();
                    return false;
                } else if (f10 != -1.0f || P > this.L) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", P);
                    l lVar = this.f43864d0;
                    lVar.getClass();
                    lVar.setParameters(bundle);
                    this.f43868h0 = P;
                }
            }
        }
        return true;
    }

    public final void B0() {
        n2.g gVar = this.X;
        gVar.getClass();
        h2.b h = gVar.h();
        if (h instanceof n2.s) {
            try {
                MediaCrypto mediaCrypto = this.Z;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((n2.s) h).f15975b);
            } catch (MediaCryptoException e) {
                throw d(e, this.U, false, 6006);
            }
        }
        s0(this.X);
        this.D0 = 0;
        this.E0 = 0;
    }

    @Override
    public final int C(b2.x xVar) {
        try {
            return z0(this.K, xVar);
        } catch (t e) {
            throw d(e, xVar, false, 4002);
        }
    }

    public final void C0(long j10) {
        b2.x xVar = (b2.x) this.P0.d.i(j10);
        if (xVar == null && this.R0 && this.f43866f0 != null) {
            xVar = (b2.x) this.P0.d.h();
        }
        if (xVar != null) {
            this.V = xVar;
        } else if (!this.f43867g0 || this.V == null) {
            return;
        }
        b2.x xVar2 = this.V;
        xVar2.getClass();
        f0(xVar2, this.f43866f0);
        this.f43867g0 = false;
        this.R0 = false;
    }

    @Override
    public final int D() {
        return 8;
    }

    public final void F(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.V0.f10928a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    public final boolean G(long r25, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.G(long, long):boolean");
    }

    public abstract i2.f H(o oVar, b2.x xVar, b2.x xVar2, boolean z10);

    public n I(IllegalStateException illegalStateException, o oVar) {
        return new n(illegalStateException, oVar);
    }

    public final boolean J() {
        if (this.F0) {
            this.D0 = 1;
            if (this.f43873n0) {
                this.E0 = 3;
                return false;
            }
            this.E0 = 2;
            return true;
        }
        B0();
        return true;
    }

    public final boolean K(long j10, long j11) {
        boolean z10;
        boolean z11;
        boolean z12;
        l lVar = this.f43864d0;
        lVar.getClass();
        int i10 = this.f43881v0;
        MediaCodec.BufferInfo bufferInfo = this.Q;
        if (i10 < 0) {
            int l4 = lVar.l(bufferInfo);
            if (l4 < 0) {
                if (l4 == -2) {
                    this.H0 = true;
                    l lVar2 = this.f43864d0;
                    lVar2.getClass();
                    MediaFormat outputFormat = lVar2.getOutputFormat();
                    if (this.f43872l0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.f43875p0 = true;
                        return true;
                    }
                    if (Build.VERSION.SDK_INT >= 29 && !this.X0.isEmpty()) {
                        i2.c cVar = new i2.c((HashMap) i2.c.a(outputFormat, this.X0).f14176b);
                        if (!cVar.equals(this.W0)) {
                            this.W0 = cVar;
                            c0(cVar);
                        }
                    }
                    this.f43866f0 = outputFormat;
                    this.f43867g0 = true;
                    return true;
                }
                if (this.f43876q0 && (this.J0 || this.D0 == 2)) {
                    k0();
                }
                long j12 = this.f43877r0;
                if (j12 != -9223372036854775807L) {
                    this.h.getClass();
                    if (j12 + 100 < System.currentTimeMillis()) {
                        k0();
                        return false;
                    }
                }
                return false;
            }
            bufferInfo.presentationTimeUs -= this.U0;
            if (this.f43875p0) {
                this.f43875p0 = false;
                lVar.f(l4);
                return true;
            } else if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                k0();
                return false;
            } else {
                this.f43881v0 = l4;
                ByteBuffer outputBuffer = lVar.getOutputBuffer(l4);
                this.f43882w0 = outputBuffer;
                if (outputBuffer != null) {
                    outputBuffer.position(bufferInfo.offset);
                    this.f43882w0.limit(bufferInfo.offset + bufferInfo.size);
                }
                C0(bufferInfo.presentationTimeUs);
            }
        }
        if (!this.T0 && bufferInfo.presentationTimeUs >= this.f10922w) {
            z10 = false;
        } else {
            z10 = true;
        }
        long j13 = this.P0.f43860f;
        if (j13 != -9223372036854775807L && j13 <= bufferInfo.presentationTimeUs) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f43883x0 = z11;
        ByteBuffer byteBuffer = this.f43882w0;
        int i11 = this.f43881v0;
        int i12 = bufferInfo.flags;
        long j14 = bufferInfo.presentationTimeUs;
        b2.x xVar = this.V;
        xVar.getClass();
        if (!l0(j10, j11, lVar, byteBuffer, i11, i12, 1, j14, z10, z11, xVar)) {
            return false;
        }
        h0(bufferInfo.presentationTimeUs);
        if ((bufferInfo.flags & 4) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && this.G0 && this.f43883x0) {
            this.h.getClass();
            this.f43877r0 = System.currentTimeMillis();
        }
        this.f43881v0 = -1;
        this.f43882w0 = null;
        if (!z12) {
            return true;
        }
        k0();
        return false;
    }

    public final boolean L() {
        l lVar = this.f43864d0;
        if (lVar != null && this.D0 != 2 && !this.J0) {
            int i10 = this.f43880u0;
            h2.h hVar = this.N;
            if (i10 < 0) {
                int k10 = lVar.k();
                this.f43880u0 = k10;
                if (k10 >= 0) {
                    hVar.f10326c = lVar.getInputBuffer(k10);
                    hVar.clear();
                }
            }
            if (this.D0 == 1) {
                if (!this.f43876q0) {
                    this.G0 = true;
                    lVar.b(0L, this.f43880u0, 0, 4);
                    this.f43880u0 = -1;
                    hVar.f10326c = null;
                }
                this.D0 = 2;
                return false;
            } else if (this.f43874o0) {
                this.f43874o0 = false;
                ByteBuffer byteBuffer = hVar.f10326c;
                byteBuffer.getClass();
                byteBuffer.put(Y0);
                lVar.b(0L, this.f43880u0, 38, 0);
                this.f43880u0 = -1;
                hVar.f10326c = null;
                this.F0 = true;
                return true;
            } else {
                if (this.C0 == 1) {
                    int i11 = 0;
                    while (true) {
                        b2.x xVar = this.f43865e0;
                        xVar.getClass();
                        if (i11 >= xVar.v.size()) {
                            break;
                        }
                        ByteBuffer byteBuffer2 = hVar.f10326c;
                        byteBuffer2.getClass();
                        byteBuffer2.put((byte[]) this.f43865e0.v.get(i11));
                        i11++;
                    }
                    this.C0 = 2;
                }
                ByteBuffer byteBuffer3 = hVar.f10326c;
                byteBuffer3.getClass();
                int position = byteBuffer3.position();
                qf.b bVar = this.f10917c;
                bVar.y();
                try {
                    lVar.g(new t8(22, this, bVar));
                    int i12 = this.T.get();
                    if (i12 == -3) {
                        if (k()) {
                            S().f43860f = this.I0;
                            return false;
                        }
                    } else if (i12 == -5) {
                        if (this.C0 == 2) {
                            hVar.clear();
                            this.C0 = 1;
                        }
                        e0(bVar);
                        return true;
                    } else if (hVar.isEndOfStream()) {
                        S().f43860f = this.I0;
                        if (this.C0 == 2) {
                            hVar.clear();
                            this.C0 = 1;
                        }
                        this.J0 = true;
                        if (!this.F0) {
                            k0();
                            return false;
                        } else if (!this.f43876q0) {
                            this.G0 = true;
                            lVar.b(0L, this.f43880u0, 0, 4);
                            this.f43880u0 = -1;
                            hVar.f10326c = null;
                            return false;
                        }
                    } else {
                        if (!this.F0 && !hVar.isKeyFrame()) {
                            hVar.clear();
                            if (this.C0 == 2) {
                                this.C0 = 1;
                                return true;
                            }
                        } else {
                            long j10 = hVar.e;
                            if (!u0(hVar)) {
                                boolean flag = hVar.getFlag(1073741824);
                                if (flag) {
                                    h2.d dVar = hVar.f10325b;
                                    if (position == 0) {
                                        dVar.getClass();
                                    } else {
                                        if (dVar.d == null) {
                                            int[] iArr = new int[1];
                                            dVar.d = iArr;
                                            dVar.f10322i.numBytesOfClearData = iArr;
                                        }
                                        int[] iArr2 = dVar.d;
                                        iArr2[0] = iArr2[0] + position;
                                    }
                                }
                                if (this.L0) {
                                    q S = S();
                                    j0 j0Var = S.d;
                                    b2.x xVar2 = this.U;
                                    xVar2.getClass();
                                    j0Var.a(xVar2, j10);
                                    S.e = true;
                                    this.L0 = false;
                                }
                                this.I0 = Math.max(this.I0, j10);
                                if (k() || hVar.isLastSample()) {
                                    S().f43860f = this.I0;
                                }
                                hVar.e();
                                if (hVar.hasSupplementalData()) {
                                    U(hVar);
                                }
                                if (this.T0) {
                                    long j11 = this.I0;
                                    if (j10 <= j11) {
                                        this.U0 = (j11 - j10) + 1 + this.U0;
                                    }
                                    this.I0 = j10;
                                    this.T0 = false;
                                }
                                j0(hVar);
                                int O = O(hVar);
                                long j12 = j10 + this.U0;
                                if (flag) {
                                    lVar.e(this.f43880u0, hVar.f10325b, j12, O);
                                } else {
                                    int i13 = this.f43880u0;
                                    ByteBuffer byteBuffer4 = hVar.f10326c;
                                    byteBuffer4.getClass();
                                    lVar.b(j12, i13, byteBuffer4.limit(), O);
                                }
                                this.f43880u0 = -1;
                                hVar.f10326c = null;
                                this.F0 = true;
                                this.C0 = 0;
                                this.O0.f10942c++;
                                return true;
                            }
                        }
                        return true;
                    }
                } catch (h2.g e) {
                    a0(e);
                    m0(0);
                    M();
                    return true;
                }
            }
        }
        return false;
    }

    public final void M() {
        try {
            l lVar = this.f43864d0;
            lVar.getClass();
            lVar.flush();
        } finally {
            q0();
        }
    }

    public final List N(boolean z10) {
        b2.x xVar = this.U;
        xVar.getClass();
        i iVar = this.K;
        ArrayList Q = Q(iVar, xVar, z10);
        if (Q.isEmpty() && z10) {
            ArrayList Q2 = Q(iVar, xVar, false);
            if (!Q2.isEmpty()) {
                e2.a.l("MediaCodecRenderer", "Drm session requires secure decoder for " + xVar.f2519s + ", but no secure decoder available. Trying to proceed with " + Q2 + ".");
            }
            return Q2;
        }
        return Q;
    }

    public int O(h2.h hVar) {
        return 0;
    }

    public abstract float P(float f7, b2.x xVar, b2.x[] xVarArr);

    public abstract ArrayList Q(i iVar, b2.x xVar, boolean z10);

    public long R(long j10, long j11, boolean z10) {
        return super.g(j10, j11);
    }

    public final q S() {
        ArrayDeque arrayDeque = this.R;
        if (!arrayDeque.isEmpty()) {
            return (q) arrayDeque.getLast();
        }
        return this.P0;
    }

    public abstract com.google.firebase.messaging.m T(o oVar, b2.x xVar, MediaCrypto mediaCrypto, float f7);

    public abstract void U(h2.h hVar);

    public final void V(r2.o r13, android.media.MediaCrypto r14) {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.V(r2.o, android.media.MediaCrypto):void");
    }

    public final boolean W(long j10, long j11) {
        if (j11 < j10) {
            b2.x xVar = this.V;
            if (xVar == null || !Objects.equals(xVar.f2519s, "audio/opus") || j10 - j11 > 80000) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void X() {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.X():void");
    }

    public final void Y(MediaCrypto mediaCrypto, boolean z10) {
        String str;
        b2.x xVar = this.U;
        xVar.getClass();
        if (this.f43869i0 == null) {
            try {
                List N = N(z10);
                this.f43869i0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) N;
                if (!arrayList.isEmpty()) {
                    this.f43869i0.add((o) arrayList.get(0));
                }
                this.f43870j0 = null;
            } catch (t e) {
                throw new p(xVar, e, z10, -49998);
            }
        }
        if (!this.f43869i0.isEmpty()) {
            ArrayDeque arrayDeque = this.f43869i0;
            arrayDeque.getClass();
            while (this.f43864d0 == null) {
                o oVar = (o) arrayDeque.peekFirst();
                oVar.getClass();
                if (!Z(xVar) || !w0(oVar)) {
                    return;
                }
                try {
                    V(oVar, mediaCrypto);
                } catch (Exception e7) {
                    e2.a.m("MediaCodecRenderer", "Failed to initialize decoder: " + oVar, e7);
                    arrayDeque.removeFirst();
                    String str2 = "Decoder init failed: " + oVar.f43844a + ", " + xVar;
                    String str3 = xVar.f2519s;
                    if (e7 instanceof MediaCodec.CodecException) {
                        str = ((MediaCodec.CodecException) e7).getDiagnosticInfo();
                    } else {
                        str = null;
                    }
                    p pVar = new p(str2, e7, str3, z10, oVar, str);
                    a0(pVar);
                    p pVar2 = this.f43870j0;
                    if (pVar2 == null) {
                        this.f43870j0 = pVar;
                    } else {
                        this.f43870j0 = new p(pVar2.getMessage(), pVar2.getCause(), pVar2.f43853a, pVar2.f43854b, pVar2.f43855c, pVar2.d);
                    }
                    if (arrayDeque.isEmpty()) {
                        throw this.f43870j0;
                    }
                }
            }
            this.f43869i0 = null;
            return;
        }
        throw new p(xVar, null, z10, -49999);
    }

    public boolean Z(b2.x xVar) {
        return true;
    }

    public abstract void a0(Exception exc);

    public abstract void b0(long j10, long j11, String str);

    @Override
    public void c(int i10, Object obj) {
        int i11;
        if (i10 != 11) {
            if (i10 != 21) {
                if (i10 == 22 && (i11 = Build.VERSION.SDK_INT) >= 29) {
                    obj.getClass();
                    y0 y0Var = (y0) obj;
                    if (!this.X0.equals(y0Var)) {
                        if (i11 >= 31) {
                            HashSet hashSet = new HashSet(y0Var);
                            HashSet hashSet2 = new HashSet();
                            m2 it = this.X0.iterator();
                            while (it.hasNext()) {
                                String str = (String) it.next();
                                if (!hashSet.remove(str)) {
                                    hashSet2.add(str);
                                }
                            }
                            l lVar = this.f43864d0;
                            if (lVar != null) {
                                if (!hashSet2.isEmpty()) {
                                    lVar.q(new ArrayList(hashSet2));
                                }
                                if (!hashSet.isEmpty()) {
                                    lVar.p(new ArrayList(hashSet));
                                }
                            }
                        }
                        this.X0 = y0Var;
                        return;
                    }
                    return;
                }
                return;
            } else if (Build.VERSION.SDK_INT >= 29) {
                obj.getClass();
                i2.c cVar = (i2.c) obj;
                this.V0 = cVar;
                l lVar2 = this.f43864d0;
                if (lVar2 != null) {
                    Bundle bundle = new Bundle();
                    for (Map.Entry entry : cVar.f10928a.entrySet()) {
                        String str2 = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value != null) {
                            if (value instanceof Integer) {
                                bundle.putInt(str2, ((Integer) value).intValue());
                            } else if (value instanceof Long) {
                                bundle.putLong(str2, ((Long) value).longValue());
                            } else if (value instanceof Float) {
                                bundle.putFloat(str2, ((Float) value).floatValue());
                            } else if (value instanceof String) {
                                bundle.putString(str2, (String) value);
                            } else if (value instanceof ByteBuffer) {
                                ByteBuffer byteBuffer = (ByteBuffer) value;
                                byte[] bArr = new byte[byteBuffer.remaining()];
                                byteBuffer.duplicate().get(bArr);
                                bundle.putByteArray(str2, bArr);
                            }
                        }
                    }
                    lVar2.setParameters(bundle);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        l0 l0Var = (l0) obj;
        l0Var.getClass();
        this.Y = l0Var;
    }

    public abstract void c0(i2.c cVar);

    public abstract void d0(String str);

    public i2.f e0(qf.b r15) {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.e0(qf.b):i2.f");
    }

    public abstract void f0(b2.x xVar, MediaFormat mediaFormat);

    @Override
    public final long g(long j10, long j11) {
        return R(j10, j11, this.f43878s0);
    }

    public void h0(long j10) {
        this.Q0 = j10;
        while (true) {
            ArrayDeque arrayDeque = this.R;
            if (!arrayDeque.isEmpty() && j10 >= ((q) arrayDeque.peek()).f43857a) {
                q qVar = (q) arrayDeque.poll();
                qVar.getClass();
                t0(qVar);
                i0();
            } else {
                return;
            }
        }
    }

    public abstract void i0();

    public final void k0() {
        int i10 = this.E0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.K0 = true;
                    o0();
                    return;
                }
                n0();
                X();
                return;
            }
            M();
            B0();
            return;
        }
        M();
    }

    public abstract boolean l0(long j10, long j11, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, b2.x xVar);

    public final boolean m0(int i10) {
        qf.b bVar = this.f10917c;
        bVar.y();
        h2.h hVar = this.M;
        hVar.clear();
        int w9 = w(bVar, hVar, i10 | 4);
        if (w9 == -5) {
            e0(bVar);
            return true;
        } else if (w9 == -4 && hVar.isEndOfStream()) {
            this.J0 = true;
            k0();
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void n() {
        this.U = null;
        t0(q.f43856g);
        this.R.clear();
        if (this.f43884y0) {
            this.f43884y0 = false;
            p0();
        } else if (this.f43864d0 == null) {
        } else {
            if (x0()) {
                n0();
            } else if (v0()) {
                M();
            } else {
                this.T0 = true;
            }
        }
    }

    public final void n0() {
        try {
            l lVar = this.f43864d0;
            if (lVar != null) {
                lVar.release();
                this.O0.f10941b++;
                o oVar = this.f43871k0;
                oVar.getClass();
                d0(oVar.f43844a);
            }
            this.f43864d0 = null;
            try {
                MediaCrypto mediaCrypto = this.Z;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f43864d0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.Z;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public abstract void o0();

    @Override
    public void p(long j10, boolean z10, boolean z11) {
        ArrayDeque arrayDeque = this.R;
        if (!arrayDeque.isEmpty()) {
            this.P0 = (q) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (!z11) {
            return;
        }
        this.J0 = false;
        this.K0 = false;
        this.M0 = false;
        if (this.f43884y0) {
            p0();
        } else if (this.f43864d0 != null) {
            if (x0()) {
                n0();
                X();
            } else if (v0()) {
                M();
            } else {
                this.T0 = true;
            }
        }
        if (this.P0.d.m() > 0) {
            this.L0 = true;
        }
        this.P0.d.c();
        this.P0.e = false;
    }

    public final void p0() {
        this.I0 = -9223372036854775807L;
        S().f43860f = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.A0 = false;
        this.P.clear();
        this.O.clear();
        this.f43885z0 = false;
        w0 w0Var = this.S;
        w0Var.getClass();
        w0Var.f14040a = c2.n.f4147a;
        w0Var.f14042c = 0;
        w0Var.f14041b = 2;
    }

    public void q0() {
        this.f43880u0 = -1;
        this.N.f10326c = null;
        this.f43881v0 = -1;
        this.f43882w0 = null;
        this.I0 = -9223372036854775807L;
        S().f43860f = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.f43879t0 = -9223372036854775807L;
        this.G0 = false;
        this.f43877r0 = -9223372036854775807L;
        this.F0 = false;
        this.f43874o0 = false;
        this.f43875p0 = false;
        this.f43883x0 = false;
        this.D0 = 0;
        this.E0 = 0;
        this.C0 = this.B0 ? 1 : 0;
        this.T0 = false;
        this.U0 = 0L;
    }

    public final void r0() {
        q0();
        this.N0 = null;
        this.f43869i0 = null;
        this.f43871k0 = null;
        this.f43865e0 = null;
        this.f43866f0 = null;
        this.f43867g0 = false;
        this.H0 = false;
        this.f43868h0 = -1.0f;
        this.f43872l0 = 0;
        this.m0 = false;
        this.f43873n0 = false;
        this.f43876q0 = false;
        this.f43878s0 = false;
        this.B0 = false;
        this.C0 = 0;
    }

    public final void s0(n2.g gVar) {
        i2.d.A(this.W, gVar);
        this.W = gVar;
    }

    public final void t0(q qVar) {
        this.P0 = qVar;
        if (qVar.f43859c != -9223372036854775807L) {
            this.R0 = true;
            g0();
        }
    }

    @Override
    public void u(b2.x[] r12, long r13, long r15, u2.g0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.u(b2.x[], long, long, u2.g0):void");
    }

    public boolean u0(h2.h hVar) {
        return false;
    }

    public boolean v0() {
        return true;
    }

    public boolean w0(o oVar) {
        return true;
    }

    @Override
    public void x(long r12, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.x(long, long):void");
    }

    public boolean x0() {
        int i10 = this.E0;
        if (i10 == 3 || ((this.m0 && !this.H0) || (this.f43873n0 && this.G0))) {
            return true;
        }
        if (i10 == 2) {
            try {
                B0();
                return false;
            } catch (i2.m e) {
                e2.a.m("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                return true;
            }
        }
        return false;
    }

    public boolean y0(b2.x xVar) {
        return false;
    }

    public abstract int z0(i iVar, b2.x xVar);

    public void g0() {
    }

    public void j0(h2.h hVar) {
    }
}
