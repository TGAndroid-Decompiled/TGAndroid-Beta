package xa;

import a0.i;
import a6.l;
import a8.g;
import ai.f6;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.MenuItem;
import android.view.Window;
import androidx.lifecycle.a0;
import c3.j;
import c6.y;
import ci.b7;
import ci.g0;
import ci.l0;
import ci.m;
import ci.z6;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.internal.cast.p0;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.internal.cast.z;
import com.google.android.gms.internal.cast.z4;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e6.h;
import fb.o;
import g6.n;
import g6.q;
import gg.a2;
import gg.z1;
import i7.f;
import ii.e2;
import ii.i1;
import ii.i2;
import ii.k0;
import ii.n4;
import ii.p4;
import ii.r;
import ii.t3;
import ii.x3;
import j$.util.DesugarCollections;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import l.d;
import l.k;
import l.w;
import l5.t;
import lg.e;
import m.f2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.hr0;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.ej0;
import org.telegram.ui.hy;
import qg.c2;
public final class c implements s, hr0, a0, androidx.activity.result.b, qb0, e, n81, OnSuccessListener, n, f6.a, o, w, a2, f5, k0, f2 {
    public static volatile c f51333c;
    public final int f51334a;
    public Object f51335b;

    public c(int i10, boolean z10) {
        this.f51334a = i10;
    }

    public static int A(int i10, String str) {
        int M = M(i10);
        int t10 = t(str);
        return O(t10) + t10 + M;
    }

    public static void D(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            char c10 = 57343;
            int i11 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i12 = remaining + arrayOffset;
                    while (i11 < length) {
                        int i13 = i11 + arrayOffset;
                        if (i13 >= i12 || (charAt = charSequence.charAt(i11)) >= 128) {
                            break;
                        }
                        array[i13] = (byte) charAt;
                        i11++;
                    }
                    if (i11 == length) {
                        i10 = arrayOffset + length;
                    } else {
                        i10 = arrayOffset + i11;
                        while (i11 < length) {
                            char charAt2 = charSequence.charAt(i11);
                            if (charAt2 < 128 && i10 < i12) {
                                array[i10] = (byte) charAt2;
                                i10++;
                            } else if (charAt2 < 2048 && i10 <= i12 - 2) {
                                int i14 = i10 + 1;
                                array[i10] = (byte) ((charAt2 >>> 6) | 960);
                                i10 += 2;
                                array[i14] = (byte) ((charAt2 & '?') | 128);
                            } else if ((charAt2 < 55296 || c10 < charAt2) && i10 <= i12 - 3) {
                                array[i10] = (byte) ((charAt2 >>> '\f') | 480);
                                int i15 = i10 + 2;
                                array[i10 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i10 += 3;
                                array[i15] = (byte) ((charAt2 & '?') | 128);
                            } else if (i10 <= i12 - 4) {
                                int i16 = i11 + 1;
                                if (i16 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i16);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        array[i10] = (byte) ((codePoint >>> 18) | 240);
                                        array[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i17 = i10 + 3;
                                        array[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i10 += 4;
                                        array[i17] = (byte) ((codePoint & 63) | 128);
                                        i11 = i16;
                                    } else {
                                        i11 = i16;
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i11 - 1);
                                throw new IllegalArgumentException(sb2.toString());
                            } else {
                                StringBuilder sb3 = new StringBuilder(37);
                                sb3.append("Failed writing ");
                                sb3.append(charAt2);
                                sb3.append(" at index ");
                                sb3.append(i10);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            i11++;
                            c10 = 57343;
                        }
                    }
                    byteBuffer.position(i10 - byteBuffer.arrayOffset());
                    return;
                } catch (ArrayIndexOutOfBoundsException e7) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e7);
                    throw bufferOverflowException;
                }
            }
            int length2 = charSequence.length();
            while (i11 < length2) {
                char charAt4 = charSequence.charAt(i11);
                char c11 = charAt4;
                if (charAt4 >= 128) {
                    if (charAt4 < 2048) {
                        byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                        c11 = (charAt4 & '?') | 128;
                    } else {
                        if (charAt4 >= 55296 && 57343 >= charAt4) {
                            int i18 = i11 + 1;
                            if (i18 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i18);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                    i11 = i18;
                                } else {
                                    i11 = i18;
                                }
                            }
                            StringBuilder sb4 = new StringBuilder(39);
                            sb4.append("Unpaired surrogate at index ");
                            sb4.append(i11 - 1);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                        byteBuffer.put((byte) ((charAt4 >>> '\f') | 480));
                        byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                        i11++;
                    }
                }
                byteBuffer.put((byte) c11);
                i11++;
            }
            return;
        }
        throw new ReadOnlyBufferException();
    }

    public static int H(long j3) {
        if (((-128) & j3) == 0) {
            return 1;
        }
        if (((-16384) & j3) == 0) {
            return 2;
        }
        if (((-2097152) & j3) == 0) {
            return 3;
        }
        if (((-268435456) & j3) == 0) {
            return 4;
        }
        if (((-34359738368L) & j3) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j3) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j3) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j3) == 0) {
            return 8;
        }
        if ((j3 & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    public static int M(int i10) {
        return O(i10 << 3);
    }

    public static int O(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        if ((i10 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int t(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) >= 65536) {
                                i11++;
                            } else {
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i11);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb3 = new StringBuilder(54);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(i12 + 4294967296L);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override
    public void B(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: xa.c.B(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    public void C(int i10, int i11) {
        y((i10 << 3) | i11);
    }

    @Override
    public o9 E() {
        n4 n4Var = ((p4) this.f51335b).G;
        if (n4Var != null) {
            return ((t3) n4Var).f12703a.getTextSelectionHelper();
        }
        return null;
    }

    public void F(long j3) {
        while (((-128) & j3) != 0) {
            w((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        w((int) j3);
    }

    @Override
    public i G() {
        return null;
    }

    @Override
    public void I(CharSequence charSequence) {
        n4 n4Var = ((p4) this.f51335b).G;
        if (n4Var != null) {
            t3 t3Var = (t3) n4Var;
            t3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                t3Var.f12703a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f51334a) {
            case 24:
                ((r) this.f51335b).K(i10, z10, i11, false, 0L);
                r rVar = (r) this.f51335b;
                ej0 ej0Var = rVar.O;
                if (ej0Var != null) {
                    ej0Var.i();
                    rVar.O = null;
                    return;
                }
                return;
            default:
                e2 e2Var = (e2) this.f51335b;
                e2Var.s0(i10, i11, z10);
                ej0 ej0Var2 = e2Var.O0;
                if (ej0Var2 != null) {
                    ej0Var2.i();
                    e2Var.O0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void K() {
        ((l0) this.f51335b).h.f15318a.g(1, true);
    }

    @Override
    public n9 L() {
        return (p4) this.f51335b;
    }

    @Override
    public ii.a N() {
        return ((p4) this.f51335b).f12249a;
    }

    @Override
    public boolean P() {
        p4 p4Var = (p4) this.f51335b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            ii.a aVar = p4Var.f12249a;
            if (((t3) n4Var).f12703a.T4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void R(int i10, int i11) {
        p4 p4Var = (p4) this.f51335b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            ii.a aVar = p4Var.f12249a;
            i2 i2Var = ((t3) n4Var).f12703a.H3;
            if (i2Var != null) {
                i2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void V() {
        p4 p4Var = (p4) this.f51335b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            ii.a aVar = p4Var.f12249a;
            x3 x3Var = ((t3) n4Var).f12703a;
            i2 i2Var = x3Var.H3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.f12807f3.onContentChanged();
        }
    }

    @Override
    public i W() {
        return null;
    }

    @Override
    public boolean X() {
        l0 l0Var = (l0) this.f51335b;
        g0 g0Var = l0Var.h;
        boolean m10 = g0Var.m(-90.0f);
        g0Var.i();
        l0Var.f5367e.invalidate();
        return m10;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f51334a) {
            case 1:
                a8.e eVar = new a8.e(0, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.f331a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.a) this.f51335b).writeToParcel(obtain, 0);
                ((a8.c) ((g) obj).u()).F0(obtain, 2);
                return;
            case 19:
                q qVar = new q(0, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                Parcel N0 = iVar.N0();
                v.d(N0, qVar);
                N0.writeStringArray((String[]) this.f51335b);
                iVar.S0(N0, 5);
                return;
            default:
                l lVar = new l((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).u();
                Parcel J0 = iVar2.J0();
                int i11 = f.f12039a;
                J0.writeStrongBinder(lVar);
                f.c(J0, (x5.e) this.f51335b);
                iVar2.K0(J0, 1);
                return;
        }
    }

    @Override
    public Paint.FontMetricsInt b() {
        return ((m) this.f51335b).f5553f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public boolean b0(int i10) {
        if (i10 == ((cp0) this.f51335b).f10617d0) {
            return true;
        }
        return false;
    }

    @Override
    public void c(i1 i1Var) {
        n4 n4Var = ((p4) this.f51335b).G;
        if (n4Var != null) {
            x3 x3Var = ((t3) n4Var).f12703a;
            x3.N1(x3Var, i1Var);
            x3Var.f12807f3.w(i1Var, true);
        }
    }

    @Override
    public void d(k kVar, boolean z10) {
        ((g.r) this.f51335b).g(kVar);
    }

    @Override
    public void e(k kVar, MenuItem menuItem) {
        ((l.e) this.f51335b).f14963f.removeCallbacksAndMessages(kVar);
    }

    @Override
    public void e0() {
        p4 p4Var = (p4) this.f51335b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            ii.a aVar = p4Var.f12249a;
            x3.P1(((t3) n4Var).f12703a);
        }
    }

    @Override
    public void g() {
        p4 p4Var = (p4) this.f51335b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            x3.Q1(((t3) n4Var).f12703a, p4Var.f12249a);
        }
    }

    @Override
    public void h(int i10) {
        boolean z10;
        cp0 cp0Var = (cp0) this.f51335b;
        cp0Var.D0--;
        cp0Var.f10619e0 = i10;
        if (cp0Var.f10621f0 != i10) {
            cp0Var.f10635s.clear();
        }
        if (cp0Var.f10622g0 != i10) {
            cp0Var.I.clear();
        }
        cp0Var.N = true;
        hy hyVar = cp0Var.U;
        if (hyVar != null) {
            if (cp0Var.D0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            hyVar.d(z10, true);
        }
        cp0Var.l();
        hy hyVar2 = cp0Var.U;
        if (hyVar2 != null) {
            hyVar2.c();
        }
    }

    @Override
    public void h0(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: xa.c.h0(java.lang.Object):void");
    }

    @Override
    public void i(int i10, int i11, CharSequence charSequence, boolean z10) {
        ci.g gVar = ((m) this.f51335b).f5553f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i10 + charSequence.length());
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public void i0(ArrayList arrayList) {
        boolean z10;
        cp0 cp0Var = (cp0) this.f51335b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            cp0Var.J.add(((z1) arrayList.get(i10)).f10877a);
        }
        hy hyVar = cp0Var.U;
        if (hyVar != null) {
            if (cp0Var.D0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            hyVar.d(z10, false);
        }
        cp0Var.l();
    }

    public void j(j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f51335b;
        long[] jArr = jVar.f4127e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(jVar.f4127e[0]), jVar);
        }
    }

    @Override
    public void k(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f51335b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f2159b;
        int i10 = u.e("ProxyBillingActivityV2", intent).f4252a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i10, extras);
        }
        int i11 = aVar.f2158a;
        if (i11 != -1 || i10 != 0) {
            u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    public dc.d l(com.google.firebase.messaging.m r24) {
        throw new UnsupportedOperationException("Method not decompiled: xa.c.l(com.google.firebase.messaging.m):dc.d");
    }

    @Override
    public void m(Bitmap bitmap) {
        ((f6.i) this.f51335b).e(bitmap, 3);
    }

    @Override
    public void m0() {
        ((l0) this.f51335b).h.k();
    }

    @Override
    public void n(k kVar, l.m mVar) {
        l.e eVar = (l.e) this.f51335b;
        Handler handler = eVar.f14963f;
        d dVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f14964n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (kVar == ((d) arrayList.get(i10)).f14957b) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            dVar = (d) arrayList.get(i11);
        }
        handler.postAtTime(new p(this, dVar, mVar, kVar, false, 1), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override
    public void n0(float f7) {
        ((l0) this.f51335b).h.setRotation(f7);
    }

    public Set o() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f51335b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f51335b);
        }
        return unmodifiableSet;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        b7 b7Var = (b7) this.f51335b;
        z6 z6Var = b7Var.M;
        q81 q81Var = b7Var.f4785x;
        if (q81Var == null) {
            return;
        }
        if (q81Var.y()) {
            AndroidUtilities.runOnUIThread(z6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(z6Var);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        int i10;
        int i11;
        d2 d2Var;
        d1 b10;
        d6.a aVar = (d6.a) this.f51335b;
        Bundle bundle = (Bundle) obj;
        if (p0.f6957j) {
            Context context = aVar.f8153a;
            g6.r rVar = aVar.f8157f;
            p0 p0Var = new p0(context, rVar, aVar.f8155c, aVar.f8160j, aVar.f8158g);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE")) {
                i10 = bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0);
            } else if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i10 == 0) {
                if (z10) {
                    i10 = 0;
                    z10 = true;
                } else {
                    return;
                }
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String v = sc.v.v(packageName, ".client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            p0Var.h = i11;
            t.b(context);
            p0Var.f6963g = t.a().c(j5.a.f14019e).a("CAST_SENDER_SDK", new i5.c("proto"), z.f7067a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                p0Var.f6961e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(v, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
                e7.f6694c = new a6.m(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                e7.d = new k6.c[]{y.f4442c};
                e7.f6693b = false;
                e7.f6692a = 8426;
                Task e10 = rVar.e(0, e7.a());
                ?? obj2 = new Object();
                obj2.f14059b = p0Var;
                obj2.f14060c = packageName;
                obj2.f14058a = i10;
                obj2.d = sharedPreferences;
                e10.addOnSuccessListener(obj2);
            }
            if (z10) {
                n6.m.h(sharedPreferences);
                g6.b bVar = d2.f6844i;
                synchronized (d2.class) {
                    try {
                        if (d2.f6846k == null) {
                            d2.f6846k = new d2(sharedPreferences, p0Var, packageName);
                        }
                        d2Var = d2.f6846k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = d2Var.f6849c;
                SharedPreferences sharedPreferences2 = d2Var.f6848b;
                HashSet hashSet = d2Var.f6851f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = d2Var.f6852g;
                hashSet2.clear();
                d2Var.h = 0L;
                String str2 = d2.f6845j;
                if (str2.equals(string) && str.equals(string2)) {
                    d2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j3 = sharedPreferences2.getLong(str3, 0L);
                            if (j3 != 0 && currentTimeMillis - j3 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                d1 b11 = d2.b(str3.substring(41));
                                if (b11 != null) {
                                    hashSet2.add(b11);
                                    hashSet.add(b11);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = d2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    d2Var.c(hashSet3);
                    n6.m.h(d2Var.f6850e);
                    n6.m.h(d2Var.d);
                    d2Var.f6850e.post(d2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    d2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                d2.a(d1.CAST_CONTEXT);
            }
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        c2 c2Var = ((b7) this.f51335b).f4783w;
        if (c2Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(c2Var.f46148y0 - f10) >= 1.0E-4f) {
                c2Var.f46148y0 = f10;
                c2Var.requestLayout();
            }
        }
    }

    public void p() {
        ((androidx.fragment.app.u) this.f51335b).d.R();
    }

    @Override
    public boolean q() {
        l0 l0Var = (l0) this.f51335b;
        l0Var.f5367e.invalidate();
        return l0Var.h.j();
    }

    @Override
    public void q0() {
        f6.j0((f6) this.f51335b);
    }

    @Override
    public void r(String str, long j3, long j10, long j11) {
        e6.p pVar = (e6.p) this.f51335b;
        try {
            pVar.a(new e6.o(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e7) {
            g6.b bVar = h.f8667k;
            Log.e(bVar.f10321a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e7);
        }
        Iterator it = pVar.f8692q.f8674i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j3, 2103, j10, j11);
        }
    }

    public void u(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f51335b;
        C(i10, 2);
        try {
            int O = O(str.length());
            if (O == O(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= O) {
                    byteBuffer.position(position + O);
                    D(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    y((position2 - position) - O);
                    byteBuffer.position(position2);
                    return;
                }
                throw new z4(position + O, byteBuffer.limit());
            }
            y(t(str));
            D(str, byteBuffer);
        } catch (BufferOverflowException e7) {
            z4 z4Var = new z4(byteBuffer.position(), byteBuffer.limit());
            z4Var.initCause(e7);
            throw z4Var;
        }
    }

    public void v(int i10, byte[] bArr) {
        C(i10, 2);
        y(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f51335b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new z4(byteBuffer.position(), byteBuffer.limit());
    }

    public void w(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.f51335b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new z4(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public Object w2() {
        Type type = (Type) this.f51335b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new RuntimeException("Invalid EnumMap type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumMap type: " + type.toString());
    }

    @Override
    public boolean x(k kVar) {
        Window.Callback callback = ((g.r) this.f51335b).f10171f.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    public void y(int i10) {
        while ((i10 & (-128)) != 0) {
            w((i10 & 127) | 128);
            i10 >>>= 7;
        }
        w(i10);
    }

    @Override
    public void z() {
        ((l0) this.f51335b).h.o();
    }

    public c(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.f51334a = i10;
        this.f51335b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public c(Object obj, int i10) {
        this.f51334a = i10;
        this.f51335b = obj;
    }

    public c(byte[] bArr, int i10) {
        this.f51334a = 13;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.f51335b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public c(x6.a aVar) {
        this.f51334a = 27;
        n6.m.h(aVar);
        this.f51335b = aVar;
    }

    public c(int i10) {
        this.f51334a = i10;
        switch (i10) {
            case 7:
                this.f51335b = new LinkedHashMap();
                return;
            case 21:
                this.f51335b = new a6.m(fc.a.h, 18);
                return;
            default:
                this.f51335b = new HashSet();
                return;
        }
    }

    @Override
    public void U() {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void s(String str) {
    }

    @Override
    public void onError(q81 q81Var, Exception exc) {
    }

    @Override
    public void a(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void f(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}
