package r2;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import e9.e2;
import e9.m2;
import e9.y0;
import i2.j0;
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
import k2.x0;
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
    public i2.l N0;
    public final h2.h O;
    public i2.d O0;
    public final g P;
    public q P0;
    public final MediaCodec.BufferInfo Q;
    public long Q0;
    public final ArrayDeque R;
    public boolean R0;
    public final x0 S;
    public boolean S0;
    public final AtomicInteger T;
    public boolean T0;
    public b2.w U;
    public long U0;
    public b2.w V;
    public i2.c V0;
    public n2.h W;
    public i2.c W0;
    public n2.h X;
    public y0 X0;
    public j0 Y;
    public MediaCrypto Z;
    public final long f44976a0;
    public float f44977b0;
    public float f44978c0;
    public l f44979d0;
    public b2.w f44980e0;
    public MediaFormat f44981f0;
    public boolean f44982g0;
    public float f44983h0;
    public ArrayDeque f44984i0;
    public p f44985j0;
    public o f44986k0;
    public int f44987l0;
    public boolean m0;
    public boolean f44988n0;
    public boolean f44989o0;
    public boolean f44990p0;
    public boolean f44991q0;
    public long f44992r0;
    public boolean f44993s0;
    public long f44994t0;
    public int f44995u0;
    public int f44996v0;
    public ByteBuffer f44997w0;
    public boolean f44998x0;
    public boolean f44999y0;
    public boolean f45000z0;

    public r(Context context, int i10, k kVar, float f7) {
        super(i10);
        i iVar = i.f44954b;
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
        this.f44977b0 = 1.0f;
        this.f44978c0 = 1.0f;
        this.f44976a0 = -9223372036854775807L;
        this.R = new ArrayDeque();
        this.P0 = q.f44971g;
        hVar.b(0);
        hVar.f11635c.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.f14839a = c2.n.f4521a;
        obj.f14841c = 0;
        obj.f14840b = 2;
        this.S = obj;
        this.f44983h0 = -1.0f;
        this.f44987l0 = 0;
        this.C0 = 0;
        this.f44995u0 = -1;
        this.f44996v0 = -1;
        this.f44994t0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.f44992r0 = -9223372036854775807L;
        this.D0 = 0;
        this.E0 = 0;
        this.O0 = new Object();
        this.T0 = false;
        this.U0 = 0L;
        int i11 = y0.f8538c;
        this.X0 = e2.f8440s;
        i2.c cVar = i2.c.f12328b;
        this.V0 = cVar;
        this.W0 = cVar;
    }

    @Override
    public void A(float f7, float f10) {
        this.f44977b0 = f7;
        this.f44978c0 = f10;
        A0(this.f44980e0);
    }

    public final boolean A0(b2.w wVar) {
        if (this.f44979d0 != null && this.E0 != 3 && this.f12317n != 0) {
            float f7 = this.f44978c0;
            wVar.getClass();
            b2.w[] wVarArr = this.f12319s;
            wVarArr.getClass();
            float P = P(f7, wVar, wVarArr);
            float f10 = this.f44983h0;
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
                    l lVar = this.f44979d0;
                    lVar.getClass();
                    lVar.setParameters(bundle);
                    this.f44983h0 = P;
                }
            }
        }
        return true;
    }

    public final void B0() {
        n2.h hVar = this.X;
        hVar.getClass();
        h2.b h = hVar.h();
        if (h instanceof n2.s) {
            try {
                MediaCrypto mediaCrypto = this.Z;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((n2.s) h).f17065b);
            } catch (MediaCryptoException e) {
                throw d(e, this.U, false, 6006);
            }
        }
        s0(this.X);
        this.D0 = 0;
        this.E0 = 0;
    }

    @Override
    public final int C(b2.w wVar) {
        try {
            return z0(this.K, wVar);
        } catch (t e) {
            throw d(e, wVar, false, 4002);
        }
    }

    public final void C0(long j10) {
        b2.w wVar = (b2.w) this.P0.d.g(j10);
        if (wVar == null && this.R0 && this.f44981f0 != null) {
            wVar = (b2.w) this.P0.d.f();
        }
        if (wVar != null) {
            this.V = wVar;
        } else if (!this.f44982g0 || this.V == null) {
            return;
        }
        b2.w wVar2 = this.V;
        wVar2.getClass();
        f0(wVar2, this.f44981f0);
        this.f44982g0 = false;
        this.R0 = false;
    }

    @Override
    public final int D() {
        return 8;
    }

    public final void F(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.V0.f12329a.entrySet()) {
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

    public abstract i2.e H(o oVar, b2.w wVar, b2.w wVar2, boolean z10);

    public n I(IllegalStateException illegalStateException, o oVar) {
        return new n(illegalStateException, oVar);
    }

    public final boolean J() {
        if (this.F0) {
            this.D0 = 1;
            if (this.f44988n0) {
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
        l lVar = this.f44979d0;
        lVar.getClass();
        int i10 = this.f44996v0;
        MediaCodec.BufferInfo bufferInfo = this.Q;
        if (i10 < 0) {
            int j12 = lVar.j(bufferInfo);
            if (j12 < 0) {
                if (j12 == -2) {
                    this.H0 = true;
                    l lVar2 = this.f44979d0;
                    lVar2.getClass();
                    MediaFormat outputFormat = lVar2.getOutputFormat();
                    if (this.f44987l0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.f44990p0 = true;
                        return true;
                    }
                    if (Build.VERSION.SDK_INT >= 29 && !this.X0.isEmpty()) {
                        i2.c cVar = new i2.c((HashMap) i2.c.a(outputFormat, this.X0).f634b);
                        if (!cVar.equals(this.W0)) {
                            this.W0 = cVar;
                            c0(cVar);
                        }
                    }
                    this.f44981f0 = outputFormat;
                    this.f44982g0 = true;
                    return true;
                }
                if (this.f44991q0 && (this.J0 || this.D0 == 2)) {
                    k0();
                }
                long j13 = this.f44992r0;
                if (j13 != -9223372036854775807L) {
                    this.h.getClass();
                    if (j13 + 100 < System.currentTimeMillis()) {
                        k0();
                        return false;
                    }
                }
                return false;
            }
            bufferInfo.presentationTimeUs -= this.U0;
            if (this.f44990p0) {
                this.f44990p0 = false;
                lVar.d(j12);
                return true;
            } else if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                k0();
                return false;
            } else {
                this.f44996v0 = j12;
                ByteBuffer outputBuffer = lVar.getOutputBuffer(j12);
                this.f44997w0 = outputBuffer;
                if (outputBuffer != null) {
                    outputBuffer.position(bufferInfo.offset);
                    this.f44997w0.limit(bufferInfo.offset + bufferInfo.size);
                }
                C0(bufferInfo.presentationTimeUs);
            }
        }
        if (!this.T0 && bufferInfo.presentationTimeUs >= this.f12320w) {
            z10 = false;
        } else {
            z10 = true;
        }
        long j14 = this.P0.f44975f;
        if (j14 != -9223372036854775807L && j14 <= bufferInfo.presentationTimeUs) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f44998x0 = z11;
        ByteBuffer byteBuffer = this.f44997w0;
        int i11 = this.f44996v0;
        int i12 = bufferInfo.flags;
        long j15 = bufferInfo.presentationTimeUs;
        b2.w wVar = this.V;
        wVar.getClass();
        if (!l0(j10, j11, lVar, byteBuffer, i11, i12, 1, j15, z10, z11, wVar)) {
            return false;
        }
        h0(bufferInfo.presentationTimeUs);
        if ((bufferInfo.flags & 4) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && this.G0 && this.f44998x0) {
            this.h.getClass();
            this.f44992r0 = System.currentTimeMillis();
        }
        this.f44996v0 = -1;
        this.f44997w0 = null;
        if (!z12) {
            return true;
        }
        k0();
        return false;
    }

    public final boolean L() {
        l lVar = this.f44979d0;
        if (lVar != null && this.D0 != 2 && !this.J0) {
            int i10 = this.f44995u0;
            h2.h hVar = this.N;
            if (i10 < 0) {
                int i11 = lVar.i();
                this.f44995u0 = i11;
                if (i11 >= 0) {
                    hVar.f11635c = lVar.getInputBuffer(i11);
                    hVar.clear();
                }
            }
            if (this.D0 == 1) {
                if (!this.f44991q0) {
                    this.G0 = true;
                    lVar.a(0L, this.f44995u0, 0, 4);
                    this.f44995u0 = -1;
                    hVar.f11635c = null;
                }
                this.D0 = 2;
                return false;
            } else if (this.f44989o0) {
                this.f44989o0 = false;
                ByteBuffer byteBuffer = hVar.f11635c;
                byteBuffer.getClass();
                byteBuffer.put(Y0);
                lVar.a(0L, this.f44995u0, 38, 0);
                this.f44995u0 = -1;
                hVar.f11635c = null;
                this.F0 = true;
                return true;
            } else {
                if (this.C0 == 1) {
                    int i12 = 0;
                    while (true) {
                        b2.w wVar = this.f44980e0;
                        wVar.getClass();
                        if (i12 >= wVar.v.size()) {
                            break;
                        }
                        ByteBuffer byteBuffer2 = hVar.f11635c;
                        byteBuffer2.getClass();
                        byteBuffer2.put((byte[]) this.f44980e0.v.get(i12));
                        i12++;
                    }
                    this.C0 = 2;
                }
                ByteBuffer byteBuffer3 = hVar.f11635c;
                byteBuffer3.getClass();
                int position = byteBuffer3.position();
                qf.b bVar = this.f12315c;
                bVar.z();
                try {
                    lVar.f(new p2.b(8, this, bVar));
                    int i13 = this.T.get();
                    if (i13 == -3) {
                        if (k()) {
                            S().f44975f = this.I0;
                            return false;
                        }
                    } else if (i13 == -5) {
                        if (this.C0 == 2) {
                            hVar.clear();
                            this.C0 = 1;
                        }
                        e0(bVar);
                        return true;
                    } else if (hVar.isEndOfStream()) {
                        S().f44975f = this.I0;
                        if (this.C0 == 2) {
                            hVar.clear();
                            this.C0 = 1;
                        }
                        this.J0 = true;
                        if (!this.F0) {
                            k0();
                            return false;
                        } else if (!this.f44991q0) {
                            this.G0 = true;
                            lVar.a(0L, this.f44995u0, 0, 4);
                            this.f44995u0 = -1;
                            hVar.f11635c = null;
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
                                    h2.d dVar = hVar.f11634b;
                                    if (position == 0) {
                                        dVar.getClass();
                                    } else {
                                        if (dVar.d == null) {
                                            int[] iArr = new int[1];
                                            dVar.d = iArr;
                                            dVar.f11631i.numBytesOfClearData = iArr;
                                        }
                                        int[] iArr2 = dVar.d;
                                        iArr2[0] = iArr2[0] + position;
                                    }
                                }
                                if (this.L0) {
                                    q S = S();
                                    e2.j0 j0Var = S.d;
                                    b2.w wVar2 = this.U;
                                    wVar2.getClass();
                                    j0Var.a(wVar2, j10);
                                    S.e = true;
                                    this.L0 = false;
                                }
                                this.I0 = Math.max(this.I0, j10);
                                if (k() || hVar.isLastSample()) {
                                    S().f44975f = this.I0;
                                }
                                hVar.f();
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
                                    lVar.b(this.f44995u0, hVar.f11634b, j12, O);
                                } else {
                                    int i14 = this.f44995u0;
                                    ByteBuffer byteBuffer4 = hVar.f11635c;
                                    byteBuffer4.getClass();
                                    lVar.a(j12, i14, byteBuffer4.limit(), O);
                                }
                                this.f44995u0 = -1;
                                hVar.f11635c = null;
                                this.F0 = true;
                                this.C0 = 0;
                                this.O0.f12338c++;
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
            l lVar = this.f44979d0;
            lVar.getClass();
            lVar.flush();
        } finally {
            q0();
        }
    }

    public final List N(boolean z10) {
        b2.w wVar = this.U;
        wVar.getClass();
        i iVar = this.K;
        ArrayList Q = Q(iVar, wVar, z10);
        if (Q.isEmpty() && z10) {
            ArrayList Q2 = Q(iVar, wVar, false);
            if (!Q2.isEmpty()) {
                e2.a.l("MediaCodecRenderer", "Drm session requires secure decoder for " + wVar.f4131s + ", but no secure decoder available. Trying to proceed with " + Q2 + ".");
            }
            return Q2;
        }
        return Q;
    }

    public int O(h2.h hVar) {
        return 0;
    }

    public abstract float P(float f7, b2.w wVar, b2.w[] wVarArr);

    public abstract ArrayList Q(i iVar, b2.w wVar, boolean z10);

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

    public abstract com.google.firebase.messaging.l T(o oVar, b2.w wVar, MediaCrypto mediaCrypto, float f7);

    public abstract void U(h2.h hVar);

    public final void V(r2.o r13, android.media.MediaCrypto r14) {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.V(r2.o, android.media.MediaCrypto):void");
    }

    public final boolean W(long j10, long j11) {
        if (j11 < j10) {
            b2.w wVar = this.V;
            if (wVar == null || !Objects.equals(wVar.f4131s, "audio/opus") || j10 - j11 > 80000) {
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
        b2.w wVar = this.U;
        wVar.getClass();
        if (this.f44984i0 == null) {
            try {
                List N = N(z10);
                this.f44984i0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) N;
                if (!arrayList.isEmpty()) {
                    this.f44984i0.add((o) arrayList.get(0));
                }
                this.f44985j0 = null;
            } catch (t e) {
                throw new p(wVar, e, z10, -49998);
            }
        }
        if (!this.f44984i0.isEmpty()) {
            ArrayDeque arrayDeque = this.f44984i0;
            arrayDeque.getClass();
            while (this.f44979d0 == null) {
                o oVar = (o) arrayDeque.peekFirst();
                oVar.getClass();
                if (!Z(wVar) || !w0(oVar)) {
                    return;
                }
                try {
                    V(oVar, mediaCrypto);
                } catch (Exception e7) {
                    e2.a.m("MediaCodecRenderer", "Failed to initialize decoder: " + oVar, e7);
                    arrayDeque.removeFirst();
                    String str2 = "Decoder init failed: " + oVar.f44959a + ", " + wVar;
                    String str3 = wVar.f4131s;
                    if (e7 instanceof MediaCodec.CodecException) {
                        str = ((MediaCodec.CodecException) e7).getDiagnosticInfo();
                    } else {
                        str = null;
                    }
                    p pVar = new p(str2, e7, str3, z10, oVar, str);
                    a0(pVar);
                    p pVar2 = this.f44985j0;
                    if (pVar2 == null) {
                        this.f44985j0 = pVar;
                    } else {
                        this.f44985j0 = new p(pVar2.getMessage(), pVar2.getCause(), pVar2.f44968a, pVar2.f44969b, pVar2.f44970c, pVar2.d);
                    }
                    if (arrayDeque.isEmpty()) {
                        throw this.f44985j0;
                    }
                }
            }
            this.f44984i0 = null;
            return;
        }
        throw new p(wVar, null, z10, -49999);
    }

    public boolean Z(b2.w wVar) {
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
                            l lVar = this.f44979d0;
                            if (lVar != null) {
                                if (!hashSet2.isEmpty()) {
                                    lVar.n(new ArrayList(hashSet2));
                                }
                                if (!hashSet.isEmpty()) {
                                    lVar.m(new ArrayList(hashSet));
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
                l lVar2 = this.f44979d0;
                if (lVar2 != null) {
                    Bundle bundle = new Bundle();
                    for (Map.Entry entry : cVar.f12329a.entrySet()) {
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
        j0 j0Var = (j0) obj;
        j0Var.getClass();
        this.Y = j0Var;
    }

    public abstract void c0(i2.c cVar);

    public abstract void d0(String str);

    public i2.e e0(qf.b r15) {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.e0(qf.b):i2.e");
    }

    public abstract void f0(b2.w wVar, MediaFormat mediaFormat);

    @Override
    public final long g(long j10, long j11) {
        return R(j10, j11, this.f44993s0);
    }

    public void h0(long j10) {
        this.Q0 = j10;
        while (true) {
            ArrayDeque arrayDeque = this.R;
            if (!arrayDeque.isEmpty() && j10 >= ((q) arrayDeque.peek()).f44972a) {
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

    public abstract boolean l0(long j10, long j11, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, b2.w wVar);

    public final boolean m0(int i10) {
        qf.b bVar = this.f12315c;
        bVar.z();
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
        t0(q.f44971g);
        this.R.clear();
        if (this.f44999y0) {
            this.f44999y0 = false;
            p0();
        } else if (this.f44979d0 == null) {
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
            l lVar = this.f44979d0;
            if (lVar != null) {
                lVar.release();
                this.O0.f12337b++;
                o oVar = this.f44986k0;
                oVar.getClass();
                d0(oVar.f44959a);
            }
            this.f44979d0 = null;
            try {
                MediaCrypto mediaCrypto = this.Z;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f44979d0 = null;
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
        if (this.f44999y0) {
            p0();
        } else if (this.f44979d0 != null) {
            if (x0()) {
                n0();
                X();
            } else if (v0()) {
                M();
            } else {
                this.T0 = true;
            }
        }
        if (this.P0.d.j() > 0) {
            this.L0 = true;
        }
        this.P0.d.c();
        this.P0.e = false;
    }

    public final void p0() {
        this.I0 = -9223372036854775807L;
        S().f44975f = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.A0 = false;
        this.P.clear();
        this.O.clear();
        this.f45000z0 = false;
        x0 x0Var = this.S;
        x0Var.getClass();
        x0Var.f14839a = c2.n.f4521a;
        x0Var.f14841c = 0;
        x0Var.f14840b = 2;
    }

    public void q0() {
        this.f44995u0 = -1;
        this.N.f11635c = null;
        this.f44996v0 = -1;
        this.f44997w0 = null;
        this.I0 = -9223372036854775807L;
        S().f44975f = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.f44994t0 = -9223372036854775807L;
        this.G0 = false;
        this.f44992r0 = -9223372036854775807L;
        this.F0 = false;
        this.f44989o0 = false;
        this.f44990p0 = false;
        this.f44998x0 = false;
        this.D0 = 0;
        this.E0 = 0;
        this.C0 = this.B0 ? 1 : 0;
        this.T0 = false;
        this.U0 = 0L;
    }

    public final void r0() {
        q0();
        this.N0 = null;
        this.f44984i0 = null;
        this.f44986k0 = null;
        this.f44980e0 = null;
        this.f44981f0 = null;
        this.f44982g0 = false;
        this.H0 = false;
        this.f44983h0 = -1.0f;
        this.f44987l0 = 0;
        this.m0 = false;
        this.f44988n0 = false;
        this.f44991q0 = false;
        this.f44993s0 = false;
        this.B0 = false;
        this.C0 = 0;
    }

    public final void s0(n2.h hVar) {
        i0.a.D(this.W, hVar);
        this.W = hVar;
    }

    public final void t0(q qVar) {
        this.P0 = qVar;
        if (qVar.f44974c != -9223372036854775807L) {
            this.R0 = true;
            g0();
        }
    }

    @Override
    public void u(b2.w[] r12, long r13, long r15, u2.g0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.u(b2.w[], long, long, u2.g0):void");
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
        if (i10 == 3 || ((this.m0 && !this.H0) || (this.f44988n0 && this.G0))) {
            return true;
        }
        if (i10 == 2) {
            try {
                B0();
                return false;
            } catch (i2.l e) {
                e2.a.m("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                return true;
            }
        }
        return false;
    }

    public boolean y0(b2.w wVar) {
        return false;
    }

    public abstract int z0(i iVar, b2.w wVar);

    public void g0() {
    }

    public void j0(h2.h hVar) {
    }
}
