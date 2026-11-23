package xi;

import a0.k;
import a8.r9;
import ab.c0;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Rect;
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
import ji.n;
import org.telegram.messenger.a8;
import org.telegram.messenger.f6;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.g0;
import org.telegram.messenger.gs;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.r0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.bn;
import org.telegram.ui.dy0;
import org.telegram.ui.he;
import org.telegram.ui.ky0;
import org.telegram.ui.web.b1;
import org.telegram.ui.web.c1;
import q4.q;
import ug.y0;
public final class e implements m, gs, ky0, q5.b {
    public static volatile e f60748e;
    public Object f60749a;
    public Object f60750b;
    public Object f60751c;
    public Object d;

    public e(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f60749a = obj;
        this.f60750b = obj2;
        this.f60751c = obj3;
        this.d = obj4;
    }

    public static void K(long j3, HashMap hashMap) {
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

    public static void g(String str, String str2, HashMap hashMap) {
        c1 c1Var = new c1();
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
                    c1Var.f53350b.put(trim2, trim3);
                } else {
                    c1Var.f53349a = trim;
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), c1Var);
    }

    public boolean A() {
        bn bnVar = ((n) this.d).f18060b.f38823a.F3;
        if (bnVar != null) {
            if (bnVar.f46209g9 == null) {
                Dialog visibleDialog = bnVar.getVisibleDialog();
                if (visibleDialog != null && visibleDialog.isShowing()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public void B(p0 p0Var) {
        s sVar = p0Var.f2387c;
        String str = sVar.f2413e;
        HashMap hashMap = (HashMap) this.f60750b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(sVar.f2413e, p0Var);
        if (j0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + sVar);
        }
    }

    public void C(p0 p0Var) {
        HashMap hashMap = (HashMap) this.f60750b;
        s sVar = p0Var.f2387c;
        if (sVar.T) {
            ((m0) this.d).f(sVar);
        }
        if (hashMap.get(sVar.f2413e) == p0Var && ((p0) hashMap.put(sVar.f2413e, null)) != null && j0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public void D(float f10, float f11) {
        ji.e eVar;
        int[] iArr = (int[]) this.f60750b;
        int[] iArr2 = (int[]) this.f60749a;
        n nVar = (n) this.d;
        qf qfVar = nVar.f18060b;
        if (!Float.isNaN(f10) && (eVar = nVar.K) != null && nVar.f18062c != 0) {
            eVar.getLocationInWindow(iArr2);
            ((ViewGroup) this.f60751c).getLocationInWindow(iArr);
            qfVar.g((f10 + iArr2[1]) - iArr[1], f11);
            return;
        }
        qfVar.g(Float.NaN, 0.0f);
    }

    @Override
    public void E(byte[] bArr, int i7, int i10, l lVar, j jVar) {
        g2.b bVar;
        int i11;
        int i12;
        int i13;
        int A;
        int i14;
        int i15;
        int D;
        f4.a aVar = (f4.a) this.f60751c;
        x xVar = (x) this.f60750b;
        x xVar2 = (x) this.f60749a;
        xVar2.L(i7 + i10, bArr);
        xVar2.N(i7);
        if (((Inflater) this.d) == null) {
            this.d = new Inflater();
        }
        if (l0.Q(xVar2, xVar, (Inflater) this.d)) {
            xVar2.L(xVar.f13830c, xVar.f13828a);
        }
        int i16 = 0;
        aVar.d = 0;
        int[] iArr = aVar.f11231b;
        x xVar3 = aVar.f11230a;
        aVar.f11233e = 0;
        aVar.f11234f = 0;
        aVar.f11235g = 0;
        aVar.h = 0;
        aVar.f11236i = 0;
        xVar3.K(0);
        aVar.f11232c = false;
        ArrayList arrayList = new ArrayList();
        while (xVar2.a() >= 3) {
            int i17 = xVar2.f13830c;
            int A2 = xVar2.A();
            int H = xVar2.H();
            int i18 = xVar2.f13829b + H;
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
                                aVar.f11232c = true;
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
                                        aVar.f11236i = xVar2.H();
                                        xVar3.K(D - 4);
                                        i21 = H - 11;
                                    }
                                }
                                int i22 = xVar3.f13829b;
                                int i23 = xVar3.f13830c;
                                if (i22 < i23 && i21 > 0) {
                                    int min = Math.min(i21, i23 - i22);
                                    xVar2.k(i22, min, xVar3.f13828a);
                                    xVar3.N(i22 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (H >= 19) {
                                aVar.d = xVar2.H();
                                aVar.f11233e = xVar2.H();
                                xVar2.O(11);
                                aVar.f11234f = xVar2.H();
                                aVar.f11235g = xVar2.H();
                                break;
                            }
                            break;
                    }
                    i11 = 0;
                    bVar = null;
                } else {
                    if (aVar.d != 0 && aVar.f11233e != 0 && aVar.h != 0 && aVar.f11236i != 0 && (i12 = xVar3.f13830c) != 0 && xVar3.f13829b == i12 && aVar.f11232c) {
                        xVar3.N(0);
                        int i24 = aVar.h * aVar.f11236i;
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
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, aVar.h, aVar.f11236i, Bitmap.Config.ARGB_8888);
                        float f10 = aVar.d;
                        float f11 = aVar.f11233e;
                        bVar = new g2.b(null, null, null, createBitmap, aVar.f11235g / f11, 0, 0, aVar.f11234f / f10, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar.h / f10, aVar.f11236i / f11, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    } else {
                        bVar = null;
                    }
                    i11 = 0;
                    aVar.d = 0;
                    aVar.f11233e = 0;
                    aVar.f11234f = 0;
                    aVar.f11235g = 0;
                    aVar.h = 0;
                    aVar.f11236i = 0;
                    xVar3.K(0);
                    aVar.f11232c = false;
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

    public void F() {
        n nVar = (n) this.d;
        String trim = nVar.f18075n.trim();
        if (trim.isEmpty()) {
            return;
        }
        Log.d("VoiceLive", "field: send " + trim.length() + " chars as text");
        nVar.k("field send");
        ChatActivityEnterView chatActivityEnterView = nVar.f18060b.f38823a;
        int i7 = ChatActivityEnterView.f32633s7;
        chatActivityEnterView.D2(trim, new dd(chatActivityEnterView, 20));
    }

    public void G(float f10, float f11, float f12, float f13) {
        n nVar = (n) this.d;
        int[] iArr = nVar.f18064d0;
        int[] iArr2 = nVar.f18063c0;
        EditTextBoldCursor editTextBoldCursor = nVar.X;
        if (editTextBoldCursor != null && nVar.K != null) {
            int max = Math.max(1, Math.round(f12 - f10));
            int max2 = Math.max(1, Math.round(f13 - f11));
            ViewGroup.LayoutParams layoutParams = editTextBoldCursor.getLayoutParams();
            if (layoutParams != null && (layoutParams.width != max || layoutParams.height != max2)) {
                layoutParams.width = max;
                layoutParams.height = max2;
                editTextBoldCursor.setLayoutParams(layoutParams);
            }
            Rect clipBounds = editTextBoldCursor.getClipBounds();
            if (clipBounds == null || clipBounds.width() != max || clipBounds.height() != max2 || clipBounds.left != 0 || clipBounds.top != 0) {
                editTextBoldCursor.setClipBounds(new Rect(0, 0, max, max2));
            }
            nVar.K.getLocationInWindow(iArr2);
            editTextBoldCursor.getLocationInWindow(iArr);
            float translationX = iArr[0] - editTextBoldCursor.getTranslationX();
            float translationY = iArr[1] - editTextBoldCursor.getTranslationY();
            editTextBoldCursor.setTranslationX((iArr2[0] + f10) - translationX);
            editTextBoldCursor.setTranslationY((iArr2[1] + f11) - translationY);
        }
    }

    public kf.f H(String str) {
        if (str != null) {
            gf.g gVar = new gf.g((ArrayList) this.f60749a, (lf.b) this.f60751c, (ArrayList) this.f60750b);
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
            gVar.f(gVar.f13552n);
            lf.a a10 = gVar.f13548j.a(new wf.b(23, gVar.f13549k, gVar.f13551m));
            for (mf.a aVar : gVar.f13553o) {
                aVar.g(a10);
            }
            kf.f fVar = (kf.f) gVar.f13550l.f13538b;
            Iterator it = ((ArrayList) this.d).iterator();
            if (!it.hasNext()) {
                return fVar;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
        throw new NullPointerException("input must not be null");
    }

    public HashMap I(BufferedReader bufferedReader) {
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
                            g(trim2, trim3, hashMap);
                        }
                    }
                }
            }
            g(str, sb2.toString(), hashMap);
        }
        if (str != null && sb2 != null) {
            g(str, sb2.toString(), hashMap);
        }
        return hashMap;
    }

    public void J() {
        boolean z10;
        if (((d) this.f60750b) == null) {
            d dVar = (d) ((ArrayDeque) this.f60749a).pollFirst();
            this.f60750b = dVar;
            if (dVar != null) {
                b bVar = new b(this, dVar, 0);
                this.f60751c = bVar;
                g0.h3(bVar, 10000L);
                a aVar = dVar.f60746b;
                String str = aVar.f60736b;
                String str2 = aVar.f60739f;
                c cVar = new c(this, dVar);
                i61 k10 = i.k(str);
                byte[] f10 = i.f(str2);
                int i7 = 0;
                if (k10 != null && f10 != null) {
                    try {
                        z10 = r9.a("WEB_MESSAGE_LISTENER");
                    } catch (Throwable th2) {
                        a8.g(th2, true);
                        z10 = false;
                    }
                    if (z10) {
                        synchronized (i.f60758y) {
                            i iVar = i.A;
                            if (iVar != null) {
                                iVar.q();
                                i.A = null;
                            }
                            try {
                                i iVar2 = new i(k10, str2, f10);
                                i.A = iVar2;
                                iVar2.f60780x = cVar;
                                r0 r0Var = r0.f26613f;
                                if (r0Var != null) {
                                    r0Var.d.add(iVar2);
                                }
                                iVar2.f60767j.execute(new f(iVar2, 1));
                                g0.g3(new f(iVar2, 2));
                                i7 = i.A.f60766i.getLocalPort();
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

    public p2.b L(List list) {
        p2.b bVar;
        HashMap hashMap = (HashMap) this.f60751c;
        ArrayList h = h(list);
        if (h.size() < 2) {
            return (p2.b) o.m(h, null);
        }
        Collections.sort(h, new w(9));
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        int i10 = ((p2.b) h.get(0)).f55209c;
        int i11 = 0;
        while (true) {
            if (i11 >= h.size()) {
                break;
            }
            p2.b bVar2 = (p2.b) h.get(i11);
            if (i10 != bVar2.f55209c) {
                if (arrayList.size() == 1) {
                    return (p2.b) h.get(0);
                }
            } else {
                arrayList.add(new Pair(bVar2.f55208b, Integer.valueOf(bVar2.d)));
                i11++;
            }
        }
        p2.b bVar3 = (p2.b) hashMap.get(arrayList);
        if (bVar3 == null) {
            List subList = h.subList(0, arrayList.size());
            int i12 = 0;
            for (int i13 = 0; i13 < subList.size(); i13++) {
                i12 += ((p2.b) subList.get(i13)).d;
            }
            int nextInt = ((Random) this.d).nextInt(i12);
            int i14 = 0;
            while (true) {
                if (i7 < subList.size()) {
                    bVar = (p2.b) subList.get(i7);
                    i14 += bVar.d;
                    if (nextInt < i14) {
                        break;
                    }
                    i7++;
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

    public Bundle M(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f60751c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    @Override
    public int N() {
        return 2;
    }

    @Override
    public void a() {
        g0.h3(new dy0((bn) this.f60749a, (Activity) this.f60750b, (i6) this.f60751c, (fj) this.d, 2), 200L);
    }

    @Override
    public void b() {
        k kVar = (k) this.f60751c;
        if (((fs) this.f60750b) == null) {
            return;
        }
        e eVar = (e) this.d;
        if (eVar != null) {
            eVar.b();
            this.d = null;
        }
        int i7 = kVar.f28b;
        for (int i10 = 0; i10 < i7; i10++) {
            ks ksVar = (ks) this.f60749a;
            fs fsVar = (fs) this.f60750b;
            if (i10 >= 0) {
                if (i10 < kVar.f28b) {
                    ksVar.n(fsVar, kVar.f27a[i10]);
                }
            } else {
                kVar.getClass();
            }
            StringBuilder m10 = i5.c.m(i10, "Index ", " must be in 0..");
            m10.append(kVar.f28b - 1);
            throw new IndexOutOfBoundsException(m10.toString());
        }
        kVar.f28b = 0;
        this.f60749a = null;
        this.f60750b = null;
    }

    public e c(int i7) {
        if (((fs) this.f60750b) == null) {
            return this;
        }
        k kVar = (k) this.f60751c;
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
        ((ks) this.f60749a).b((fs) this.f60750b, i7);
        return this;
    }

    @Override
    public void d() {
        g0.h3(new he((bn) this.f60749a, (fj) this.d, 8), 200L);
    }

    public void e(s sVar) {
        if (!((ArrayList) this.f60749a).contains(sVar)) {
            synchronized (((ArrayList) this.f60749a)) {
                ((ArrayList) this.f60749a).add(sVar);
            }
            sVar.f2424w = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + sVar);
    }

    public e f(int i7) {
        if (((fs) this.f60750b) == null) {
            return this;
        }
        if (((e) this.d) == null) {
            this.d = new e(ks.e(), (fs) this.f60750b);
        }
        ((e) this.d).c(i7);
        return this;
    }

    @Override
    public Object mo23get() {
        return new c0((Executor) ((fd.a) this.f60749a).mo23get(), (v5.d) ((fd.a) this.f60750b).mo23get(), (i61) ((i61) this.f60751c).mo23get(), (w5.c) ((fd.a) this.d).mo23get(), 14);
    }

    public ArrayList h(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.f60749a;
        K(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.f60750b;
        K(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            p2.b bVar = (p2.b) list.get(i7);
            if (!hashMap.containsKey(bVar.f55208b) && !hashMap2.containsKey(Integer.valueOf(bVar.f55209c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override
    public void i() {
        bn bnVar = (bn) this.f60749a;
        bnVar.showDialog(new y0((g2) bnVar, 3, true));
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
        ChatActivityEnterView chatActivityEnterView = ((n) this.d).f18060b.f38823a;
        int i7 = ChatActivityEnterView.f32633s7;
        jh.f D0 = chatActivityEnterView.D0();
        dh.c cVar = chatActivityEnterView.L1;
        if (cVar != null && D0 != null && (gVar = D0.f17874n) != null && (aVar = gVar.f11665w) != null) {
            return cVar.c(eVar, aVar, false);
        }
        return null;
    }

    public String l(String str) {
        ArrayList arrayList = (ArrayList) this.f60749a;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.f60750b);
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
        if (((d) this.f60750b) != dVar) {
            return;
        }
        b bVar = (b) this.f60751c;
        if (bVar != null) {
            g0.r(bVar);
            this.f60751c = null;
        }
        b bVar2 = (b) this.d;
        if (bVar2 != null) {
            g0.r(bVar2);
            this.d = null;
        }
        synchronized (i.f60758y) {
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
        this.f60750b = null;
        dVar.f60747c.run(-1L);
        J();
    }

    public s n(String str) {
        p0 p0Var = (p0) ((HashMap) this.f60750b).get(str);
        if (p0Var != null) {
            return p0Var.f2387c;
        }
        return null;
    }

    public s o(String str) {
        for (p0 p0Var : ((HashMap) this.f60750b).values()) {
            if (p0Var != null) {
                s sVar = p0Var.f2387c;
                if (!str.equals(sVar.f2413e)) {
                    sVar = sVar.M.f2319c.o(str);
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
        for (p0 p0Var : ((HashMap) this.f60750b).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var);
            }
        }
        return arrayList;
    }

    public ArrayList q() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.f60750b).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var.f2387c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public float r() {
        EditTextBoldCursor editTextBoldCursor = ((n) this.d).X;
        if (editTextBoldCursor == null) {
            return -1.0f;
        }
        if (editTextBoldCursor.getLayout() != null) {
            return editTextBoldCursor.getLayout().getHeight();
        }
        return 0.0f;
    }

    @Override
    public c4.d s(int i7, int i10, byte[] bArr) {
        return a8.p0.a(this, bArr, i10);
    }

    public Drawable t() {
        ChatActivityEnterView chatActivityEnterView = ((n) this.d).f18060b.f38823a;
        long j3 = chatActivityEnterView.P6;
        f6 f6Var = null;
        if (j3 == 0) {
            return null;
        }
        if (chatActivityEnterView.f32827y6 != j3) {
            chatActivityEnterView.f32827y6 = j3;
            TLRPC.TL_availableEffect b12 = mp.u1(chatActivityEnterView.R).b1(chatActivityEnterView.P6);
            if (b12 != null) {
                f6Var = j6.g(b12.emoticon);
            }
            chatActivityEnterView.f32834z6 = f6Var;
        }
        return chatActivityEnterView.f32834z6;
    }

    public boolean u(RectF rectF, boolean z10) {
        char c10;
        int[] iArr;
        int[] iArr2 = (int[]) this.f60750b;
        int[] iArr3 = (int[]) this.f60749a;
        n nVar = (n) this.d;
        if (nVar.K != null) {
            ChatActivityEnterView chatActivityEnterView = nVar.f18060b.f38823a;
            cu0 cu0Var = chatActivityEnterView.f32655c2;
            RectF rectF2 = chatActivityEnterView.I4;
            if (cu0Var != null && chatActivityEnterView.getWidth() > 0) {
                int[] iArr4 = new int[2];
                int[] iArr5 = new int[2];
                chatActivityEnterView.getLocationInWindow(iArr4);
                cu0Var.getLocationInWindow(iArr5);
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
                    if (chatActivityEnterView.E2 != null && !rectF2.isEmpty() && chatActivityEnterView.E2.getVisibility() == 0) {
                        chatActivityEnterView.E2.getLocationInWindow(new int[2]);
                        width = ((iArr[0] - iArr5[0]) + rectF2.left) - g0.L(8.0f);
                    }
                    rectF.set(f10, 0.0f, width, f11);
                    if (rectF.width() <= g0.L(80.0f)) {
                        return false;
                    }
                }
                nVar.K.getLocationInWindow(iArr3);
                ((ViewGroup) this.f60751c).getLocationInWindow(iArr2);
                rectF.offset(iArr2[c10] - iArr3[c10], iArr2[1] - iArr3[1]);
                return true;
            }
        }
        return false;
    }

    public List v() {
        ArrayList arrayList;
        if (((ArrayList) this.f60749a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f60749a)) {
            arrayList = new ArrayList((ArrayList) this.f60749a);
        }
        return arrayList;
    }

    public float w() {
        hf hfVar = ((n) this.d).f18060b.f38823a.F0;
        if (hfVar != null) {
            return hfVar.getTextSize();
        }
        return g0.L(18.0f);
    }

    public boolean x() {
        ((n) this.d).getClass();
        if (DictationAsr.G() && DictationAsr.H().length > 0) {
            return true;
        }
        return false;
    }

    public void y(int r12, java.lang.String r13, java.util.HashMap r14) {
        throw new UnsupportedOperationException("Method not decompiled: xi.e.y(int, java.lang.String, java.util.HashMap):void");
    }

    public void z(String str, HashMap hashMap, boolean[] zArr, int i7) {
        if (i7 >= 0) {
            zArr[0] = false;
            String trim = str.trim();
            Matcher matcher = a81.f33395y0.matcher(trim);
            if (matcher.find()) {
                trim = trim.substring(matcher.group(0).length());
            } else {
                Matcher matcher2 = a81.f33396z0.matcher(trim);
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
        this.f60750b = arrayList;
        HashMap hashMap2 = new HashMap();
        this.f60751c = hashMap2;
        long[] jArr = new long[1];
        this.d = jArr;
        this.f60749a = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(I(bufferedReader));
        c1 c1Var = (c1) hashMap.get("content-type");
        String str = c1Var == null ? null : (String) c1Var.f53350b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            b1 b1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (b1Var != null) {
                        b1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(b1Var);
                        c1 c1Var2 = (c1) b1Var.f53339a.get("content-location");
                        hashMap2.put(c1Var2 == null ? null : c1Var2.f53349a, b1Var);
                    }
                    b1Var = new b1();
                    b1Var.f53340b = (File) this.f60749a;
                    b1Var.f53339a.putAll(I(bufferedReader));
                    b1Var.f53341c = jArr[0];
                }
            }
            if (b1Var != null && b1Var.f53341c != 0 && b1Var.d != 0) {
                arrayList.add(b1Var);
                c1 c1Var3 = (c1) b1Var.f53339a.get("content-location");
                hashMap2.put(c1Var3 != null ? c1Var3.f53349a : null, b1Var);
            }
        }
        bufferedReader.close();
    }

    public e(int i7) {
        switch (i7) {
            case 1:
                this.f60749a = new ArrayList();
                this.f60750b = new HashMap();
                this.f60751c = new HashMap();
                return;
            case 2:
                this.f60749a = new x();
                this.f60750b = new x();
                this.f60751c = new f4.a();
                return;
            case 7:
                Random random = new Random();
                this.f60751c = new HashMap();
                this.d = random;
                this.f60749a = new HashMap();
                this.f60750b = new HashMap();
                return;
            default:
                this.f60749a = new ArrayDeque();
                return;
        }
    }

    public e(String str) {
        this.f60749a = new ArrayList();
        this.f60751c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.f60750b = str;
    }

    public e(s1 s1Var, i2.i iVar, q qVar, i2.i iVar2) {
        Object obj;
        if (s1Var != null) {
            obj = i0.q(s1Var);
        } else {
            h9.g0 g0Var = i0.f13995b;
            obj = s1.f14058e;
        }
        this.f60749a = obj;
        this.f60750b = iVar;
        this.f60751c = qVar;
        this.d = iVar2;
    }

    public e(ks ksVar, fs fsVar) {
        ?? obj = new Object();
        obj.f27a = new int[16];
        this.f60751c = obj;
        this.f60749a = ksVar;
        this.f60750b = fsVar;
    }

    @Override
    public void reset() {
    }
}
