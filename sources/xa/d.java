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
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.util.Log;
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
import com.google.android.gms.internal.cast.p0;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.internal.cast.z;
import com.google.android.gms.internal.cast.z4;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e6.h;
import e6.o;
import e6.p;
import g6.n;
import g6.q;
import gg.a2;
import gg.z1;
import i7.f;
import ii.e2;
import ii.i1;
import ii.i2;
import ii.k0;
import ii.o4;
import ii.q4;
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
import l.k;
import l.w;
import lg.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.dj0;
import org.telegram.ui.fy;
import qg.c2;
public final class d implements s, br0, a0, androidx.activity.result.b, mb0, e, h81, OnSuccessListener, n, f6.a, fb.n, w, a2, f5, k0 {
    public static volatile d f51105c;
    public final int f51106a;
    public Object f51107b;

    public d(int i10, boolean z10) {
        this.f51106a = i10;
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

    public static int L(int i10) {
        return N(i10 << 3);
    }

    public static int N(int i10) {
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

    public static int p(CharSequence charSequence) {
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

    public static int z(int i10, String str) {
        int L = L(i10);
        int p5 = p(str);
        return N(p5) + p5 + L;
    }

    @Override
    public void A(CharSequence charSequence) {
        o4 o4Var = ((q4) this.f51107b).G;
        if (o4Var != null) {
            t3 t3Var = (t3) o4Var;
            t3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                t3Var.f12705a.u4(charSequence.toString());
            }
        }
    }

    public void B(int i10, int i11) {
        x((i10 << 3) | i11);
    }

    @Override
    public n9 C() {
        return (q4) this.f51107b;
    }

    public void E(long j3) {
        while (((-128) & j3) != 0) {
            u((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        u((int) j3);
    }

    @Override
    public ii.a F() {
        return ((q4) this.f51107b).f12251a;
    }

    @Override
    public boolean G() {
        q4 q4Var = (q4) this.f51107b;
        o4 o4Var = q4Var.G;
        if (o4Var != null) {
            ii.a aVar = q4Var.f12251a;
            if (((t3) o4Var).f12705a.T4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void I(int i10, int i11) {
        q4 q4Var = (q4) this.f51107b;
        o4 o4Var = q4Var.G;
        if (o4Var != null) {
            ii.a aVar = q4Var.f12251a;
            i2 i2Var = ((t3) o4Var).f12705a.H3;
            if (i2Var != null) {
                i2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void I0() {
        ((l0) this.f51107b).h.k();
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f51106a) {
            case 24:
                ((r) this.f51107b).K(i10, z10, i11, false, 0L);
                r rVar = (r) this.f51107b;
                dj0 dj0Var = rVar.O;
                if (dj0Var != null) {
                    dj0Var.i();
                    rVar.O = null;
                    return;
                }
                return;
            default:
                e2 e2Var = (e2) this.f51107b;
                e2Var.s0(i10, i11, z10);
                dj0 dj0Var2 = e2Var.O0;
                if (dj0Var2 != null) {
                    dj0Var2.i();
                    e2Var.O0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void K() {
        ((l0) this.f51107b).h.o();
    }

    @Override
    public void K0(float f7) {
        ((l0) this.f51107b).h.setRotation(f7);
    }

    @Override
    public void M() {
        q4 q4Var = (q4) this.f51107b;
        o4 o4Var = q4Var.G;
        if (o4Var != null) {
            ii.a aVar = q4Var.f12251a;
            x3 x3Var = ((t3) o4Var).f12705a;
            i2 i2Var = x3Var.H3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.f12809f3.onContentChanged();
        }
    }

    @Override
    public void Q() {
        q4 q4Var = (q4) this.f51107b;
        o4 o4Var = q4Var.G;
        if (o4Var != null) {
            ii.a aVar = q4Var.f12251a;
            x3.P1(((t3) o4Var).f12705a);
        }
    }

    @Override
    public i V() {
        return null;
    }

    @Override
    public void X(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: xa.d.X(java.lang.Object):void");
    }

    public void a(j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f51107b;
        long[] jArr = jVar.f4128e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(jVar.f4128e[0]), jVar);
        }
    }

    @Override
    public void a0() {
        ((l0) this.f51107b).h.f15572a.g(1, true);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f51106a) {
            case 1:
                a8.e eVar = new a8.e(0, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.f329a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.a) this.f51107b).writeToParcel(obtain, 0);
                ((a8.c) ((g) obj).u()).F0(obtain, 2);
                return;
            case 19:
                q qVar = new q(0, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                Parcel N0 = iVar.N0();
                v.d(N0, qVar);
                N0.writeStringArray((String[]) this.f51107b);
                iVar.S0(N0, 5);
                return;
            default:
                l lVar = new l((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).u();
                Parcel J0 = iVar2.J0();
                int i11 = f.f12041a;
                J0.writeStrongBinder(lVar);
                f.c(J0, (x5.e) this.f51107b);
                iVar2.K0(J0, 1);
                return;
        }
    }

    public dc.d b(com.google.firebase.messaging.m r24) {
        throw new UnsupportedOperationException("Method not decompiled: xa.d.b(com.google.firebase.messaging.m):dc.d");
    }

    @Override
    public void c(i1 i1Var) {
        o4 o4Var = ((q4) this.f51107b).G;
        if (o4Var != null) {
            x3 x3Var = ((t3) o4Var).f12705a;
            x3.N1(x3Var, i1Var);
            x3Var.f12809f3.r(i1Var, true);
        }
    }

    @Override
    public void d(k kVar, boolean z10) {
        ((g.r) this.f51107b).g(kVar);
    }

    @Override
    public i d0() {
        return null;
    }

    @Override
    public Paint.FontMetricsInt f() {
        return ((m) this.f51107b).f5555f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void g() {
        q4 q4Var = (q4) this.f51107b;
        o4 o4Var = q4Var.G;
        if (o4Var != null) {
            x3.Q1(((t3) o4Var).f12705a, q4Var.f12251a);
        }
    }

    @Override
    public void h(int i10) {
        boolean z10;
        wo0 wo0Var = (wo0) this.f51107b;
        wo0Var.D0--;
        wo0Var.f10621e0 = i10;
        if (wo0Var.f10623f0 != i10) {
            wo0Var.f10637s.clear();
        }
        if (wo0Var.f10624g0 != i10) {
            wo0Var.I.clear();
        }
        wo0Var.N = true;
        fy fyVar = wo0Var.U;
        if (fyVar != null) {
            if (wo0Var.D0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            fyVar.d(z10, true);
        }
        wo0Var.l();
        fy fyVar2 = wo0Var.U;
        if (fyVar2 != null) {
            fyVar2.c();
        }
    }

    @Override
    public boolean i0() {
        l0 l0Var = (l0) this.f51107b;
        g0 g0Var = l0Var.h;
        boolean m10 = g0Var.m(-90.0f);
        g0Var.i();
        l0Var.f5369e.invalidate();
        return m10;
    }

    @Override
    public void j(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f51107b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f2161b;
        int i10 = u.e("ProxyBillingActivityV2", intent).f4254a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i10, extras);
        }
        int i11 = aVar.f2160a;
        if (i11 != -1 || i10 != 0) {
            u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public void k(int i10, int i11, CharSequence charSequence, boolean z10) {
        ci.g gVar = ((m) this.f51107b).f5555f;
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

    public Set l() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f51107b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f51107b);
        }
        return unmodifiableSet;
    }

    @Override
    public void n(String str, long j3, long j10, long j11) {
        p pVar = (p) this.f51107b;
        try {
            pVar.a(new o(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e7) {
            g6.b bVar = h.f8670k;
            Log.e(bVar.f10323a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e7);
        }
        Iterator it = pVar.f8695q.f8677i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j3, 2103, j10, j11);
        }
    }

    public void o() {
        ((androidx.fragment.app.u) this.f51107b).d.R();
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        b7 b7Var = (b7) this.f51107b;
        z6 z6Var = b7Var.M;
        k81 k81Var = b7Var.f4787x;
        if (k81Var == null) {
            return;
        }
        if (k81Var.y()) {
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
        d6.a aVar = (d6.a) this.f51107b;
        Bundle bundle = (Bundle) obj;
        if (p0.f6959j) {
            Context context = aVar.f8156a;
            g6.r rVar = aVar.f8160f;
            p0 p0Var = new p0(context, rVar, aVar.f8158c, aVar.f8163j, aVar.f8161g);
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
            l5.s.b(context);
            p0Var.f6965g = l5.s.a().c(j5.a.f14022e).a("CAST_SENDER_SDK", new i5.c("proto"), z.f7069a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                p0Var.f6963e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(v, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
                e7.f6696c = new pb.c(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                e7.d = new k6.c[]{y.f4444c};
                e7.f6695b = false;
                e7.f6694a = 8426;
                Task e10 = rVar.e(0, e7.a());
                ?? obj2 = new Object();
                obj2.f14062b = p0Var;
                obj2.f14063c = packageName;
                obj2.f14061a = i10;
                obj2.d = sharedPreferences;
                e10.addOnSuccessListener(obj2);
            }
            if (z10) {
                n6.l.h(sharedPreferences);
                g6.b bVar = d2.f6846i;
                synchronized (d2.class) {
                    try {
                        if (d2.f6848k == null) {
                            d2.f6848k = new d2(sharedPreferences, p0Var, packageName);
                        }
                        d2Var = d2.f6848k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = d2Var.f6851c;
                SharedPreferences sharedPreferences2 = d2Var.f6850b;
                HashSet hashSet = d2Var.f6853f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = d2Var.f6854g;
                hashSet2.clear();
                d2Var.h = 0L;
                String str2 = d2.f6847j;
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
                    n6.l.h(d2Var.f6852e);
                    n6.l.h(d2Var.d);
                    d2Var.f6852e.post(d2Var.d);
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
        c2 c2Var = ((b7) this.f51107b).f4785w;
        if (c2Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(c2Var.f46211y0 - f10) >= 1.0E-4f) {
                c2Var.f46211y0 = f10;
                c2Var.requestLayout();
            }
        }
    }

    @Override
    public boolean q() {
        l0 l0Var = (l0) this.f51107b;
        l0Var.f5369e.invalidate();
        return l0Var.h.j();
    }

    @Override
    public void q0() {
        f6.j0((f6) this.f51107b);
    }

    public void r(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f51107b;
        B(i10, 2);
        try {
            int N = N(str.length());
            if (N == N(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= N) {
                    byteBuffer.position(position + N);
                    D(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    x((position2 - position) - N);
                    byteBuffer.position(position2);
                    return;
                }
                throw new z4(position + N, byteBuffer.limit());
            }
            x(p(str));
            D(str, byteBuffer);
        } catch (BufferOverflowException e7) {
            z4 z4Var = new z4(byteBuffer.position(), byteBuffer.limit());
            z4Var.initCause(e7);
            throw z4Var;
        }
    }

    @Override
    public void s(Bitmap bitmap) {
        ((f6.i) this.f51107b).e(bitmap, 3);
    }

    @Override
    public boolean s0(int i10) {
        if (i10 == ((wo0) this.f51107b).f10619d0) {
            return true;
        }
        return false;
    }

    public void t(int i10, byte[] bArr) {
        B(i10, 2);
        x(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f51107b;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new z4(byteBuffer.position(), byteBuffer.limit());
    }

    public void u(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.f51107b;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b10);
            return;
        }
        throw new z4(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public boolean v(k kVar) {
        Window.Callback callback = ((g.r) this.f51107b).f10173f.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    @Override
    public Object v2() {
        Type type = (Type) this.f51107b;
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
    public void w(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: xa.d.w(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    public void x(int i10) {
        while ((i10 & (-128)) != 0) {
            u((i10 & 127) | 128);
            i10 >>>= 7;
        }
        u(i10);
    }

    @Override
    public void x0(ArrayList arrayList) {
        boolean z10;
        wo0 wo0Var = (wo0) this.f51107b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            wo0Var.J.add(((z1) arrayList.get(i10)).f10879a);
        }
        fy fyVar = wo0Var.U;
        if (fyVar != null) {
            if (wo0Var.D0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            fyVar.d(z10, false);
        }
        wo0Var.l();
    }

    @Override
    public o9 y() {
        o4 o4Var = ((q4) this.f51107b).G;
        if (o4Var != null) {
            return ((t3) o4Var).f12705a.getTextSelectionHelper();
        }
        return null;
    }

    public d(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.f51106a = i10;
        this.f51107b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public d(Object obj, int i10) {
        this.f51106a = i10;
        this.f51107b = obj;
    }

    public d(byte[] bArr, int i10) {
        this.f51106a = 13;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.f51107b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public d(x6.a aVar) {
        this.f51106a = 27;
        n6.l.h(aVar);
        this.f51107b = aVar;
    }

    public d(int i10) {
        this.f51106a = i10;
        switch (i10) {
            case 7:
                this.f51107b = new LinkedHashMap();
                return;
            case 21:
                this.f51107b = new pb.c(fc.a.h, 19);
                return;
            default:
                this.f51107b = new HashSet();
                return;
        }
    }

    @Override
    public void P() {
    }

    @Override
    public void m(String str) {
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
    public void onError(k81 k81Var, Exception exc) {
    }

    @Override
    public void e(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void i(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}
