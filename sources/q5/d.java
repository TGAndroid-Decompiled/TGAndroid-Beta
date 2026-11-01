package q5;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import c3.g0;
import c3.l;
import c3.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.zip.Adler32;
import m2.t;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ff;
import org.telegram.messenger.i0;
import org.telegram.messenger.qz;
import org.telegram.messenger.r20;
import org.telegram.messenger.s20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.ox0;
import org.telegram.ui.vn0;
import r0.h0;
import r2.y;
import s4.c1;
import s4.p0;
import s5.g;
import sg.v;
import t0.h;
import t7.u;
import uh.m;
import vb.i;
import vb.j;
import vh.b8;
import vh.i4;
import vh.j4;
import vh.k4;
import vh.m5;
import vh.n5;
import vh.n8;
import vh.o8;
import vh.r0;
import vh.y6;
import w7.e;
import w7.n6;
import x7.d0;
import z7.x;
public class d implements n5.b, vn0, h, ai, ka.a, t61 {
    public final int f45497a;
    public Object f45498b;
    public Object f45499c;
    public Object d;

    public d(int i10, boolean z10) {
        this.f45497a = i10;
    }

    @Override
    public void C(mg mgVar) {
        mgVar.run();
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        int i13;
        n8 n8Var;
        String str = (String) this.f45499c;
        m mVar = (m) this.d;
        long j12 = mVar.d;
        bi biVar = (bi) this.f45498b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.a2;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof ff) {
                    n5 l4 = n5.l((ff) next);
                    l4.J0 = j12;
                    l4.K0 = str;
                    l4.A();
                    o8 D = o8.D(mVar.f50273a.getParentActivity(), mVar.f50274b);
                    RectF rectF = D.H;
                    WindowManager.LayoutParams layoutParams = D.h;
                    int i14 = D.f51626c;
                    WindowManager windowManager = D.f51636f;
                    if (!D.d) {
                        if (wp.r1(i14).u2()) {
                            org.telegram.ui.b.b(i14);
                        } else {
                            D.f51686v0 = j12;
                            D.f51690w0 = str;
                            D.f51683u0 = false;
                            D.e = false;
                            D.B2 = false;
                            if (windowManager != null && (n8Var = D.f51659n) != null && n8Var.getParent() == null) {
                                i0.x3(windowManager, D.f51659n, layoutParams);
                                windowManager.addView(D.f51659n, layoutParams);
                                D.f0();
                            }
                            D.K1 = l4;
                            l4.J0 = j12;
                            l4.K0 = str;
                            D.O1 = l4.K ? 1 : 0;
                            D.f51677s0.f51333g = false;
                            D.J = 0;
                            Point point = i0.f16172q;
                            rectF.set(0.0f, i0.L(100.0f), point.x, i0.L(100.0f) + point.y);
                            D.G = i0.L(8.0f);
                            D.f51672r.c();
                            b8 b8Var = D.f51643h0;
                            int i15 = D.J;
                            if (i15 != 1 && i15 != 0) {
                                i13 = -14737633;
                            } else {
                                i13 = 0;
                            }
                            b8Var.setBackgroundColor(i13);
                            D.f51672r.setTranslationX(0.0f);
                            D.f51672r.setTranslationY(0.0f);
                            D.f51672r.b(0.0f);
                            D.f51672r.setScaleX(1.0f);
                            D.f51672r.setScaleY(1.0f);
                            D.K = 0.0f;
                            i0.g2(D.f51622b);
                            n5 n5Var = D.K1;
                            if (n5Var != null) {
                                D.f51628c1.setText(n5Var.C0);
                            }
                            D.J(1, false);
                            D.k0(-1, false, false);
                            D.f51624b1.b(false, false);
                            D.f51624b1.b(true, true);
                            D.f(1.0f, true, new y6(D, 6));
                            D.d();
                        }
                    }
                    i0.h3(new v(biVar, 25), 400L);
                }
            }
        }
    }

    @Override
    public Uri a() {
        return (Uri) this.f45498b;
    }

    @Override
    public boolean a1() {
        return true;
    }

    @Override
    public void b(ArrayList arrayList) {
        String str;
        if (!arrayList.isEmpty()) {
            str = ((qz) arrayList.get(0)).f17850c;
        } else {
            str = null;
        }
        String str2 = str;
        if (str2 == null) {
            return;
        }
        Utilities.e.c(new ox0(str2, (s20) this.f45498b, (k2) this.f45499c, (r20) this.d, 14));
    }

    @Override
    public Uri d() {
        return (Uri) this.d;
    }

    @Override
    public ka.a e(Class cls, ja.d dVar) {
        switch (this.f45497a) {
            case 9:
                ((HashMap) this.f45498b).put(cls, dVar);
                ((HashMap) this.f45499c).remove(cls);
                return this;
            case 16:
                ((HashMap) this.f45498b).put(cls, dVar);
                ((HashMap) this.f45499c).remove(cls);
                return this;
            case 18:
                ((HashMap) this.f45498b).put(cls, dVar);
                ((HashMap) this.f45499c).remove(cls);
                return this;
            default:
                ((HashMap) this.f45498b).put(cls, dVar);
                ((HashMap) this.f45499c).remove(cls);
                return this;
        }
    }

    @Override
    public Object f() {
        return null;
    }

    @Override
    public Object get() {
        return new d((Context) ((zc.a) this.f45498b).get(), (s5.d) ((zc.a) this.f45499c).get(), (r5.b) ((u) this.d).get(), 4);
    }

    @Override
    public ClipDescription getDescription() {
        return (ClipDescription) this.f45499c;
    }

    public void h(int i10, View view, boolean z10) {
        int p5;
        RecyclerView recyclerView = (RecyclerView) ((t) this.f45498b).f12685b;
        if (i10 < 0) {
            p5 = recyclerView.getChildCount();
        } else {
            p5 = p(i10);
        }
        ((g0) this.f45499c).G(p5, z10);
        if (z10) {
            t(view);
        }
        recyclerView.addView(view, p5);
        c1 U = RecyclerView.U(view);
        recyclerView.g0(view);
        s4.g0 g0Var = recyclerView.f1922x;
        if (g0Var != null && U != null) {
            g0Var.y(U);
        }
        ArrayList arrayList = recyclerView.P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((p0) recyclerView.P.get(size)).b();
            }
        }
    }

    public void i(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int p5;
        RecyclerView recyclerView = (RecyclerView) ((t) this.f45498b).f12685b;
        if (i10 < 0) {
            p5 = recyclerView.getChildCount();
        } else {
            p5 = p(i10);
        }
        ((g0) this.f45499c).G(p5, z10);
        if (z10) {
            t(view);
        }
        c1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.f47917l &= -257;
        }
        recyclerView.attachViewToParent(view, p5, layoutParams);
    }

    public void j(int i10) {
        c1 U;
        int p5 = p(i10);
        ((g0) this.f45499c).H(p5);
        RecyclerView recyclerView = (RecyclerView) ((t) this.f45498b).f12685b;
        View childAt = recyclerView.getChildAt(p5);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(p5);
    }

    public Object k(Bitmap bitmap) {
        yg.a aVar = (yg.a) this.f45498b;
        if (aVar.a(bitmap)) {
            this.d = ((yg.b) this.f45499c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    public View l(int i10) {
        return ((RecyclerView) ((t) this.f45498b).f12685b).getChildAt(p(i10));
    }

    public int m() {
        return ((RecyclerView) ((t) this.f45498b).f12685b).getChildCount() - ((ArrayList) this.d).size();
    }

    public long n() {
        l lVar = (l) this.d;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    public ByteBuffer o() {
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap != null) {
            if (bitmap == null) {
                return null;
            }
            int width = bitmap.getWidth();
            int height = ((Bitmap) this.d).getHeight();
            int i10 = width * height;
            int[] iArr = new int[i10];
            ((Bitmap) this.d).getPixels(iArr, 0, width, 0, 0, width, height);
            byte[] bArr = new byte[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                bArr[i11] = (byte) ((Color.blue(iArr[i11]) * 0.114f) + (Color.green(iArr[i11]) * 0.587f) + (Color.red(iArr[i11]) * 0.299f));
            }
            return ByteBuffer.wrap(bArr);
        }
        return (ByteBuffer) this.f45499c;
    }

    @Override
    public void onError(v61 v61Var, Exception exc) {
        y6 y6Var = ((k4) this.d).N;
        if (y6Var != null) {
            y6Var.run();
        }
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        k4 k4Var = (k4) this.d;
        i4 i4Var = k4Var.K;
        v61 v61Var = k4Var.e;
        if (v61Var == null) {
            return;
        }
        if (v61Var.d0()) {
            i0.g3(i4Var);
        } else {
            i0.r(i4Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((k4) this.d).i();
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        k4 k4Var = (k4) this.d;
        n5 n5Var = (n5) this.f45498b;
        if (n5Var != null) {
            m5 V = k4Var.e.V(n5Var.f51539d1);
            n5Var.f51539d1 = V;
            l61 l61Var = k4Var.f51432n;
            if (l61Var != null) {
                l61Var.setHDRInfo(V);
            }
        }
        int i13 = (int) (i10 * f7);
        k4Var.f51424f = i13;
        int i14 = (int) (i11 * f7);
        k4Var.h = i14;
        if (n5Var != null && (n5Var.f51552k0 != i13 || n5Var.f51554l0 != i14)) {
            n5Var.f51552k0 = i13;
            n5Var.f51554l0 = i14;
            n5Var.A();
        }
        k4Var.b();
        l61 l61Var2 = k4Var.f51432n;
        if (l61Var2 != null) {
            int i15 = k4Var.f51424f;
            int i16 = k4Var.h;
            l61Var2.d = i15;
            l61Var2.e = i16;
            gz gzVar = l61Var2.f28063b;
            if (gzVar != null) {
                gzVar.postRunnable(new cz(gzVar, i15, i16, 0));
            }
        }
    }

    public int p(int i10) {
        g0 g0Var = (g0) this.f45499c;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((t) this.f45498b).f12685b).getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int C = i10 - (i11 - g0Var.C(i11));
            if (C == 0) {
                while (g0Var.F(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += C;
        }
        return -1;
    }

    public View q(int i10) {
        return ((RecyclerView) ((t) this.f45498b).f12685b).getChildAt(i10);
    }

    public int r() {
        return ((RecyclerView) ((t) this.f45498b).f12685b).getChildCount();
    }

    public boolean s() {
        throw new UnsupportedOperationException("Method not decompiled: q5.d.s():boolean");
    }

    public void t(View view) {
        ((ArrayList) this.d).add(view);
        t tVar = (t) this.f45498b;
        c1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.f47909a;
            RecyclerView recyclerView = (RecyclerView) tVar.f12685b;
            int i10 = U.f47924s;
            if (i10 != -1) {
                U.f47923r = i10;
            } else {
                WeakHashMap weakHashMap = h0.f46134a;
                U.f47923r = view2.getImportantForAccessibility();
            }
            if (recyclerView.c0()) {
                U.f47924s = 4;
                recyclerView.K0.add(U);
                return;
            }
            WeakHashMap weakHashMap2 = h0.f46134a;
            view2.setImportantForAccessibility(4);
        }
    }

    public String toString() {
        String str = "";
        switch (this.f45497a) {
            case 5:
                return ((g0) this.f45499c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            case 11:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f45498b);
                sb2.append('{');
                d dVar = (d) ((d) this.f45499c).d;
                while (dVar != null) {
                    Object obj = dVar.f45499c;
                    sb2.append(str);
                    String str2 = (String) dVar.f45498b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    dVar = (d) dVar.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 14:
                return (String) this.f45498b;
            case 24:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f45498b);
                sb3.append('{');
                d dVar2 = (d) ((d) this.f45499c).d;
                while (dVar2 != null) {
                    Object obj2 = dVar2.f45499c;
                    sb3.append(str);
                    String str3 = (String) dVar2.f45498b;
                    if (str3 != null) {
                        sb3.append(str3);
                        sb3.append('=');
                    }
                    if (obj2 != null && obj2.getClass().isArray()) {
                        String deepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) deepToString2, 1, deepToString2.length() - 1);
                    } else {
                        sb3.append(obj2);
                    }
                    dVar2 = (d) dVar2.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public void u(g2.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, u2.w0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: q5.d.u(g2.h, android.net.Uri, java.util.Map, long, long, u2.w0):void");
    }

    public void v(i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(i.class);
        }
        ((EnumMap) this.d).put((EnumMap) iVar, (i) obj);
    }

    public void w() {
        int i10;
        RecyclerView recyclerView = (RecyclerView) ((t) this.f45498b).f12685b;
        ((g0) this.f45499c).I();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            c1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i11 = U.f47923r;
                if (recyclerView.c0()) {
                    U.f47924s = i11;
                    recyclerView.K0.add(U);
                } else {
                    View view = U.f47909a;
                    WeakHashMap weakHashMap = h0.f46134a;
                    view.setImportantForAccessibility(i11);
                }
                U.f47923r = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
    }

    public void x(l5.i iVar, int i10, boolean z10) {
        Long l4;
        char c10;
        r5.b bVar = (r5.b) this.d;
        Context context = (Context) this.f45498b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f11665a;
        String str2 = iVar.f11665a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        i5.d dVar = iVar.f11667c;
        adler32.update(allocate.putInt(v5.a.a(dVar)).array());
        byte[] bArr = iVar.f11666b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        n6.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((g) ((s5.d) this.f45499c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(v5.a.a(dVar))});
        try {
            if (rawQuery.moveToNext()) {
                l4 = Long.valueOf(rawQuery.getLong(0));
            } else {
                l4 = 0L;
            }
            rawQuery.close();
            long longValue = l4.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(bVar.a(dVar, longValue, i10));
            Set set = ((r5.c) bVar.f46332b.get(dVar)).f46335c;
            if (set.contains(r5.d.f46336a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(r5.d.f46338c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(r5.d.f46337b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", v5.a.a(dVar));
            if (bArr != null) {
                c10 = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c10 = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf = Integer.valueOf(value);
            Long valueOf2 = Long.valueOf(bVar.a(dVar, longValue, i10));
            Integer valueOf3 = Integer.valueOf(i10);
            Object[] objArr = new Object[5];
            objArr[c10] = iVar;
            objArr[1] = valueOf;
            objArr[2] = valueOf2;
            objArr[3] = l4;
            objArr[4] = valueOf3;
            String c11 = n6.c("JobInfoScheduler");
            if (Log.isLoggable(c11, 3)) {
                Log.d(c11, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void y(View view) {
        if (((ArrayList) this.d).remove(view)) {
            t tVar = (t) this.f45498b;
            c1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) tVar.f12685b;
                int i10 = U.f47923r;
                if (recyclerView.c0()) {
                    U.f47924s = i10;
                    recyclerView.K0.add(U);
                } else {
                    View view2 = U.f47909a;
                    WeakHashMap weakHashMap = h0.f46134a;
                    view2.setImportantForAccessibility(i10);
                }
                U.f47923r = 0;
            }
        }
    }

    public d(FrameLayout frameLayout, Object obj, Serializable serializable, int i10) {
        this.f45497a = i10;
        this.d = frameLayout;
        this.f45498b = obj;
        this.f45499c = serializable;
    }

    @Override
    public void onRenderedFirstFrame() {
        n5 n5Var = (n5) this.f45498b;
        Runnable[] runnableArr = (Runnable[]) this.f45499c;
        k4 k4Var = (k4) this.d;
        j4 j4Var = k4Var.H;
        if (j4Var != null && j4Var.f51333g) {
            int i10 = k4Var.f51424f;
            int i11 = k4Var.h;
            j4Var.d = true;
            j4Var.e = i10;
            j4Var.f51332f = i11;
            ag.a aVar = j4Var.f51331c;
            if (aVar != null) {
                aVar.a(Integer.valueOf(i10), Integer.valueOf(j4Var.f51332f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            k4Var.post(runnable);
            runnableArr[0] = null;
            Bitmap bitmap = k4Var.f51416a;
            if (bitmap != null) {
                bitmap.recycle();
                if (n5Var.M0 == k4Var.f51416a) {
                    n5Var.M0 = null;
                }
                k4Var.f51416a = null;
                k4Var.invalidate();
                return;
            }
            return;
        }
        l61 l61Var = k4Var.f51432n;
        if (l61Var != null) {
            if (j4Var == null || !j4Var.f51333g) {
                l61Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new r0(7, this, n5Var)).start();
            }
        }
    }

    public d(Object obj, Object obj2, Object obj3, int i10) {
        this.f45497a = i10;
        this.f45498b = obj;
        this.f45499c = obj2;
        this.d = obj3;
    }

    public d(String str, int i10) {
        this.f45497a = i10;
        switch (i10) {
            case 24:
                d dVar = new d(23, false);
                this.f45499c = dVar;
                this.d = dVar;
                this.f45498b = str;
                return;
            default:
                d dVar2 = new d(10, false);
                this.f45499c = dVar2;
                this.d = dVar2;
                this.f45498b = str;
                return;
        }
    }

    public d(yg.b bVar) {
        this.f45497a = 25;
        this.f45498b = new yg.a();
        this.f45499c = bVar;
    }

    public d(int i10) {
        this.f45497a = i10;
        switch (i10) {
            case 9:
                this.f45498b = new HashMap();
                this.f45499c = new HashMap();
                this.d = v7.i.f50482c;
                return;
            case 16:
                this.f45498b = new HashMap();
                this.f45499c = new HashMap();
                this.d = e.f52517c;
                return;
            case 18:
                this.f45498b = new HashMap();
                this.f45499c = new HashMap();
                this.d = d0.f53131c;
                return;
            case 26:
                this.f45498b = new HashMap();
                this.f45499c = new HashMap();
                this.d = x.f55160c;
                return;
            default:
                this.f45498b = new Object();
                this.f45499c = null;
                this.d = null;
                return;
        }
    }

    @Override
    public void N() {
    }

    @Override
    public void V() {
    }

    @Override
    public void c() {
    }

    @Override
    public void g() {
    }

    @Override
    public void j0() {
    }

    public d(String str, j[] jVarArr) {
        this.f45497a = 14;
        System.currentTimeMillis();
        this.f45498b = str;
        this.f45499c = jVarArr;
        this.d = null;
    }

    @Override
    public void n0(Object obj) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void v0(TLRPC.User user) {
    }

    public d(t tVar) {
        this.f45497a = 5;
        this.f45498b = tVar;
        this.f45499c = new g0(7);
        this.d = new ArrayList();
    }

    public d(FirebaseMessagingService firebaseMessagingService, y yVar, ExecutorService executorService) {
        this.f45497a = 22;
        this.f45498b = executorService;
        this.f45499c = firebaseMessagingService;
        this.d = yVar;
    }

    public d(r rVar) {
        this.f45497a = 7;
        this.f45498b = rVar;
    }

    public d(Runnable runnable) {
        this.f45497a = 3;
        this.f45499c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f45498b = runnable;
    }

    @Override
    public void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
