package ya;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import android.view.Window;
import androidx.fragment.app.u;
import androidx.lifecycle.a0;
import ci.p4;
import ci.q9;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.l0;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.j;
import ei.g;
import ei.m;
import ei.o6;
import ei.r6;
import f6.h;
import g6.i;
import g6.s;
import gb.n;
import gi.m4;
import hi.r0;
import hi.s0;
import j$.util.DesugarCollections;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import ki.c3;
import ki.d2;
import ki.g1;
import ki.h1;
import ki.h2;
import ki.o5;
import ki.q;
import ki.w3;
import l.k;
import l.w;
import org.json.JSONArray;
import org.json.JSONException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.ri;
import org.telegram.ui.qi0;
import org.telegram.ui.sn;
import org.telegram.ui.uu0;
import org.telegram.ui.z51;
import v7.f7;
public final class c implements r, z51, a0, androidx.activity.result.b, uu0, j0, u0, OnCompleteListener, gb0, g81, f6.a, w, n, eb.n, r0, ri, d5, g1 {
    public static volatile c f50562c;
    public final int f50563a;
    public Object f50564b;

    public c(int i10) {
        this.f50563a = i10;
    }

    public static boolean Y(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static String g0(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    @Override
    public boolean A() {
        return true;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f50563a) {
            case 27:
                ((q) this.f50564b).K(i10, z10, i11, false, 0L);
                q qVar = (q) this.f50564b;
                qi0 qi0Var = qVar.O;
                if (qi0Var != null) {
                    qi0Var.h();
                    qVar.O = null;
                    return;
                }
                return;
            default:
                ((d2) this.f50564b).s0(i10, i11, z10);
                return;
        }
    }

    @Override
    public e D(e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public float F(jc.c cVar, jc.c cVar2) {
        int i10 = (int) cVar.f7952b;
        int i11 = (int) cVar2.f7952b;
        float f02 = f0((int) cVar.f7951a, i10, (int) cVar2.f7951a, i11);
        float f03 = f0((int) cVar2.f7951a, i11, (int) cVar.f7951a, i10);
        if (Float.isNaN(f02)) {
            return f03 / 7.0f;
        }
        if (Float.isNaN(f03)) {
            return f02 / 7.0f;
        }
        return (f02 + f03) / 14.0f;
    }

    @Override
    public void G(Editable editable) {
        o5 o5Var = (o5) this.f50564b;
        ki.a aVar = o5Var.f15157a;
        if (aVar != null) {
            aVar.f15155s = true;
            aVar.f15154r = o5Var.f15491r.E;
        }
        o5Var.t();
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f15157a != null) {
            c3Var.a();
        }
    }

    public int H(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        int i13;
        gc.a aVar = (gc.a) this.f50564b;
        if (iArr.length != 0) {
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i14 = 1;
                while (i14 < length && iArr[i14] == 0) {
                    i14++;
                }
                if (i14 == length) {
                    iArr2 = new int[]{0};
                } else {
                    int i15 = length - i14;
                    int[] iArr4 = new int[i15];
                    System.arraycopy(iArr, i14, iArr4, 0, i15);
                    iArr2 = iArr4;
                }
            } else {
                iArr2 = iArr;
            }
            int[] iArr5 = new int[i10];
            boolean z10 = true;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = aVar.f11004a[aVar.f11008g + i16];
                if (i17 == 0) {
                    i13 = iArr2[iArr2.length - 1];
                } else {
                    if (i17 == 1) {
                        i12 = 0;
                        for (int i18 : iArr2) {
                            gc.a aVar2 = gc.a.h;
                            i12 ^= i18;
                        }
                    } else {
                        i12 = iArr2[0];
                        int length2 = iArr2.length;
                        for (int i19 = 1; i19 < length2; i19++) {
                            i12 = aVar.c(i17, i12) ^ iArr2[i19];
                        }
                    }
                    i13 = i12;
                }
                iArr5[(i10 - 1) - i16] = i13;
                if (i13 != 0) {
                    z10 = false;
                }
            }
            if (z10) {
                return 0;
            }
            gc.b bVar = new gc.b(aVar, iArr5);
            gc.b a2 = aVar.a(i10, 1);
            gc.b bVar2 = aVar.f11006c;
            if (a2.d() >= bVar.d()) {
                a2 = bVar;
                bVar = a2;
            }
            gc.b bVar3 = aVar.d;
            gc.b bVar4 = a2;
            gc.b bVar5 = bVar;
            gc.b bVar6 = bVar4;
            gc.b bVar7 = bVar2;
            while (bVar6.d() * 2 >= i10) {
                if (!bVar6.e()) {
                    int b10 = aVar.b(bVar6.c(bVar6.d()));
                    gc.b bVar8 = bVar2;
                    while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                        int d = bVar5.d() - bVar6.d();
                        int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                        bVar8 = bVar8.a(aVar.a(d, c10));
                        bVar5 = bVar5.a(bVar6.h(d, c10));
                    }
                    gc.b a10 = bVar8.g(bVar3).a(bVar7);
                    if (bVar5.d() < bVar6.d()) {
                        gc.b bVar9 = bVar5;
                        bVar5 = bVar6;
                        bVar6 = bVar9;
                        bVar7 = bVar3;
                        bVar3 = a10;
                    } else {
                        throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
                    }
                } else {
                    throw new Exception("r_{i-1} was zero");
                }
            }
            int c11 = bVar3.c(0);
            if (c11 != 0) {
                int b11 = aVar.b(c11);
                gc.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
                gc.b bVar10 = bVarArr[0];
                gc.b bVar11 = bVarArr[1];
                int d10 = bVar10.d();
                if (d10 == 1) {
                    iArr3 = new int[]{bVar10.c(1)};
                } else {
                    int[] iArr6 = new int[d10];
                    int i20 = 0;
                    for (int i21 = 1; i21 < aVar.e && i20 < d10; i21++) {
                        if (bVar10.b(i21) == 0) {
                            iArr6[i20] = aVar.b(i21);
                            i20++;
                        }
                    }
                    if (i20 == d10) {
                        iArr3 = iArr6;
                    } else {
                        throw new Exception("Error locator degree does not match number of roots");
                    }
                }
                int length3 = iArr3.length;
                int[] iArr7 = new int[length3];
                for (int i22 = 0; i22 < length3; i22++) {
                    int b12 = aVar.b(iArr3[i22]);
                    int i23 = 1;
                    for (int i24 = 0; i24 < length3; i24++) {
                        if (i22 != i24) {
                            int c12 = aVar.c(iArr3[i24], b12);
                            if ((c12 & 1) == 0) {
                                i11 = c12 | 1;
                            } else {
                                i11 = c12 & (-2);
                            }
                            i23 = aVar.c(i23, i11);
                        }
                    }
                    int c13 = aVar.c(bVar11.b(b12), aVar.b(i23));
                    iArr7[i22] = c13;
                    if (aVar.f11008g != 0) {
                        iArr7[i22] = aVar.c(c13, b12);
                    }
                }
                for (int i25 = 0; i25 < iArr3.length; i25++) {
                    int length4 = iArr.length - 1;
                    int i26 = iArr3[i25];
                    if (i26 != 0) {
                        int i27 = length4 - aVar.f11005b[i26];
                        if (i27 >= 0) {
                            iArr[i27] = iArr[i27] ^ iArr7[i25];
                        } else {
                            throw new Exception("Bad error location");
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                return iArr3.length;
            }
            throw new Exception("sigmaTilde(0) was zero");
        }
        throw new IllegalArgumentException();
    }

    @Override
    public void I(int i10, int i11, CharSequence charSequence, boolean z10) {
        g gVar = ((m) this.f50564b).f9410f;
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public jc.a K(float f7, float f10, int i10, int i11) {
        int i12;
        jc.a b10;
        jc.a b11;
        int i13 = (int) (f10 * f7);
        int max = Math.max(0, i10 - i13);
        ec.b bVar = (ec.b) this.f50564b;
        int min = Math.min(bVar.f8589a - 1, i10 + i13) - max;
        float f11 = 3.0f * f7;
        if (min >= f11) {
            int max2 = Math.max(0, i11 - i13);
            int min2 = Math.min(bVar.f8590b - 1, i11 + i13) - max2;
            if (min2 >= f11) {
                ec.b bVar2 = (ec.b) this.f50564b;
                jc.b bVar3 = new jc.b(bVar2, max, max2, min, min2, f7);
                int i14 = bVar3.e;
                int i15 = bVar3.f14419c;
                int i16 = i14 + i15;
                int i17 = bVar3.f14420f;
                int i18 = (i17 / 2) + bVar3.d;
                int[] iArr = new int[3];
                for (int i19 = 0; i19 < i17; i19++) {
                    if ((i19 & 1) == 0) {
                        i12 = (i19 + 1) / 2;
                    } else {
                        i12 = -((i19 + 1) / 2);
                    }
                    int i20 = i12 + i18;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i21 = i15;
                    while (i21 < i16 && !bVar2.b(i21, i20)) {
                        i21++;
                    }
                    int i22 = 0;
                    while (i21 < i16) {
                        if (bVar2.b(i21, i20)) {
                            if (i22 == 1) {
                                iArr[1] = iArr[1] + 1;
                            } else if (i22 == 2) {
                                if (bVar3.a(iArr) && (b11 = bVar3.b(i20, i21, iArr)) != null) {
                                    return b11;
                                }
                                iArr[0] = iArr[2];
                                iArr[1] = 1;
                                iArr[2] = 0;
                                i22 = 1;
                            } else {
                                i22++;
                                iArr[i22] = iArr[i22] + 1;
                            }
                        } else {
                            if (i22 == 1) {
                                i22++;
                            }
                            iArr[i22] = iArr[i22] + 1;
                        }
                        i21++;
                    }
                    if (bVar3.a(iArr) && (b10 = bVar3.b(i20, i16, iArr)) != null) {
                        return b10;
                    }
                }
                ArrayList arrayList = bVar3.f14418b;
                if (!arrayList.isEmpty()) {
                    return (jc.a) arrayList.get(0);
                }
                throw dc.e.a();
            }
            throw dc.e.a();
        }
        throw dc.e.a();
    }

    @Override
    public boolean M(boolean z10) {
        return false;
    }

    public boolean N(String str) {
        String W = W(str);
        if (!"1".equals(W) && !Boolean.parseBoolean(W)) {
            return false;
        }
        return true;
    }

    @Override
    public boolean P(h1 h1Var) {
        return false;
    }

    public Integer Q(String str) {
        String W = W(str);
        if (!TextUtils.isEmpty(W)) {
            try {
                return Integer.valueOf(Integer.parseInt(W));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + g0(str) + "(" + W + ") into an int");
                return null;
            }
        }
        return null;
    }

    @Override
    public void R(h1 h1Var, int i10, int i11) {
        c3 c3Var;
        o9 textSelectionHelper;
        o5 o5Var = (o5) this.f50564b;
        if (!o5Var.G && i10 != i11 && (c3Var = o5Var.E) != null && (textSelectionHelper = c3Var.f15232a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != o5Var) {
                o5Var.post(new m4(this, h1Var, i11, textSelectionHelper, i10, 4));
            }
        }
    }

    public JSONArray S(String str) {
        String W = W(str);
        if (!TextUtils.isEmpty(W)) {
            try {
                return new JSONArray(W);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + g0(str) + ": " + W + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public String T(Resources resources, String str, String str2) {
        String[] strArr;
        String W = W(str2);
        if (!TextUtils.isEmpty(W)) {
            return W;
        }
        String W2 = W(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(W2)) {
            return null;
        }
        int identifier = resources.getIdentifier(W2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", g0(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray S = S(str2.concat("_loc_args"));
        if (S == null) {
            strArr = null;
        } else {
            int length = S.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = S.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + g0(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    @Override
    public TextureView U() {
        return null;
    }

    public Set V() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f50564b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f50564b);
        }
        return unmodifiableSet;
    }

    public String W(String str) {
        String replace;
        Bundle bundle = (Bundle) this.f50564b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    @Override
    public void Z(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: ya.c.Z(java.lang.Object):void");
    }

    public void a0() {
        ((u) this.f50564b).d.R();
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f50563a) {
            case 1:
                a8.e eVar = new a8.e(0, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.f310a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.a) this.f50564b).writeToParcel(obtain, 0);
                ((a8.c) ((a8.g) obj).u()).F0(obtain, 2);
                return;
            default:
                g6.q qVar = new g6.q(0, (TaskCompletionSource) obj2);
                i iVar = (i) ((s) obj).u();
                Parcel N0 = iVar.N0();
                v.d(N0, qVar);
                N0.writeStringArray((String[]) this.f50564b);
                iVar.S0(N0, 5);
                return;
        }
    }

    @Override
    public void b() {
        l0 l0Var = (l0) this.f50564b;
        l0Var.f6455a.lock();
        try {
            l0Var.f6463m = new f0(l0Var, l0Var.f6460j, l0Var.f6461k, l0Var.d, l0Var.f6462l, l0Var.f6455a, l0Var.f6457c);
            l0Var.f6463m.y();
            l0Var.f6456b.signalAll();
        } finally {
            l0Var.f6455a.unlock();
        }
    }

    @Override
    public void c(h1 h1Var) {
        c3 c3Var = ((o5) this.f50564b).E;
        if (c3Var != null) {
            w3 w3Var = c3Var.f15232a;
            w3.S1(w3Var, h1Var);
            w3Var.f15656i3.o(h1Var, true);
        }
    }

    public Bundle c0() {
        Bundle bundle = (Bundle) this.f50564b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override
    public void close() {
        ((hi.r) this.f50564b).finishFragment();
    }

    @Override
    public void d(k kVar, boolean z10) {
        ((g.r) this.f50564b).g(kVar);
    }

    public eb.i d0(Object obj) {
        eb.g gVar = ((hb.a0) this.f50564b).f11732b;
        gVar.getClass();
        if (obj == null) {
            return eb.k.f8580a;
        }
        Class<?> cls = obj.getClass();
        hb.n nVar = new hb.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    @Override
    public boolean e() {
        o5 o5Var = (o5) this.f50564b;
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f15157a != null) {
            return c3Var.f15232a.Y4();
        }
        return false;
    }

    public float e0(int i10, int i11, int i12, int i13) {
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z11;
        c cVar;
        int i22;
        boolean z12 = true;
        if (Math.abs(i13 - i11) > Math.abs(i12 - i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i23 = 2;
        int i24 = (-abs) / 2;
        int i25 = -1;
        if (i14 < i16) {
            i18 = 1;
        } else {
            i18 = -1;
        }
        if (i15 < i17) {
            i25 = 1;
        }
        int i26 = i16 + i18;
        int i27 = i14;
        int i28 = i15;
        int i29 = 0;
        while (true) {
            if (i27 != i26) {
                if (z10) {
                    i20 = i28;
                } else {
                    i20 = i27;
                }
                if (z10) {
                    i21 = i27;
                } else {
                    i21 = i28;
                }
                boolean z13 = z10;
                if (i29 == z12) {
                    z11 = z12;
                    i22 = abs;
                    cVar = this;
                } else {
                    z11 = false;
                    cVar = this;
                    i22 = abs;
                }
                if (z11 == ((ec.b) cVar.f50564b).b(i20, i21)) {
                    if (i29 == 2) {
                        return f7.b(i27, i28, i14, i15);
                    }
                    i29++;
                }
                i24 += abs2;
                if (i24 > 0) {
                    if (i28 == i17) {
                        i19 = 2;
                        break;
                    }
                    i28 += i25;
                    i24 -= i22;
                }
                i27 += i18;
                abs = i22;
                z10 = z13;
                z12 = true;
                i23 = 2;
            } else {
                i19 = i23;
                break;
            }
        }
        if (i29 == i19) {
            return f7.b(i26, i17, i14, i15);
        }
        return Float.NaN;
    }

    @Override
    public void f(int i10, int i11) {
        h2 h2Var;
        o5 o5Var = (o5) this.f50564b;
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f15157a != null && (h2Var = c3Var.f15232a.K3) != null) {
            h2Var.f(i10, i11);
        }
    }

    public float f0(int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        ec.b bVar = (ec.b) this.f50564b;
        float e02 = e0(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f7 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.f8589a;
            if (i14 >= i16) {
                int i17 = i16 - 1;
                f7 = ((i16 - 1) - i10) / (i14 - i10);
                i14 = i17;
            } else {
                f7 = 1.0f;
            }
        }
        float f11 = i11;
        int i18 = (int) (f11 - ((i13 - i11) * f7));
        if (i18 < 0) {
            f10 = f11 / (i11 - i18);
        } else {
            int i19 = bVar.f8590b;
            if (i18 >= i19) {
                f10 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f10 = 1.0f;
            }
        }
        return (e0(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + e02) - 1.0f;
    }

    @Override
    public Object f2() {
        Type type = (Type) this.f50564b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new RuntimeException("Invalid EnumSet type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumSet type: " + type.toString());
    }

    @Override
    public void g(k6.a aVar) {
        com.google.android.gms.common.api.internal.w wVar = (com.google.android.gms.common.api.internal.w) this.f50564b;
        wVar.f6523o.lock();
        try {
            wVar.f6521m = aVar;
            com.google.android.gms.common.api.internal.w.l(wVar);
        } finally {
            wVar.f6523o.unlock();
        }
    }

    @Override
    public void h(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f50564b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f2687b;
        int i10 = aVar.f2686a;
        if (intent == null) {
            extras = null;
        } else {
            extras = intent.getExtras();
        }
        if (i10 != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
        }
        int i11 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f4757a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.O;
        if (resultReceiver != null) {
            resultReceiver.send(i11, extras);
        } else {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i11 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i11);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public void j(long j10) {
        ((hi.r) this.f50564b).presentFragment(sn.W9(j10));
    }

    @Override
    public void l(Bitmap bitmap) {
        g6.b bVar = h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f7 = width;
            int height = bitmap.getHeight();
            int B = (int) a1.g.B(f7, 9.0f, 16.0f, 0.5f);
            float f10 = (B - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f10, f7, height + f10);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, B, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((h) this.f50564b).e(bitmap2, 0);
    }

    @Override
    public void m0(MessageObject messageObject) {
        ((q9) ((p4) this.f50564b).Q1).f(true);
    }

    @Override
    public void n(int i10) {
        com.google.android.gms.common.api.internal.w wVar = (com.google.android.gms.common.api.internal.w) this.f50564b;
        Lock lock = wVar.f6523o;
        lock.lock();
        try {
            if (wVar.f6522n) {
                wVar.f6522n = false;
                com.google.android.gms.common.api.internal.w.k(wVar, i10);
            } else {
                wVar.f6522n = true;
                wVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public boolean o(k kVar) {
        Window.Callback callback = ((g.r) this.f50564b).f10727f.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    @Override
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((j) this.f50564b).f7879c, "launchApplication", task);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        r6 r6Var = (r6) this.f50564b;
        o6 o6Var = r6Var.L;
        AndroidUtilities.cancelRunOnUIThread(o6Var);
        j81 j81Var = r6Var.f9753y;
        if (j81Var != null && j81Var.y()) {
            AndroidUtilities.runOnUIThread(o6Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((r6) this.f50564b).i();
    }

    @Override
    public void p(Bundle bundle) {
        com.google.android.gms.common.api.internal.w wVar = (com.google.android.gms.common.api.internal.w) this.f50564b;
        wVar.f6523o.lock();
        try {
            wVar.f6521m = k6.a.e;
            com.google.android.gms.common.api.internal.w.l(wVar);
        } finally {
            wVar.f6523o.unlock();
        }
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public void q() {
        boolean z10;
        hi.r rVar = (hi.r) this.f50564b;
        ne.b bVar = rVar.f12240a;
        s0 s0Var = rVar.v;
        if (s0Var.f12260n && s0Var.f12258l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        rVar.d.Z2.N(true);
    }

    @Override
    public void r(gh ghVar) {
        NotificationCenter.getInstance(ig.m.a0((ig.m) this.f50564b)).doOnIdle(ghVar);
    }

    @Override
    public boolean s(h1 h1Var) {
        return false;
    }

    @Override
    public boolean u() {
        return false;
    }

    @Override
    public Paint.FontMetricsInt v() {
        return ((m) this.f50564b).f9410f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void x(CharSequence charSequence) {
        c3 c3Var = ((o5) this.f50564b).E;
        if (c3Var != null && charSequence != null && charSequence.length() > 0) {
            c3Var.f15232a.z4(charSequence.toString());
        }
    }

    @Override
    public void y() {
        l0 l0Var = (l0) this.f50564b;
        for (com.google.android.gms.common.api.c cVar : l0Var.f6458f.values()) {
            cVar.disconnect();
        }
        l0Var.f6465o.F = Collections.EMPTY_SET;
    }

    @Override
    public void z(MessageObject messageObject) {
        ((q9) ((p4) this.f50564b).Q1).f(false);
    }

    public c(g6.r rVar, String[] strArr) {
        this.f50563a = 19;
        this.f50564b = strArr;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public c(Object obj, int i10) {
        this.f50563a = i10;
        this.f50564b = obj;
    }

    public c() {
        this.f50563a = 0;
        this.f50564b = new HashSet();
    }

    public c(Bundle bundle) {
        this.f50563a = 12;
        this.f50564b = new Bundle(bundle);
    }

    @Override
    public void E() {
    }

    @Override
    public void J() {
    }

    @Override
    public void m() {
    }

    @Override
    public void L(String str) {
    }

    @Override
    public void O(Object obj) {
    }

    @Override
    public void X(TLRPC.User user) {
    }

    @Override
    public void a(Bundle bundle) {
    }

    @Override
    public void k(h1 h1Var) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void w(int i10) {
    }

    @Override
    public void onError(j81 j81Var, Exception exc) {
    }

    @Override
    public void B(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void i(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void t(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override
    public void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override
    public void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
