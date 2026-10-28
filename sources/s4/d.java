package s4;

import a8.lg;
import a8.of;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.zip.Adler32;
public class d implements t0.h, vi.x0, la.a {
    public final int f47754a;
    public Object f47755b;
    public Object f47756c;
    public Object d;

    public d(int i10, boolean z10) {
        this.f47754a = i10;
    }

    @Override
    public Uri a() {
        return (Uri) this.f47755b;
    }

    @Override
    public Uri c() {
        return (Uri) this.d;
    }

    @Override
    public la.a d(Class cls, ka.d dVar) {
        switch (this.f47754a) {
            case 7:
                ((HashMap) this.f47755b).put(cls, dVar);
                ((HashMap) this.f47756c).remove(cls);
                return this;
            case 12:
                ((HashMap) this.f47755b).put(cls, dVar);
                ((HashMap) this.f47756c).remove(cls);
                return this;
            default:
                ((HashMap) this.f47755b).put(cls, dVar);
                ((HashMap) this.f47756c).remove(cls);
                return this;
        }
    }

    @Override
    public Object e() {
        return null;
    }

    public void g(View view, int i10, boolean z10) {
        int m10;
        RecyclerView recyclerView = (RecyclerView) ((jg.s0) this.f47755b).f15827b;
        if (i10 < 0) {
            m10 = recyclerView.getChildCount();
        } else {
            m10 = m(i10);
        }
        ((lg) this.f47756c).C(m10, z10);
        if (z10) {
            p(view);
        }
        recyclerView.addView(view, m10);
        e1 U = RecyclerView.U(view);
        recyclerView.g0(view);
        h0 h0Var = recyclerView.f3082w;
        if (h0Var != null && U != null) {
            h0Var.y(U);
        }
        ArrayList arrayList = recyclerView.P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((r0) recyclerView.P.get(size)).c();
            }
        }
    }

    @Override
    public ClipDescription getDescription() {
        return (ClipDescription) this.f47756c;
    }

    public void h(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int m10;
        RecyclerView recyclerView = (RecyclerView) ((jg.s0) this.f47755b).f15827b;
        if (i10 < 0) {
            m10 = recyclerView.getChildCount();
        } else {
            m10 = m(i10);
        }
        ((lg) this.f47756c).C(m10, z10);
        if (z10) {
            p(view);
        }
        e1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.f47781l &= -257;
        }
        RecyclerView.c(recyclerView, view, m10, layoutParams);
    }

    public void i(int i10) {
        e1 U;
        int m10 = m(i10);
        ((lg) this.f47756c).D(m10);
        RecyclerView recyclerView = (RecyclerView) ((jg.s0) this.f47755b).f15827b;
        View childAt = recyclerView.getChildAt(m10);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        RecyclerView.d(recyclerView, m10);
    }

    public View j(int i10) {
        return ((RecyclerView) ((jg.s0) this.f47755b).f15827b).getChildAt(m(i10));
    }

    public int k() {
        return ((RecyclerView) ((jg.s0) this.f47755b).f15827b).getChildCount() - ((ArrayList) this.d).size();
    }

    public long l() {
        c3.l lVar = (c3.l) this.d;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    public int m(int i10) {
        lg lgVar = (lg) this.f47756c;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((jg.s0) this.f47755b).f15827b).getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int y3 = i10 - (i11 - lgVar.y(i11));
            if (y3 == 0) {
                while (lgVar.B(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += y3;
        }
        return -1;
    }

    public View n(int i10) {
        return ((RecyclerView) ((jg.s0) this.f47755b).f15827b).getChildAt(i10);
    }

    public int o() {
        return ((RecyclerView) ((jg.s0) this.f47755b).f15827b).getChildCount();
    }

    public void p(View view) {
        ((ArrayList) this.d).add(view);
        jg.s0 s0Var = (jg.s0) this.f47755b;
        e1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.f47773a;
            RecyclerView recyclerView = (RecyclerView) s0Var.f15827b;
            int i10 = U.f47788s;
            if (i10 != -1) {
                U.f47787r = i10;
            } else {
                WeakHashMap weakHashMap = r0.i0.f47143a;
                U.f47787r = view2.getImportantForAccessibility();
            }
            if (recyclerView.c0()) {
                U.f47788s = 4;
                recyclerView.K0.add(U);
                return;
            }
            WeakHashMap weakHashMap2 = r0.i0.f47143a;
            view2.setImportantForAccessibility(4);
        }
    }

    @Override
    public void q(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        allocateDirect.put(byteBuffer).flip();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ((ArrayList) this.d).add(allocateDirect);
        ((ArrayList) this.f47755b).add(bufferInfo2);
    }

    public void r(g2.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, u2.w0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: s4.d.r(g2.h, android.net.Uri, java.util.Map, long, long, u2.w0):void");
    }

    public void s() {
        int i10;
        RecyclerView recyclerView = (RecyclerView) ((jg.s0) this.f47755b).f15827b;
        ((lg) this.f47756c).E();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i11 = U.f47787r;
                if (recyclerView.c0()) {
                    U.f47788s = i11;
                    recyclerView.K0.add(U);
                } else {
                    View view = U.f47773a;
                    WeakHashMap weakHashMap = r0.i0.f47143a;
                    view.setImportantForAccessibility(i11);
                }
                U.f47787r = 0;
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

    public void t(m5.i iVar, int i10, boolean z10) {
        Long l4;
        char c10;
        s5.a aVar = (s5.a) this.d;
        Context context = (Context) this.f47755b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f18332a;
        String str2 = iVar.f18332a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        j5.d dVar = iVar.f18334c;
        adler32.update(allocate.putInt(w5.a.a(dVar)).array());
        byte[] bArr = iVar.f18333b;
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
                        of.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((t5.g) ((t5.d) this.f47756c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(w5.a.a(dVar))});
        try {
            if (rawQuery.moveToNext()) {
                l4 = Long.valueOf(rawQuery.getLong(0));
            } else {
                l4 = 0L;
            }
            rawQuery.close();
            long longValue = l4.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, longValue, i10));
            Set set = ((s5.b) aVar.f47912b.get(dVar)).f47915c;
            if (set.contains(s5.c.f47916a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(s5.c.f47918c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(s5.c.f47917b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", w5.a.a(dVar));
            if (bArr != null) {
                c10 = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c10 = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf = Integer.valueOf(value);
            Long valueOf2 = Long.valueOf(aVar.a(dVar, longValue, i10));
            Integer valueOf3 = Integer.valueOf(i10);
            Object[] objArr = new Object[5];
            objArr[c10] = iVar;
            objArr[1] = valueOf;
            objArr[2] = valueOf2;
            objArr[3] = l4;
            objArr[4] = valueOf3;
            String c11 = of.c("JobInfoScheduler");
            if (Log.isLoggable(c11, 3)) {
                Log.d(c11, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public String toString() {
        String str = "";
        switch (this.f47754a) {
            case 0:
                return ((lg) this.f47756c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            case 9:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f47755b);
                sb2.append('{');
                d dVar = (d) ((d) this.f47756c).d;
                while (dVar != null) {
                    Object obj = dVar.f47756c;
                    sb2.append(str);
                    String str2 = (String) dVar.f47755b;
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
            case 20:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f47755b);
                sb3.append('{');
                d dVar2 = (d) ((d) this.f47756c).d;
                while (dVar2 != null) {
                    Object obj2 = dVar2.f47756c;
                    sb3.append(str);
                    String str3 = (String) dVar2.f47755b;
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

    public void u(View view) {
        if (((ArrayList) this.d).remove(view)) {
            jg.s0 s0Var = (jg.s0) this.f47755b;
            e1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) s0Var.f15827b;
                int i10 = U.f47787r;
                if (recyclerView.c0()) {
                    U.f47788s = i10;
                    recyclerView.K0.add(U);
                } else {
                    View view2 = U.f47773a;
                    WeakHashMap weakHashMap = r0.i0.f47143a;
                    view2.setImportantForAccessibility(i10);
                }
                U.f47787r = 0;
            }
        }
    }

    @Override
    public void v(MediaFormat mediaFormat) {
        this.f47756c = mediaFormat;
    }

    public d(Object obj, Object obj2, Object obj3, int i10) {
        this.f47754a = i10;
        this.f47755b = obj;
        this.f47756c = obj2;
        this.d = obj3;
    }

    public d(String str, int i10) {
        this.f47754a = i10;
        switch (i10) {
            case 20:
                d dVar = new d(19, false);
                this.f47756c = dVar;
                this.d = dVar;
                this.f47755b = str;
                return;
            default:
                d dVar2 = new d(8, false);
                this.f47756c = dVar2;
                this.d = dVar2;
                this.f47755b = str;
                return;
        }
    }

    public d(String str, Boolean bool, xc.a aVar, String str2) {
        this.f47754a = 14;
        this.f47755b = str;
        this.f47756c = str2;
        this.d = aVar;
    }

    public d(jg.s0 s0Var) {
        this.f47754a = 0;
        this.f47755b = s0Var;
        this.f47756c = new lg(8);
        this.d = new ArrayList();
    }

    public d(c3.r rVar) {
        this.f47754a = 4;
        this.f47755b = rVar;
    }

    public d(int i10) {
        this.f47754a = i10;
        switch (i10) {
            case 7:
                this.f47755b = new HashMap();
                this.f47756c = new HashMap();
                this.d = w7.i.f50939c;
                return;
            case 12:
                this.f47755b = new HashMap();
                this.f47756c = new HashMap();
                this.d = x7.e.f51498c;
                return;
            case 15:
                this.f47755b = new HashMap();
                this.f47756c = new HashMap();
                this.d = y7.c0.f52148c;
                return;
            default:
                this.d = new ArrayList();
                this.f47755b = new ArrayList();
                return;
        }
    }

    @Override
    public void b() {
    }

    @Override
    public void f() {
    }

    public d(String str, String str2) {
        this.f47754a = 3;
        this.f47755b = str;
        this.f47756c = str2;
        this.d = str2.isEmpty() ? str : a1.g.D(str, "/", str2);
    }
}
