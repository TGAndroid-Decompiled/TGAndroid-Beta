package r2;

import android.content.res.Resources;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ig.q1;
import ig.s0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.Callable;
import jg.c2;
import jg.i2;
import org.json.JSONArray;
import org.json.JSONException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ba;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.e31;
import org.telegram.ui.ix0;
import org.telegram.ui.lw0;
import rh.e4;
import s4.i1;
import s4.n0;
import s4.o0;
import th.c3;
import th.k7;
import th.l7;
import vh.d8;
import vh.e8;
import vh.k4;
import vh.n5;
import vh.o8;
import vh.s7;
import vh.t8;
import vh.x3;
public class y implements m, com.google.android.gms.common.api.internal.o, fp0, i1, com.google.android.gms.common.api.internal.s, e31, k7, v0.h, c2, t8, w2.d, wd.b, Continuation, y2.g {
    public final int f46300a;
    public Object f46301b;

    public y(Object obj, int i10) {
        this.f46300a = i10;
        this.f46301b = obj;
    }

    public static boolean Y(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static String b0(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    @Override
    public void A(boolean z10) {
        i2 i2Var;
        o8 o8Var = ((d8) ((k4) this.f46301b)).C0;
        s7 s7Var = o8Var.f51687v1;
        if (s7Var != null) {
            i2 i2Var2 = null;
            if (!z10 && (s7Var.getSelectedEntity() instanceof i2)) {
                o8Var.f51687v1.A0(null, true);
            } else if (z10 && !(o8Var.f51687v1.getSelectedEntity() instanceof i2)) {
                x3 x3Var = o8Var.f51687v1.A0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < x3Var.getChildCount()) {
                        View childAt = x3Var.getChildAt(i11);
                        if (childAt instanceof i2) {
                            i2Var = (i2) childAt;
                            break;
                        }
                        i11++;
                    } else {
                        i2Var = null;
                        break;
                    }
                }
                if (i2Var != null) {
                    s7 s7Var2 = o8Var.f51687v1;
                    x3 x3Var2 = s7Var2.A0;
                    while (true) {
                        if (i10 >= x3Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = x3Var2.getChildAt(i10);
                        if (childAt2 instanceof i2) {
                            i2Var2 = (i2) childAt2;
                            break;
                        }
                        i10++;
                    }
                    s7Var2.A0(i2Var2, true);
                }
            }
        }
    }

    @Override
    public void B(float f7, int i10) {
        ArrayList arrayList;
        k4 k4Var = (k4) this.f46301b;
        n5 n5Var = k4Var.d;
        if (n5Var != null && (arrayList = n5Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((n5) k4Var.d.T.get(i10)).V = f7;
        }
    }

    @Override
    public void B0() {
        wb k10 = ((e4) this.f46301b).k().k(false);
        k10.f32211t = true;
        k10.j();
    }

    @Override
    public View C(int i10) {
        return ((n0) this.f46301b).q(i10);
    }

    @Override
    public void D(float f7) {
        k4 k4Var = (k4) this.f46301b;
        n5 n5Var = k4Var.d;
        if (n5Var == null) {
            return;
        }
        n5Var.F = f7;
        n5Var.f51549j = true;
        k4Var.w(true);
    }

    @Override
    public int E(View view) {
        return n0.y(view) + ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).rightMargin;
    }

    @Override
    public void F(float f7) {
        k4 k4Var = (k4) this.f46301b;
        n5 n5Var = k4Var.d;
        if (n5Var == null) {
            return;
        }
        n5Var.E = f7;
        n5Var.f51549j = true;
        k4Var.w(true);
    }

    @Override
    public void G(float f7) {
        s7 s7Var = (s7) this.f46301b;
        s0.e(s7Var.f50986o1).k(String.valueOf(ig.h.f8316a.indexOf(s7Var.f51003x0.getCurrentBrush())), f7);
        q1 q1Var = s7Var.f50978j1;
        q1Var.f8435c = f7;
        s7Var.B0(q1Var, null, false);
    }

    @Override
    public void H(float f7, int i10) {
        ArrayList arrayList;
        k4 k4Var = (k4) this.f46301b;
        n5 n5Var = k4Var.d;
        if (n5Var != null && (arrayList = n5Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((n5) k4Var.d.T.get(i10)).W = f7;
        }
    }

    public s0.c I(int i10) {
        return null;
    }

    @Override
    public void J(float f7) {
        n5 n5Var = ((k4) this.f46301b).d;
        if (n5Var == null) {
            return;
        }
        n5Var.f51530a0 = f7;
        n5Var.f51549j = true;
    }

    @Override
    public void K() {
        ((k4) this.f46301b).p(null);
    }

    @Override
    public void L(float f7) {
        k4 k4Var = (k4) this.f46301b;
        n5 n5Var = k4Var.d;
        if (n5Var == null) {
            return;
        }
        n5Var.f51569t0 = f7;
        n5Var.f51549j = true;
        k4Var.y(true);
    }

    @Override
    public void N(int i10, long j10) {
        ArrayList arrayList;
        k4 k4Var = (k4) this.f46301b;
        n5 n5Var = k4Var.d;
        if (n5Var != null && (arrayList = n5Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((n5) k4Var.d.T.get(i10)).X = j10;
        }
    }

    @Override
    public void O(long j10) {
        k4 k4Var = (k4) this.f46301b;
        n5 n5Var = k4Var.d;
        if (n5Var == null) {
            return;
        }
        n5Var.D = j10;
        n5Var.f51549j = true;
        k4Var.w(true);
    }

    public int P(int[] iArr, int i10) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        int i13;
        yb.a aVar = (yb.a) this.f46301b;
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
                int i17 = aVar.f54386a[aVar.f54390g + i16];
                if (i17 == 0) {
                    i13 = iArr2[iArr2.length - 1];
                } else {
                    if (i17 == 1) {
                        i12 = 0;
                        for (int i18 : iArr2) {
                            yb.a aVar2 = yb.a.h;
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
            yb.b bVar = new yb.b(aVar, iArr5);
            yb.b a2 = aVar.a(i10, 1);
            yb.b bVar2 = aVar.f54388c;
            if (a2.d() >= bVar.d()) {
                a2 = bVar;
                bVar = a2;
            }
            yb.b bVar3 = aVar.d;
            yb.b bVar4 = a2;
            yb.b bVar5 = bVar;
            yb.b bVar6 = bVar4;
            yb.b bVar7 = bVar2;
            while (bVar6.d() * 2 >= i10) {
                if (!bVar6.e()) {
                    int b10 = aVar.b(bVar6.c(bVar6.d()));
                    yb.b bVar8 = bVar2;
                    while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                        int d = bVar5.d() - bVar6.d();
                        int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                        bVar8 = bVar8.a(aVar.a(d, c10));
                        bVar5 = bVar5.a(bVar6.h(d, c10));
                    }
                    yb.b a10 = bVar8.g(bVar3).a(bVar7);
                    if (bVar5.d() < bVar6.d()) {
                        yb.b bVar9 = bVar5;
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
                yb.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
                yb.b bVar10 = bVarArr[0];
                yb.b bVar11 = bVarArr[1];
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
                    if (aVar.f54390g != 0) {
                        iArr7[i22] = aVar.c(c13, b12);
                    }
                }
                for (int i25 = 0; i25 < iArr3.length; i25++) {
                    int length4 = iArr.length - 1;
                    int i26 = iArr3[i25];
                    if (i26 != 0) {
                        int i27 = length4 - aVar.f54387b[i26];
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

    public s0.c Q(int i10) {
        return null;
    }

    public boolean R(String str) {
        String X = X(str);
        if (!"1".equals(X) && !Boolean.parseBoolean(X)) {
            return false;
        }
        return true;
    }

    public Integer S(String str) {
        String X = X(str);
        if (!TextUtils.isEmpty(X)) {
            try {
                return Integer.valueOf(Integer.parseInt(X));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + b0(str) + "(" + X + ") into an int");
                return null;
            }
        }
        return null;
    }

    public JSONArray T(String str) {
        String X = X(str);
        if (!TextUtils.isEmpty(X)) {
            try {
                return new JSONArray(X);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + b0(str) + ": " + X + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public StringBuilder U() {
        xe.a aVar = (xe.a) this.f46301b;
        if (aVar instanceof se.m) {
            StringBuilder sb2 = ((se.m) aVar).f48261b.f48247b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    public String W(Resources resources, String str, String str2) {
        String[] strArr;
        String X = X(str2);
        if (!TextUtils.isEmpty(X)) {
            return X;
        }
        String X2 = X(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(X2)) {
            return null;
        }
        int identifier = resources.getIdentifier(X2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", b0(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray T = T(str2.concat("_loc_args"));
        if (T == null) {
            strArr = null;
        } else {
            int length = T.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = T.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + b0(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    public String X(String str) {
        String replace;
        Bundle bundle = (Bundle) this.f46301b;
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

    public Bundle Z() {
        Bundle bundle = (Bundle) this.f46301b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override
    public void a(int i10, int i11, int i12, long j10) {
        ((MediaCodec) this.f46301b).queueInputBuffer(i10, 0, i11, j10, i12);
    }

    public boolean a0(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f46300a) {
            case 5:
                s6.f fVar = new s6.f(0, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).v();
                Parcel J0 = eVar.J0();
                k7.a.d(J0, fVar);
                k7.a.c(J0, (s6.a) this.f46301b);
                eVar.K0(J0, 1);
                return;
            default:
                v8.j jVar = (v8.j) this.f46301b;
                e8.b bVar = (e8.b) obj;
                Bundle H = bVar.H();
                H.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                e8.a aVar = new e8.a(0, (TaskCompletionSource) obj2);
                try {
                    e8.i iVar = (e8.i) bVar.v();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = e8.c.f6313a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    H.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    iVar.f6321a.transact(19, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e);
                    Bundle bundle = Bundle.EMPTY;
                    aVar.P(Status.h, null);
                    return;
                }
        }
    }

    @Override
    public void b(int i10, h2.d dVar, long j10, int i11) {
        ((MediaCodec) this.f46301b).queueSecureInputBuffer(i10, 0, dVar.f7583i, j10, i11);
    }

    @Override
    public void d(long j10, int i10, th.i2 i2Var) {
        int i11 = ProfileStoriesView.f34063s0;
        ((lw0) this.f46301b).f(true, false);
        i2Var.run();
    }

    @Override
    public void e(int i10) {
        vh.x xVar = ((k4) this.f46301b).E;
        if (xVar != null) {
            ArrayList arrayList = xVar.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                vh.w wVar = (vh.w) obj;
                if (wVar.f52087a == i10) {
                    wVar.f52088b.e(true, 1.0f);
                    xVar.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public void f(float f7) {
        k4 k4Var = (k4) this.f46301b;
        n5 n5Var = k4Var.d;
        if (n5Var == null) {
            return;
        }
        n5Var.f51571u0 = f7;
        n5Var.f51549j = true;
        k4Var.c();
    }

    @Override
    public void g(Object obj) {
        w0.d e = (w0.d) obj;
        kotlin.jvm.internal.i.e(e, "e");
        td.m mVar = (td.m) this.f46301b;
        if (mVar.w()) {
            mVar.resumeWith(l9.b.a(e));
        }
    }

    @Override
    public float get() {
        s7 s7Var = (s7) this.f46301b;
        int i10 = s7Var.f50986o1;
        ig.h currentBrush = s7Var.f51003x0.getCurrentBrush();
        if (currentBrush == null) {
            return s0.e(i10).f8457i;
        }
        return s0.e(i10).f(String.valueOf(ig.h.f8316a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public void h(float f7) {
        k4 k4Var = (k4) this.f46301b;
        n5 n5Var = k4Var.d;
        if (n5Var == null) {
            return;
        }
        n5Var.G = f7;
        n5Var.f51549j = true;
        k4Var.c();
    }

    @Override
    public void i(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        ba baVar = (ba) obj;
        androidx.activity.o oVar = ((r7.i) this.f46301b).f46361b;
        synchronized (oVar) {
            oVar.f953b = false;
            nVar = ((com.google.android.gms.common.api.internal.p) oVar.f954c).f4459c;
        }
        if (nVar != null) {
            ((r7.c) oVar.d).c(nVar, 2441);
        }
    }

    @Override
    public void j(long j10, boolean z10) {
        k4 k4Var = (k4) this.f46301b;
        if (!z10) {
            k4Var.m(j10);
            return;
        }
        v61 v61Var = k4Var.e;
        if (v61Var != null) {
            v61Var.q0(j10, true);
        } else if (k4Var.j()) {
            k4Var.E.m(j10, true);
        } else {
            v61 v61Var2 = k4Var.D;
            if (v61Var2 != null) {
                v61Var2.q0(j10, false);
            }
        }
    }

    @Override
    public int k(View view) {
        return n0.x(view) - ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).leftMargin;
    }

    @Override
    public k4.d l(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        ((l2.d) this.f46301b).f11578a.y(iOException);
        return y2.l.e;
    }

    @Override
    public void m() {
        k4 k4Var = (k4) this.f46301b;
        k4Var.s(null, null, true);
        o8 o8Var = ((d8) k4Var).C0;
        d8 d8Var = o8Var.X0;
        if (d8Var != null) {
            d8Var.s(null, null, true);
        }
        s7 s7Var = o8Var.f51687v1;
        if (s7Var != null) {
            s7Var.n0();
        }
        e8 e8Var = o8Var.f51628c1;
        if (e8Var != null) {
            e8Var.setHasRoundVideo(false);
        }
        n5 n5Var = o8Var.K1;
        if (n5Var != null) {
            File file = n5Var.f51559o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                o8Var.K1.f51559o0 = null;
            }
            if (o8Var.K1.f51561p0 != null) {
                try {
                    new File(o8Var.K1.f51561p0).delete();
                } catch (Exception unused2) {
                }
                o8Var.K1.f51561p0 = null;
            }
        }
    }

    @Override
    public void o(y2.i iVar, long j10, long j11) {
        boolean z10;
        l2.d dVar = (l2.d) this.f46301b;
        synchronized (z2.b.f54564b) {
            z10 = z2.b.f54565c;
        }
        if (!z10) {
            dVar.f11578a.y(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.a();
    }

    @Override
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        td.m mVar = (td.m) this.f46301b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override
    public java.lang.Object p(wd.c r7, ed.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: r2.y.p(wd.c, ed.c):java.lang.Object");
    }

    @Override
    public void q(boolean z10, float f7) {
        k4 k4Var = (k4) this.f46301b;
        n5 n5Var = k4Var.d;
        if (n5Var != null) {
            n5Var.Z = f7;
            n5Var.f51549j = true;
            v61 v61Var = k4Var.e;
            if (v61Var != null && v61Var.U() != -9223372036854775807L) {
                k4Var.m(f7 * ((float) k4Var.e.U()));
            }
        }
    }

    @Override
    public void r(float f7) {
        k4 k4Var = (k4) this.f46301b;
        n5 n5Var = k4Var.d;
        if (n5Var == null) {
            return;
        }
        n5Var.f51567s0 = f7;
        n5Var.f51549j = true;
        k4Var.y(true);
    }

    @Override
    public int s() {
        return ((n0) this.f46301b).D();
    }

    @Override
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.f46301b).setParameters(bundle);
    }

    @Override
    public void t(boolean z10) {
        k4 k4Var = (k4) this.f46301b;
        if (k4Var.j()) {
            k4Var.E.getClass();
        }
        k4Var.x(-4, z10);
    }

    @Override
    public Object then(Task task) {
        return ((Callable) this.f46301b).call();
    }

    @Override
    public void u(float f7, int i10) {
        ArrayList arrayList;
        k4 k4Var = (k4) this.f46301b;
        n5 n5Var = k4Var.d;
        if (n5Var != null && (arrayList = n5Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((n5) k4Var.d.T.get(i10)).P = f7;
        }
    }

    @Override
    public boolean v(long j10, int i10, int i11, int i12, l7 l7Var) {
        ImageReceiver imageReceiver;
        c3 c3Var;
        c3 c3Var2;
        c3 c3Var3;
        c3 c3Var4;
        l7Var.f49198b = null;
        l7Var.f49199c = null;
        lw0 lw0Var = (lw0) this.f46301b;
        ix0 ix0Var = lw0Var.h;
        ArrayList arrayList = lw0Var.f34089x;
        if (lw0Var.N < 0.2f) {
            l7Var.f49198b = ix0Var.getImageReceiver();
            l7Var.f49199c = null;
            l7Var.f49197a = ix0Var;
            l7Var.h = 0.0f;
            l7Var.f49202i = i0.f16172q.y;
            l7Var.f49201g = (View) lw0Var.getParent();
            l7Var.d = lw0Var.D;
            l7Var.f49207n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 < arrayList.size()) {
                c3 c3Var5 = (c3) arrayList.get(i13);
                if (c3Var5.e >= 1.0f && c3Var5.f48844a == i11) {
                    int i14 = i13 - 1;
                    if (i14 >= 0) {
                        c3Var3 = (c3) arrayList.get(i14);
                    } else {
                        c3Var3 = null;
                    }
                    int i15 = i13 - 2;
                    if (i15 >= 0) {
                        c3Var4 = (c3) arrayList.get(i15);
                    } else {
                        c3Var4 = null;
                    }
                    c3 d = ProfileStoriesView.d(c3Var3, c3Var4, c3Var5);
                    imageReceiver = c3Var5.f48845b;
                    c3Var2 = d;
                    c3Var = c3Var5;
                } else {
                    i13++;
                }
            } else {
                imageReceiver = null;
                c3Var = null;
                c3Var2 = null;
                break;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        l7Var.f49199c = imageReceiver;
        l7Var.f49198b = null;
        l7Var.f49197a = lw0Var;
        l7Var.h = 0.0f;
        l7Var.f49202i = i0.f16172q.y;
        l7Var.f49201g = (View) lw0Var.getParent();
        if (c3Var != null && c3Var2 != null) {
            l7Var.f49200f = new f1.a(this, new RectF(c3Var.f48853m), c3Var, new RectF(c3Var2.f48853m), c3Var2);
            return true;
        }
        l7Var.f49200f = null;
        return true;
    }

    @Override
    public void w(float f7) {
        k4 k4Var = (k4) this.f46301b;
        n5 n5Var = k4Var.d;
        if (n5Var == null) {
            return;
        }
        n5Var.P = f7;
        k4Var.c();
    }

    @Override
    public int y() {
        n0 n0Var = (n0) this.f46301b;
        return n0Var.f47998m - n0Var.E();
    }

    @Override
    public void z(long j10) {
        k4 k4Var = (k4) this.f46301b;
        n5 n5Var = k4Var.d;
        if (n5Var == null) {
            return;
        }
        n5Var.f51565r0 = j10;
        n5Var.f51549j = true;
        k4Var.y(true);
    }

    public y(s6.g gVar, s6.a aVar) {
        this.f46300a = 5;
        this.f46301b = aVar;
    }

    public y(Bundle bundle) {
        this.f46300a = 17;
        this.f46301b = new Bundle(bundle);
    }

    public y(int i10) {
        this.f46300a = i10;
        switch (i10) {
            case 10:
                return;
            case 14:
                this.f46301b = new t7.u(28);
                return;
            default:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f46301b = new dg0(this);
                    return;
                } else {
                    this.f46301b = new dg0(this);
                    return;
                }
        }
    }

    @Override
    public void V() {
    }

    @Override
    public void flush() {
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void start() {
    }

    @Override
    public void x() {
    }

    @Override
    public void c(boolean z10) {
    }

    @Override
    public void M(y2.i iVar, long j10, long j11, boolean z10) {
    }

    @Override
    public void n(y2.i iVar, long j10, long j11, int i10) {
    }
}
