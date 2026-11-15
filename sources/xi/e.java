package xi;

import a0.k;
import a8.p9;
import ab.c0;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.ViewGroup;
import androidx.fragment.app.j0;
import androidx.fragment.app.m0;
import androidx.fragment.app.p0;
import androidx.fragment.app.s;
import c4.l;
import c4.m;
import com.google.android.gms.internal.vision.e2;
import h2.j;
import h2.l0;
import h2.x;
import h9.i0;
import h9.o;
import h9.s1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import jg.w;
import org.telegram.messenger.a8;
import org.telegram.messenger.f6;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.is;
import org.telegram.messenger.j6;
import org.telegram.messenger.js;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.r0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.an;
import org.telegram.ui.ay0;
import org.telegram.ui.fe;
import org.telegram.ui.hy0;
import org.telegram.ui.ld0;
import org.telegram.ui.web.a1;
import org.telegram.ui.web.b1;
import q4.q;
import ug.x0;
public final class e implements m, js, hy0, q5.b {
    public static volatile e f60054e;
    public Object f60055a;
    public Object f60056b;
    public Object f60057c;
    public Object d;

    public e(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f60055a = obj;
        this.f60056b = obj2;
        this.f60057c = obj3;
        this.d = obj4;
    }

    public static void H(long j3, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j3) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            hashMap.remove(arrayList.get(i7));
        }
    }

    public static void h(String str, String str2, HashMap hashMap) {
        b1 b1Var = new b1();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i7 = 0; i7 < split.length; i7++) {
            String trim = split[i7].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i7 != 0 && indexOf >= 0) {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = e2.k(trim3, 1, 1);
                    }
                    b1Var.f52582b.put(trim2, trim3);
                } else {
                    b1Var.f52581a = trim;
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), b1Var);
    }

    public void A(p0 p0Var) {
        s sVar = p0Var.f2424c;
        String str = sVar.f2450e;
        HashMap hashMap = (HashMap) this.f60056b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(sVar.f2450e, p0Var);
        if (j0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + sVar);
        }
    }

    public void B(p0 p0Var) {
        HashMap hashMap = (HashMap) this.f60056b;
        s sVar = p0Var.f2424c;
        if (sVar.T) {
            ((m0) this.d).f(sVar);
        }
        if (hashMap.get(sVar.f2450e) == p0Var && ((p0) hashMap.put(sVar.f2450e, null)) != null && j0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public void C(float f10, float f11) {
        ji.e eVar;
        int[] iArr = (int[]) this.f60056b;
        int[] iArr2 = (int[]) this.f60055a;
        ji.m mVar = (ji.m) this.d;
        gf gfVar = mVar.f17571b;
        if (!Float.isNaN(f10) && (eVar = mVar.K) != null && mVar.f17573c != 0) {
            eVar.getLocationInWindow(iArr2);
            ((ViewGroup) this.f60057c).getLocationInWindow(iArr);
            gfVar.g((f10 + iArr2[1]) - iArr[1], f11);
            return;
        }
        gfVar.g(Float.NaN, 0.0f);
    }

    public void D(float f10, float f11, float f12, float f13) {
        ji.m mVar = (ji.m) this.d;
        int[] iArr = mVar.f17575d0;
        int[] iArr2 = mVar.f17574c0;
        EditTextBoldCursor editTextBoldCursor = mVar.X;
        if (editTextBoldCursor != null && mVar.K != null) {
            int max = Math.max(1, Math.round(f12 - f10));
            int max2 = Math.max(1, Math.round(f13 - f11));
            ViewGroup.LayoutParams layoutParams = editTextBoldCursor.getLayoutParams();
            if (layoutParams != null && (layoutParams.width != max || layoutParams.height != max2)) {
                layoutParams.width = max;
                layoutParams.height = max2;
                editTextBoldCursor.setLayoutParams(layoutParams);
            }
            mVar.K.getLocationInWindow(iArr2);
            editTextBoldCursor.getLocationInWindow(iArr);
            editTextBoldCursor.setTranslationX((iArr2[0] + f10) - (iArr[0] - editTextBoldCursor.getTranslationX()));
            editTextBoldCursor.setTranslationY((iArr2[1] + f11) - (iArr[1] - editTextBoldCursor.getTranslationY()));
        }
    }

    public kf.f E(String str) {
        if (str != null) {
            gf.g gVar = new gf.g((ArrayList) this.f60055a, (lf.b) this.f60057c, (ArrayList) this.f60056b);
            int i7 = 0;
            while (true) {
                int length = str.length();
                int i10 = i7;
                while (true) {
                    if (i10 < length) {
                        char charAt = str.charAt(i10);
                        if (charAt == '\n' || charAt == '\r') {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 == -1) {
                    break;
                }
                gVar.i(str.substring(i7, i10));
                i7 = i10 + 1;
                if (i7 < str.length() && str.charAt(i10) == '\r' && str.charAt(i7) == '\n') {
                    i7 = i10 + 2;
                }
            }
            if (str.length() > 0 && (i7 == 0 || i7 < str.length())) {
                gVar.i(str.substring(i7));
            }
            gVar.f(gVar.f13245n);
            lf.a a10 = gVar.f13241j.a(new wf.b(23, gVar.f13242k, gVar.f13244m));
            for (mf.a aVar : gVar.f13246o) {
                aVar.g(a10);
            }
            kf.f fVar = (kf.f) gVar.f13243l.f13231b;
            Iterator it = ((ArrayList) this.d).iterator();
            if (!it.hasNext()) {
                return fVar;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
        throw new NullPointerException("input must not be null");
    }

    public HashMap F(BufferedReader bufferedReader) {
        String str;
        StringBuilder sb2;
        HashMap hashMap = new HashMap();
        loop0: while (true) {
            str = null;
            sb2 = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break loop0;
                }
                long[] jArr = (long[]) this.d;
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                String trim = readLine.trim();
                if (trim.isEmpty()) {
                    break loop0;
                } else if (str != null && sb2 != null) {
                    sb2.append(trim);
                    if (!trim.endsWith(";")) {
                        break;
                    }
                } else {
                    int indexOf = trim.indexOf(58);
                    if (indexOf >= 0) {
                        String trim2 = trim.substring(0, indexOf).trim();
                        String trim3 = trim.substring(indexOf + 1).trim();
                        if (trim3.endsWith(";")) {
                            sb2 = e2.m(trim3);
                            str = trim2;
                        } else {
                            h(trim2, trim3, hashMap);
                        }
                    }
                }
            }
            h(str, sb2.toString(), hashMap);
        }
        if (str != null && sb2 != null) {
            h(str, sb2.toString(), hashMap);
        }
        return hashMap;
    }

    public void G() {
        boolean z10;
        if (((d) this.f60056b) == null) {
            d dVar = (d) ((ArrayDeque) this.f60055a).pollFirst();
            this.f60056b = dVar;
            if (dVar != null) {
                b bVar = new b(this, dVar, 0);
                this.f60057c = bVar;
                g0.i3(bVar, 10000L);
                a aVar = dVar.f60052b;
                String str = aVar.f60042b;
                String str2 = aVar.f60045f;
                c cVar = new c(this, dVar);
                ld0 k10 = i.k(str);
                byte[] f10 = i.f(str2);
                int i7 = 0;
                if (k10 != null && f10 != null) {
                    try {
                        z10 = p9.a("WEB_MESSAGE_LISTENER");
                    } catch (Throwable th2) {
                        a8.g(th2, true);
                        z10 = false;
                    }
                    if (z10) {
                        synchronized (i.f60064y) {
                            i iVar = i.A;
                            if (iVar != null) {
                                iVar.q();
                                i.A = null;
                            }
                            try {
                                i iVar2 = new i(k10, str2, f10);
                                i.A = iVar2;
                                iVar2.f60086x = cVar;
                                r0 r0Var = r0.f26183f;
                                if (r0Var != null) {
                                    r0Var.d.add(iVar2);
                                }
                                iVar2.f60073j.execute(new f(iVar2, 1));
                                g0.h3(new f(iVar2, 2));
                                i7 = i.A.f60072i.getLocalPort();
                            } catch (Exception e10) {
                                a8.g(e10, true);
                                i iVar3 = i.A;
                                if (iVar3 != null) {
                                    iVar3.q();
                                    i.A = null;
                                }
                            }
                        }
                    }
                }
                dVar.d = i7;
                if (i7 == 0) {
                    m(dVar);
                }
            }
        }
    }

    public p2.b I(List list) {
        p2.b bVar;
        HashMap hashMap = (HashMap) this.f60057c;
        ArrayList i7 = i(list);
        if (i7.size() < 2) {
            return (p2.b) o.m(i7, null);
        }
        Collections.sort(i7, new w(9));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((p2.b) i7.get(0)).f54514c;
        int i12 = 0;
        while (true) {
            if (i12 >= i7.size()) {
                break;
            }
            p2.b bVar2 = (p2.b) i7.get(i12);
            if (i11 != bVar2.f54514c) {
                if (arrayList.size() == 1) {
                    return (p2.b) i7.get(0);
                }
            } else {
                arrayList.add(new Pair(bVar2.f54513b, Integer.valueOf(bVar2.d)));
                i12++;
            }
        }
        p2.b bVar3 = (p2.b) hashMap.get(arrayList);
        if (bVar3 == null) {
            List subList = i7.subList(0, arrayList.size());
            int i13 = 0;
            for (int i14 = 0; i14 < subList.size(); i14++) {
                i13 += ((p2.b) subList.get(i14)).d;
            }
            int nextInt = ((Random) this.d).nextInt(i13);
            int i15 = 0;
            while (true) {
                if (i10 < subList.size()) {
                    bVar = (p2.b) subList.get(i10);
                    i15 += bVar.d;
                    if (nextInt < i15) {
                        break;
                    }
                    i10++;
                } else {
                    bVar = (p2.b) o.n(subList);
                    break;
                }
            }
            hashMap.put(arrayList, bVar);
            return bVar;
        }
        return bVar3;
    }

    public Bundle J(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f60057c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    @Override
    public void K(byte[] bArr, int i7, int i10, l lVar, j jVar) {
        g2.b bVar;
        int i11;
        int i12;
        int i13;
        int A;
        int i14;
        int i15;
        int D;
        f4.a aVar = (f4.a) this.f60057c;
        x xVar = (x) this.f60056b;
        x xVar2 = (x) this.f60055a;
        xVar2.L(i7 + i10, bArr);
        xVar2.N(i7);
        if (((Inflater) this.d) == null) {
            this.d = new Inflater();
        }
        if (l0.Q(xVar2, xVar, (Inflater) this.d)) {
            xVar2.L(xVar.f13523c, xVar.f13521a);
        }
        int i16 = 0;
        aVar.d = 0;
        int[] iArr = aVar.f10918b;
        x xVar3 = aVar.f10917a;
        aVar.f10920e = 0;
        aVar.f10921f = 0;
        aVar.f10922g = 0;
        aVar.h = 0;
        aVar.f10923i = 0;
        xVar3.K(0);
        aVar.f10919c = false;
        ArrayList arrayList = new ArrayList();
        while (xVar2.a() >= 3) {
            int i17 = xVar2.f13523c;
            int A2 = xVar2.A();
            int H = xVar2.H();
            int i18 = xVar2.f13522b + H;
            if (i18 > i17) {
                xVar2.N(i17);
                i11 = i16;
                bVar = null;
            } else {
                char c10 = 128;
                if (A2 != 128) {
                    switch (A2) {
                        case 20:
                            if (H % 5 == 2) {
                                xVar2.O(2);
                                Arrays.fill(iArr, i16);
                                int i19 = H / 5;
                                int i20 = i16;
                                while (i20 < i19) {
                                    int A3 = xVar2.A();
                                    char c11 = c10;
                                    double A4 = xVar2.A();
                                    double A5 = xVar2.A() - 128;
                                    double A6 = xVar2.A() - 128;
                                    iArr[A3] = l0.i((int) ((A6 * 1.772d) + A4), 0, 255) | (xVar2.A() << 24) | (l0.i((int) ((1.402d * A5) + A4), 0, 255) << 16) | (l0.i((int) ((A4 - (0.34414d * A6)) - (A5 * 0.71414d)), 0, 255) << 8);
                                    i20++;
                                    c10 = c11;
                                    aVar = aVar;
                                }
                                aVar.f10919c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (H >= 4) {
                                xVar2.O(3);
                                if ((128 & xVar2.A()) != 0) {
                                    i15 = 1;
                                } else {
                                    i15 = i16;
                                }
                                int i21 = H - 4;
                                if (i15 != 0) {
                                    if (i21 >= 7 && (D = xVar2.D()) >= 4) {
                                        aVar.h = xVar2.H();
                                        aVar.f10923i = xVar2.H();
                                        xVar3.K(D - 4);
                                        i21 = H - 11;
                                    }
                                }
                                int i22 = xVar3.f13522b;
                                int i23 = xVar3.f13523c;
                                if (i22 < i23 && i21 > 0) {
                                    int min = Math.min(i21, i23 - i22);
                                    xVar2.k(i22, min, xVar3.f13521a);
                                    xVar3.N(i22 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (H >= 19) {
                                aVar.d = xVar2.H();
                                aVar.f10920e = xVar2.H();
                                xVar2.O(11);
                                aVar.f10921f = xVar2.H();
                                aVar.f10922g = xVar2.H();
                                break;
                            }
                            break;
                    }
                    i11 = 0;
                    bVar = null;
                } else {
                    if (aVar.d != 0 && aVar.f10920e != 0 && aVar.h != 0 && aVar.f10923i != 0 && (i12 = xVar3.f13523c) != 0 && xVar3.f13522b == i12 && aVar.f10919c) {
                        xVar3.N(0);
                        int i24 = aVar.h * aVar.f10923i;
                        int[] iArr2 = new int[i24];
                        int i25 = 0;
                        while (i25 < i24) {
                            int A7 = xVar3.A();
                            if (A7 != 0) {
                                i13 = i25 + 1;
                                iArr2[i25] = iArr[A7];
                            } else {
                                int A8 = xVar3.A();
                                if (A8 != 0) {
                                    if ((A8 & 64) == 0) {
                                        A = A8 & 63;
                                    } else {
                                        A = ((A8 & 63) << 8) | xVar3.A();
                                    }
                                    if ((A8 & 128) == 0) {
                                        i14 = iArr[0];
                                    } else {
                                        i14 = iArr[xVar3.A()];
                                    }
                                    i13 = A + i25;
                                    Arrays.fill(iArr2, i25, i13, i14);
                                }
                            }
                            i25 = i13;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, aVar.h, aVar.f10923i, Bitmap.Config.ARGB_8888);
                        float f10 = aVar.d;
                        float f11 = aVar.f10920e;
                        bVar = new g2.b(null, null, null, createBitmap, aVar.f10922g / f11, 0, 0, aVar.f10921f / f10, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar.h / f10, aVar.f10923i / f11, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    } else {
                        bVar = null;
                    }
                    i11 = 0;
                    aVar.d = 0;
                    aVar.f10920e = 0;
                    aVar.f10921f = 0;
                    aVar.f10922g = 0;
                    aVar.h = 0;
                    aVar.f10923i = 0;
                    xVar3.K(0);
                    aVar.f10919c = false;
                }
                xVar2.N(i18);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            i16 = i11;
        }
        jVar.accept(new c4.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override
    public int Q() {
        return 2;
    }

    @Override
    public void a() {
        g0.i3(new ay0((an) this.f60055a, (Activity) this.f60056b, (e6) this.f60057c, (gj) this.d, 2), 200L);
    }

    @Override
    public void b() {
        k kVar = (k) this.f60057c;
        if (((is) this.f60056b) == null) {
            return;
        }
        e eVar = (e) this.d;
        if (eVar != null) {
            eVar.b();
            this.d = null;
        }
        int i7 = kVar.f28b;
        for (int i10 = 0; i10 < i7; i10++) {
            ns nsVar = (ns) this.f60055a;
            is isVar = (is) this.f60056b;
            if (i10 >= 0) {
                if (i10 < kVar.f28b) {
                    nsVar.n(isVar, kVar.f27a[i10]);
                }
            } else {
                kVar.getClass();
            }
            StringBuilder m10 = i5.c.m(i10, "Index ", " must be in 0..");
            m10.append(kVar.f28b - 1);
            throw new IndexOutOfBoundsException(m10.toString());
        }
        kVar.f28b = 0;
        this.f60055a = null;
        this.f60056b = null;
    }

    public e c(int i7) {
        if (((is) this.f60056b) == null) {
            return this;
        }
        k kVar = (k) this.f60057c;
        int i10 = kVar.f28b + 1;
        int[] iArr = kVar.f27a;
        if (iArr.length < i10) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            kVar.f27a = copyOf;
        }
        int[] iArr2 = kVar.f27a;
        int i11 = kVar.f28b;
        iArr2[i11] = i7;
        kVar.f28b = i11 + 1;
        ((ns) this.f60055a).b((is) this.f60056b, i7);
        return this;
    }

    @Override
    public void d() {
        g0.i3(new fe((an) this.f60055a, (gj) this.d, 8), 200L);
    }

    public void e(s sVar) {
        if (!((ArrayList) this.f60055a).contains(sVar)) {
            synchronized (((ArrayList) this.f60055a)) {
                ((ArrayList) this.f60055a).add(sVar);
            }
            sVar.f2461w = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + sVar);
    }

    public e f(int i7) {
        if (((is) this.f60056b) == null) {
            return this;
        }
        if (((e) this.d) == null) {
            this.d = new e(ns.e(), (is) this.f60056b);
        }
        ((e) this.d).c(i7);
        return this;
    }

    @Override
    public void g() {
        an anVar = (an) this.f60055a;
        anVar.showDialog(new x0((org.telegram.ui.ActionBar.e2) anVar, 3, true));
    }

    @Override
    public Object mo24get() {
        return new c0((Executor) ((fd.a) this.f60055a).mo24get(), (v5.d) ((fd.a) this.f60056b).mo24get(), (ld0) ((ld0) this.f60057c).mo24get(), (w5.c) ((fd.a) this.d).mo24get(), 14);
    }

    public ArrayList i(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.f60055a;
        H(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.f60056b;
        H(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            p2.b bVar = (p2.b) list.get(i7);
            if (!hashMap.containsKey(bVar.f54513b) && !hashMap2.containsKey(Integer.valueOf(bVar.f54514c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public void j(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            z(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public fh.g k(ji.e eVar) {
        fh.g gVar;
        gh.a aVar;
        ChatActivityEnterView chatActivityEnterView = ((ji.m) this.d).f17571b.f34928a;
        int i7 = ChatActivityEnterView.N6;
        jh.f r02 = chatActivityEnterView.r0();
        dh.c cVar = chatActivityEnterView.D1;
        if (cVar != null && r02 != null && (gVar = r02.h) != null && (aVar = gVar.f11354w) != null) {
            return cVar.c(eVar, aVar, false);
        }
        return null;
    }

    public String l(String str) {
        ArrayList arrayList = (ArrayList) this.f60055a;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.f60056b);
            if (matcher.find()) {
                String group = matcher.group();
                if (!arrayList.contains(group)) {
                    arrayList.add(group + ";");
                }
                j(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e10) {
            arrayList.clear();
            a8.g(e10, true);
        }
        return TextUtils.join("", arrayList);
    }

    public void m(d dVar) {
        if (((d) this.f60056b) != dVar) {
            return;
        }
        b bVar = (b) this.f60057c;
        if (bVar != null) {
            g0.r(bVar);
            this.f60057c = null;
        }
        b bVar2 = (b) this.d;
        if (bVar2 != null) {
            g0.r(bVar2);
            this.d = null;
        }
        synchronized (i.f60064y) {
            try {
                i iVar = i.A;
                if (iVar != null) {
                    iVar.q();
                    i.A = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f60056b = null;
        dVar.f60053c.run(-1L);
        G();
    }

    public s n(String str) {
        p0 p0Var = (p0) ((HashMap) this.f60056b).get(str);
        if (p0Var != null) {
            return p0Var.f2424c;
        }
        return null;
    }

    public s o(String str) {
        for (p0 p0Var : ((HashMap) this.f60056b).values()) {
            if (p0Var != null) {
                s sVar = p0Var.f2424c;
                if (!str.equals(sVar.f2450e)) {
                    sVar = sVar.M.f2356c.o(str);
                }
                if (sVar != null) {
                    return sVar;
                }
            }
        }
        return null;
    }

    public ArrayList p() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.f60056b).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var);
            }
        }
        return arrayList;
    }

    public ArrayList q() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.f60056b).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var.f2424c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public float r() {
        EditTextBoldCursor editTextBoldCursor = ((ji.m) this.d).X;
        if (editTextBoldCursor == null) {
            return -1.0f;
        }
        if (editTextBoldCursor.getLayout() != null) {
            return editTextBoldCursor.getLayout().getHeight();
        }
        return 0.0f;
    }

    public Drawable s() {
        ChatActivityEnterView chatActivityEnterView = ((ji.m) this.d).f17571b.f34928a;
        long j3 = chatActivityEnterView.f32251n6;
        f6 f6Var = null;
        if (j3 == 0) {
            return null;
        }
        if (chatActivityEnterView.f32198f6 != j3) {
            chatActivityEnterView.f32198f6 = j3;
            TLRPC.TL_availableEffect Z0 = np.s1(chatActivityEnterView.R).Z0(chatActivityEnterView.f32251n6);
            if (Z0 != null) {
                f6Var = j6.g(Z0.emoticon);
            }
            chatActivityEnterView.f32205g6 = f6Var;
        }
        return chatActivityEnterView.f32205g6;
    }

    public boolean t(RectF rectF, boolean z10) {
        char c10;
        int[] iArr;
        int[] iArr2 = (int[]) this.f60056b;
        int[] iArr3 = (int[]) this.f60055a;
        ji.m mVar = (ji.m) this.d;
        if (mVar.K != null) {
            ChatActivityEnterView chatActivityEnterView = mVar.f17571b.f34928a;
            st0 st0Var = chatActivityEnterView.U1;
            RectF rectF2 = chatActivityEnterView.A4;
            if (st0Var != null && chatActivityEnterView.getWidth() > 0) {
                int[] iArr4 = new int[2];
                int[] iArr5 = new int[2];
                chatActivityEnterView.getLocationInWindow(iArr4);
                st0Var.getLocationInWindow(iArr5);
                float f10 = iArr4[0] - iArr5[0];
                float f11 = iArr4[1] - iArr5[1];
                if (z10) {
                    rectF.set(f10 + 0.0f, 0.0f, (f10 + chatActivityEnterView.getWidth()) - 0.0f, f11);
                    if (rectF.width() > g0.L(80.0f)) {
                        c10 = 0;
                    }
                } else {
                    c10 = 0;
                    float width = (chatActivityEnterView.getWidth() + f10) - g0.L(64.0f);
                    if (chatActivityEnterView.f32310w2 != null && !rectF2.isEmpty() && chatActivityEnterView.f32310w2.getVisibility() == 0) {
                        chatActivityEnterView.f32310w2.getLocationInWindow(new int[2]);
                        width = ((iArr[0] - iArr5[0]) + rectF2.left) - g0.L(8.0f);
                    }
                    rectF.set(f10, 0.0f, width, f11);
                    if (rectF.width() <= g0.L(80.0f)) {
                        return false;
                    }
                }
                mVar.K.getLocationInWindow(iArr3);
                ((ViewGroup) this.f60057c).getLocationInWindow(iArr2);
                rectF.offset(iArr2[c10] - iArr3[c10], iArr2[1] - iArr3[1]);
                return true;
            }
        }
        return false;
    }

    public List u() {
        ArrayList arrayList;
        if (((ArrayList) this.f60055a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f60055a)) {
            arrayList = new ArrayList((ArrayList) this.f60055a);
        }
        return arrayList;
    }

    public float v() {
        xe xeVar = ((ji.m) this.d).f17571b.f34928a.F0;
        if (xeVar != null) {
            return xeVar.getTextSize();
        }
        return g0.L(18.0f);
    }

    public boolean w() {
        ((ji.m) this.d).getClass();
        if (DictationAsr.B() && DictationAsr.C().length > 0) {
            return true;
        }
        return false;
    }

    @Override
    public c4.d x(int i7, int i10, byte[] bArr) {
        return a8.p0.a(this, bArr, i10);
    }

    public void y(int r12, java.lang.String r13, java.util.HashMap r14) {
        throw new UnsupportedOperationException("Method not decompiled: xi.e.y(int, java.lang.String, java.util.HashMap):void");
    }

    public void z(String str, HashMap hashMap, boolean[] zArr, int i7) {
        if (i7 >= 0) {
            zArr[0] = false;
            String trim = str.trim();
            Matcher matcher = m71.f37136y0.matcher(trim);
            if (matcher.find()) {
                trim = trim.substring(matcher.group(0).length());
            } else {
                Matcher matcher2 = m71.f37137z0.matcher(trim);
                if (matcher2.find()) {
                    trim = trim.substring(matcher2.group(0).length());
                    zArr[0] = true;
                }
            }
            y(i7, trim, hashMap);
            return;
        }
        throw new Exception("recursion limit reached");
    }

    public e(File file) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f60056b = arrayList;
        HashMap hashMap2 = new HashMap();
        this.f60057c = hashMap2;
        long[] jArr = new long[1];
        this.d = jArr;
        this.f60055a = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(F(bufferedReader));
        b1 b1Var = (b1) hashMap.get("content-type");
        String str = b1Var == null ? null : (String) b1Var.f52582b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            a1 a1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (a1Var != null) {
                        a1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(a1Var);
                        b1 b1Var2 = (b1) a1Var.f52572a.get("content-location");
                        hashMap2.put(b1Var2 == null ? null : b1Var2.f52581a, a1Var);
                    }
                    a1Var = new a1();
                    a1Var.f52573b = (File) this.f60055a;
                    a1Var.f52572a.putAll(F(bufferedReader));
                    a1Var.f52574c = jArr[0];
                }
            }
            if (a1Var != null && a1Var.f52574c != 0 && a1Var.d != 0) {
                arrayList.add(a1Var);
                b1 b1Var3 = (b1) a1Var.f52572a.get("content-location");
                hashMap2.put(b1Var3 != null ? b1Var3.f52581a : null, a1Var);
            }
        }
        bufferedReader.close();
    }

    public e(int i7) {
        switch (i7) {
            case 1:
                this.f60055a = new ArrayList();
                this.f60056b = new HashMap();
                this.f60057c = new HashMap();
                return;
            case 2:
                this.f60055a = new x();
                this.f60056b = new x();
                this.f60057c = new f4.a();
                return;
            case 7:
                Random random = new Random();
                this.f60057c = new HashMap();
                this.d = random;
                this.f60055a = new HashMap();
                this.f60056b = new HashMap();
                return;
            default:
                this.f60055a = new ArrayDeque();
                return;
        }
    }

    public e(String str) {
        this.f60055a = new ArrayList();
        this.f60057c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.f60056b = str;
    }

    public e(s1 s1Var, i2.i iVar, q qVar, i2.i iVar2) {
        Object obj;
        if (s1Var != null) {
            obj = i0.q(s1Var);
        } else {
            h9.g0 g0Var = i0.f13686b;
            obj = s1.f13749e;
        }
        this.f60055a = obj;
        this.f60056b = iVar;
        this.f60057c = qVar;
        this.d = iVar2;
    }

    public e(ns nsVar, is isVar) {
        ?? obj = new Object();
        obj.f27a = new int[16];
        this.f60057c = obj;
        this.f60055a = nsVar;
        this.f60056b = isVar;
    }

    @Override
    public void reset() {
    }
}
