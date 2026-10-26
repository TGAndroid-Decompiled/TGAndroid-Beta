package ti;

import a8.me;
import a8.v1;
import aa.b1;
import aa.v0;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.i0;
import androidx.fragment.app.l0;
import androidx.fragment.app.o0;
import androidx.fragment.app.r;
import com.google.firebase.messaging.q;
import e2.n0;
import e2.x;
import f9.o;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.zip.Inflater;
import l.a0;
import l.k;
import li.e3;
import n4.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.r10;
import z3.l;
import z3.m;
public final class e implements m, o5.b {
    public static volatile e f49182f;
    public final int f49183a;
    public Object f49184b;
    public Object f49185c;
    public Object d;
    public Object e;

    public e(int i10, boolean z10) {
        this.f49183a = i10;
    }

    public static void s(long j10, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            hashMap.remove(arrayList.get(i10));
        }
    }

    @Override
    public void G(byte[] bArr, int i10, int i11, l lVar, e2.j jVar) {
        d2.b bVar;
        int i12;
        int i13;
        int i14;
        int A;
        int i15;
        int i16;
        int D;
        c4.a aVar = (c4.a) this.d;
        x xVar = (x) this.f49185c;
        x xVar2 = (x) this.f49184b;
        xVar2.L(i10 + i11, bArr);
        xVar2.N(i10);
        if (((Inflater) this.e) == null) {
            this.e = new Inflater();
        }
        if (n0.Q(xVar2, xVar, (Inflater) this.e)) {
            xVar2.L(xVar.f9734c, xVar.f9732a);
        }
        int i17 = 0;
        aVar.d = 0;
        int[] iArr = aVar.f6130b;
        x xVar3 = aVar.f6129a;
        aVar.e = 0;
        aVar.f6132f = 0;
        aVar.f6133g = 0;
        aVar.h = 0;
        aVar.f6134i = 0;
        xVar3.K(0);
        aVar.f6131c = false;
        ArrayList arrayList = new ArrayList();
        while (xVar2.a() >= 3) {
            int i18 = xVar2.f9734c;
            int A2 = xVar2.A();
            int H = xVar2.H();
            int i19 = xVar2.f9733b + H;
            if (i19 > i18) {
                xVar2.N(i18);
                i12 = i17;
                bVar = null;
            } else {
                char c10 = 128;
                if (A2 != 128) {
                    switch (A2) {
                        case 20:
                            if (H % 5 == 2) {
                                xVar2.O(2);
                                Arrays.fill(iArr, i17);
                                int i20 = H / 5;
                                int i21 = i17;
                                while (i21 < i20) {
                                    int A3 = xVar2.A();
                                    char c11 = c10;
                                    double A4 = xVar2.A();
                                    double A5 = xVar2.A() - 128;
                                    double A6 = xVar2.A() - 128;
                                    iArr[A3] = n0.i((int) ((A6 * 1.772d) + A4), 0, 255) | (xVar2.A() << 24) | (n0.i((int) ((1.402d * A5) + A4), 0, 255) << 16) | (n0.i((int) ((A4 - (0.34414d * A6)) - (A5 * 0.71414d)), 0, 255) << 8);
                                    i21++;
                                    c10 = c11;
                                    aVar = aVar;
                                }
                                aVar.f6131c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (H >= 4) {
                                xVar2.O(3);
                                if ((128 & xVar2.A()) != 0) {
                                    i16 = 1;
                                } else {
                                    i16 = i17;
                                }
                                int i22 = H - 4;
                                if (i16 != 0) {
                                    if (i22 >= 7 && (D = xVar2.D()) >= 4) {
                                        aVar.h = xVar2.H();
                                        aVar.f6134i = xVar2.H();
                                        xVar3.K(D - 4);
                                        i22 = H - 11;
                                    }
                                }
                                int i23 = xVar3.f9733b;
                                int i24 = xVar3.f9734c;
                                if (i23 < i24 && i22 > 0) {
                                    int min = Math.min(i22, i24 - i23);
                                    xVar2.k(i23, min, xVar3.f9732a);
                                    xVar3.N(i23 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (H >= 19) {
                                aVar.d = xVar2.H();
                                aVar.e = xVar2.H();
                                xVar2.O(11);
                                aVar.f6132f = xVar2.H();
                                aVar.f6133g = xVar2.H();
                                break;
                            }
                            break;
                    }
                    i12 = 0;
                    bVar = null;
                } else {
                    if (aVar.d != 0 && aVar.e != 0 && aVar.h != 0 && aVar.f6134i != 0 && (i13 = xVar3.f9734c) != 0 && xVar3.f9733b == i13 && aVar.f6131c) {
                        xVar3.N(0);
                        int i25 = aVar.h * aVar.f6134i;
                        int[] iArr2 = new int[i25];
                        int i26 = 0;
                        while (i26 < i25) {
                            int A7 = xVar3.A();
                            if (A7 != 0) {
                                i14 = i26 + 1;
                                iArr2[i26] = iArr[A7];
                            } else {
                                int A8 = xVar3.A();
                                if (A8 != 0) {
                                    if ((A8 & 64) == 0) {
                                        A = A8 & 63;
                                    } else {
                                        A = ((A8 & 63) << 8) | xVar3.A();
                                    }
                                    if ((A8 & 128) == 0) {
                                        i15 = iArr[0];
                                    } else {
                                        i15 = iArr[xVar3.A()];
                                    }
                                    i14 = A + i26;
                                    Arrays.fill(iArr2, i26, i14, i15);
                                }
                            }
                            i26 = i14;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, aVar.h, aVar.f6134i, Bitmap.Config.ARGB_8888);
                        float f7 = aVar.d;
                        float f10 = aVar.e;
                        bVar = new d2.b(null, null, null, createBitmap, aVar.f6133g / f10, 0, 0, aVar.f6132f / f7, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar.h / f7, aVar.f6134i / f10, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    } else {
                        bVar = null;
                    }
                    i12 = 0;
                    aVar.d = 0;
                    aVar.e = 0;
                    aVar.f6132f = 0;
                    aVar.f6133g = 0;
                    aVar.h = 0;
                    aVar.f6134i = 0;
                    xVar3.K(0);
                    aVar.f6131c = false;
                }
                xVar2.N(i19);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            i17 = i12;
        }
        jVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public void a(r rVar) {
        if (!((ArrayList) this.f49184b).contains(rVar)) {
            synchronized (((ArrayList) this.f49184b)) {
                ((ArrayList) this.f49184b).add(rVar);
            }
            rVar.v = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + rVar);
    }

    public ArrayList b(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.f49184b;
        s(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.f49185c;
        s(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            m2.b bVar = (m2.b) list.get(i10);
            if (!hashMap.containsKey(bVar.f17933b) && !hashMap2.containsKey(Integer.valueOf(bVar.f17934c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public v0 c() {
        String str;
        if (((String) this.f49184b) == null) {
            str = " processName";
        } else {
            str = "";
        }
        if (((Integer) this.f49185c) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.d) == null) {
            str = b10.u(str, " importance");
        }
        if (((Boolean) this.e) == null) {
            str = b10.u(str, " defaultProcess");
        }
        if (str.isEmpty()) {
            return new v0((String) this.f49184b, ((Integer) this.f49185c).intValue(), ((Integer) this.d).intValue(), ((Boolean) this.e).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public b1 d() {
        String str;
        if (((Integer) this.f49184b) == null) {
            str = " platform";
        } else {
            str = "";
        }
        if (((String) this.f49185c) == null) {
            str = str.concat(" version");
        }
        if (((String) this.d) == null) {
            str = b10.u(str, " buildVersion");
        }
        if (((Boolean) this.e) == null) {
            str = b10.u(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new b1(((Integer) this.f49184b).intValue(), (String) this.f49185c, (String) this.d, ((Boolean) this.e).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void e(d dVar) {
        if (((d) this.f49185c) != dVar) {
            return;
        }
        b bVar = (b) this.d;
        if (bVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar);
            this.d = null;
        }
        b bVar2 = (b) this.e;
        if (bVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar2);
            this.e = null;
        }
        synchronized (j.f49193y) {
            try {
                j jVar = j.A;
                if (jVar != null) {
                    jVar.o();
                    j.A = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f49185c = null;
        dVar.f49181c.run(-1L);
        r();
    }

    public r f(String str) {
        o0 o0Var = (o0) ((HashMap) this.f49185c).get(str);
        if (o0Var != null) {
            return o0Var.f2702c;
        }
        return null;
    }

    public r g(String str) {
        for (o0 o0Var : ((HashMap) this.f49185c).values()) {
            if (o0Var != null) {
                r rVar = o0Var.f2702c;
                if (!str.equals(rVar.e)) {
                    rVar = rVar.L.f2638c.g(str);
                }
                if (rVar != null) {
                    return rVar;
                }
            }
        }
        return null;
    }

    @Override
    public Object mo27get() {
        return new q((Executor) ((id.a) this.f49184b).mo27get(), (t5.d) ((id.a) this.f49185c).mo27get(), (s4.d) ((k6.c) this.d).mo27get(), (u5.c) ((id.a) this.e).mo27get());
    }

    public k.e h(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k.e eVar = (k.e) arrayList.get(i10);
            if (eVar != null && eVar.f16009b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.f49185c, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : ((HashMap) this.f49185c).values()) {
            if (o0Var != null) {
                arrayList.add(o0Var);
            }
        }
        return arrayList;
    }

    @Override
    public z3.d j(int i10, int i11, byte[] bArr) {
        return b10.a(this, bArr, i11);
    }

    public ArrayList k() {
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : ((HashMap) this.f49185c).values()) {
            if (o0Var != null) {
                arrayList.add(o0Var.f2702c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List l() {
        ArrayList arrayList;
        if (((ArrayList) this.f49184b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f49184b)) {
            arrayList = new ArrayList((ArrayList) this.f49184b);
        }
        return arrayList;
    }

    public void m(o0 o0Var) {
        r rVar = o0Var.f2702c;
        String str = rVar.e;
        HashMap hashMap = (HashMap) this.f49185c;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(rVar.e, o0Var);
        if (i0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + rVar);
        }
    }

    public void n(o0 o0Var) {
        HashMap hashMap = (HashMap) this.f49185c;
        r rVar = o0Var.f2702c;
        if (rVar.S) {
            ((l0) this.e).f(rVar);
        }
        if (hashMap.get(rVar.e) == o0Var && ((o0) hashMap.put(rVar.e, null)) != null && i0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + rVar);
        }
    }

    public boolean o(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f49184b).onActionItemClicked(h(aVar), new l.r((Context) this.f49185c, (l0.a) menuItem));
    }

    public boolean p(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f49184b;
        k.e h = h(aVar);
        a0.l lVar = (a0.l) this.e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) this.f49185c, (k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(h, menu2);
    }

    public ef.f q(String str) {
        if (str != null) {
            bf.g gVar = new bf.g((ArrayList) this.f49184b, (ff.b) this.d, (ArrayList) this.f49185c);
            int i10 = 0;
            while (true) {
                int length = str.length();
                int i11 = i10;
                while (true) {
                    if (i11 < length) {
                        char charAt = str.charAt(i11);
                        if (charAt == '\n' || charAt == '\r') {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 == -1) {
                    break;
                }
                gVar.i(str.substring(i10, i11));
                i10 = i11 + 1;
                if (i10 < str.length() && str.charAt(i11) == '\r' && str.charAt(i10) == '\n') {
                    i10 = i11 + 2;
                }
            }
            if (str.length() > 0 && (i10 == 0 || i10 < str.length())) {
                gVar.i(str.substring(i10));
            }
            gVar.f(gVar.f3931n);
            ff.a B = gVar.f3927j.B(new s(8, gVar.f3928k, gVar.f3930m));
            for (gf.a aVar : gVar.f3932o) {
                aVar.g(B);
            }
            ef.f fVar = (ef.f) gVar.f3929l.f3918b;
            Iterator it = ((ArrayList) this.e).iterator();
            if (!it.hasNext()) {
                return fVar;
            }
            throw a1.g.j(it);
        }
        throw new NullPointerException("input must not be null");
    }

    public void r() {
        boolean z10;
        if (((d) this.f49185c) == null) {
            d dVar = (d) ((ArrayDeque) this.f49184b).pollFirst();
            this.f49185c = dVar;
            if (dVar != null) {
                b bVar = new b(this, dVar, 0);
                this.d = bVar;
                AndroidUtilities.runOnUIThread(bVar, 10000L);
                a aVar = dVar.f49180b;
                String str = aVar.f49171b;
                String str2 = aVar.f49173f;
                c cVar = new c(this, dVar);
                s4.d i10 = j.i(str);
                byte[] d = j.d(str2);
                int i11 = 0;
                if (i10 != null && d != null) {
                    try {
                        z10 = v1.a("WEB_MESSAGE_LISTENER");
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                        z10 = false;
                    }
                    if (z10) {
                        synchronized (j.f49193y) {
                            j jVar = j.A;
                            if (jVar != null) {
                                jVar.o();
                                j.A = null;
                            }
                            try {
                                j jVar2 = new j(i10, str2, d);
                                j.A = jVar2;
                                jVar2.f49214x = cVar;
                                r10 r10Var = r10.getInstance();
                                if (r10Var != null) {
                                    r10Var.addListener(jVar2);
                                }
                                jVar2.f49201j.execute(new f(jVar2, 1));
                                AndroidUtilities.runOnUIThread(new f(jVar2, 2));
                                i11 = j.A.f49200i.getLocalPort();
                            } catch (Exception e) {
                                FileLog.e(e);
                                j jVar3 = j.A;
                                if (jVar3 != null) {
                                    jVar3.o();
                                    j.A = null;
                                }
                            }
                        }
                    }
                }
                dVar.d = i11;
                if (i11 == 0) {
                    e(dVar);
                }
            }
        }
    }

    public m2.b t(List list) {
        m2.b bVar;
        HashMap hashMap = (HashMap) this.d;
        ArrayList b10 = b(list);
        if (b10.size() < 2) {
            return (m2.b) o.l(b10, null);
        }
        Collections.sort(b10, new a4.d(26));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((m2.b) b10.get(0)).f17934c;
        int i12 = 0;
        while (true) {
            if (i12 >= b10.size()) {
                break;
            }
            m2.b bVar2 = (m2.b) b10.get(i12);
            if (i11 != bVar2.f17934c) {
                if (arrayList.size() == 1) {
                    return (m2.b) b10.get(0);
                }
            } else {
                arrayList.add(new Pair(bVar2.f17933b, Integer.valueOf(bVar2.d)));
                i12++;
            }
        }
        m2.b bVar3 = (m2.b) hashMap.get(arrayList);
        if (bVar3 == null) {
            List subList = b10.subList(0, arrayList.size());
            int i13 = 0;
            for (int i14 = 0; i14 < subList.size(); i14++) {
                i13 += ((m2.b) subList.get(i14)).d;
            }
            int nextInt = ((Random) this.e).nextInt(i13);
            int i15 = 0;
            while (true) {
                if (i10 < subList.size()) {
                    bVar = (m2.b) subList.get(i10);
                    i15 += bVar.d;
                    if (nextInt < i15) {
                        break;
                    }
                    i10++;
                } else {
                    bVar = (m2.b) o.m(subList);
                    break;
                }
            }
            hashMap.put(arrayList, bVar);
            return bVar;
        }
        return bVar3;
    }

    public String toString() {
        switch (this.f49183a) {
            case 12:
                return ((e3) this.e).toString();
            default:
                return super.toString();
        }
    }

    public Bundle u(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.d;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    @Override
    public int y() {
        return 2;
    }

    public e(id.a aVar, id.a aVar2, k6.c cVar, id.a aVar3) {
        this.f49183a = 11;
        this.f49184b = aVar;
        this.f49185c = aVar2;
        this.d = cVar;
        this.e = aVar3;
    }

    public e(me meVar) {
        this.f49183a = 5;
        LinkedHashSet linkedHashSet = bf.g.f3919p;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) meVar.f614a);
        for (Class cls : (LinkedHashSet) meVar.d) {
            arrayList.add(bf.g.f3920q.get(cls));
        }
        this.f49184b = arrayList;
        ff.b bVar = (s) meVar.e;
        bVar = bVar == null ? new sb.b(8) : bVar;
        this.d = bVar;
        this.e = (ArrayList) meVar.f616c;
        ArrayList arrayList2 = (ArrayList) meVar.f615b;
        this.f49185c = arrayList2;
        bVar.B(new s(8, arrayList2, Collections.EMPTY_MAP));
    }

    public e(int i10) {
        this.f49183a = i10;
        switch (i10) {
            case 3:
                this.f49184b = new ArrayList();
                this.f49185c = new HashMap();
                this.d = new HashMap();
                return;
            case 4:
                this.f49184b = new x();
                this.f49185c = new x();
                this.d = new c4.a();
                return;
            case 5:
            case 6:
            default:
                this.f49184b = new ArrayDeque();
                return;
            case 7:
                Random random = new Random();
                this.d = new HashMap();
                this.e = random;
                this.f49184b = new HashMap();
                this.f49185c = new HashMap();
                return;
        }
    }

    public e(e3 e3Var, Object obj, Object obj2, Object[] objArr) {
        this.f49183a = 12;
        this.e = e3Var;
        this.f49184b = obj;
        this.f49185c = obj2;
        this.d = objArr;
    }

    public e(Context context, ActionMode.Callback callback) {
        this.f49183a = 6;
        this.f49185c = context;
        this.f49184b = callback;
        this.d = new ArrayList();
        this.e = new a0.l(0);
    }

    public e(mg.e eVar) {
        this.f49183a = 8;
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        this.e = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        if (eVar.E) {
            TextView textView = new TextView(eVar.getContext());
            this.d = textView;
            linearLayout.addView(textView);
            textView.getLayoutParams().width = AndroidUtilities.dp(36.0f);
            textView.setVisibility(8);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 13.0f);
        }
        TextView textView2 = new TextView(eVar.getContext());
        this.f49185c = textView2;
        linearLayout.addView(textView2, gb1.o(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
        b6 b6Var = new b6(eVar.getContext());
        this.f49184b = b6Var;
        linearLayout.addView(b6Var, gb1.r(-1, -2));
        textView2.setGravity(8388611);
        b6Var.setGravity(8388613);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
    }

    @Override
    public void reset() {
    }
}
