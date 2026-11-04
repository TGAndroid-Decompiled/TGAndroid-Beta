package p7;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b8.ig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Adler32;
import java.util.zip.InflaterInputStream;
import mi.z3;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.wy0;
public class d implements p5.b, t0.h, wi.w0, na.a {
    public final int f53344a;
    public Object f53345b;
    public Object f53346c;
    public Object d;

    public d(int i3, boolean z10) {
        this.f53344a = i3;
    }

    public static void D(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public void A(yb.i iVar, Object obj) {
        if (((EnumMap) this.f53346c) == null) {
            this.f53346c = new EnumMap(yb.i.class);
        }
        ((EnumMap) this.f53346c).put((EnumMap) iVar, (yb.i) obj);
    }

    public void B() {
        int i3;
        RecyclerView recyclerView = (RecyclerView) ((nh) this.f53345b).f36540b;
        ((ig) this.d).I();
        ArrayList arrayList = (ArrayList) this.f53346c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            u4.d1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i10 = U.f55555r;
                if (recyclerView.c0()) {
                    U.f55556s = i10;
                    recyclerView.L0.add(U);
                } else {
                    View view = U.f55540a;
                    WeakHashMap weakHashMap = r0.i0.f54015a;
                    view.setImportantForAccessibility(i10);
                }
                U.f55555r = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
    }

    public void C(z3 z3Var) {
        if (((tf.d) this.f53345b) != null) {
            for (int i3 = 0; i3 < z3Var.f20086a.size(); i3++) {
                tf.d dVar = (tf.d) this.f53345b;
                dVar.h.remove(z3Var.c(i3).d);
                dVar.h();
            }
        }
    }

    public void E(n5.i iVar, int i3, boolean z10) {
        Long l10;
        char c2;
        t5.a aVar = (t5.a) this.f53346c;
        Context context = (Context) this.f53345b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f20245a;
        String str2 = iVar.f20245a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        k5.d dVar = iVar.f20247c;
        adler32.update(allocate.putInt(x5.a.a(dVar)).array());
        byte[] bArr = iVar.f20246b;
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
                int i10 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i10 >= i3) {
                        x7.m.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((u5.g) ((u5.d) this.d)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(x5.a.a(dVar))});
        try {
            if (rawQuery.moveToNext()) {
                l10 = Long.valueOf(rawQuery.getLong(0));
            } else {
                l10 = 0L;
            }
            rawQuery.close();
            long longValue = l10.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, longValue, i3));
            Set set = ((t5.b) aVar.f54933b.get(dVar)).f54936c;
            if (set.contains(t5.c.f54937a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(t5.c.f54939c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(t5.c.f54938b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i3);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", x5.a.a(dVar));
            if (bArr != null) {
                c2 = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c2 = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf = Integer.valueOf(value);
            Long valueOf2 = Long.valueOf(aVar.a(dVar, longValue, i3));
            Integer valueOf3 = Integer.valueOf(i3);
            Object[] objArr = new Object[5];
            objArr[c2] = iVar;
            objArr[1] = valueOf;
            objArr[2] = valueOf2;
            objArr[3] = l10;
            objArr[4] = valueOf3;
            String c10 = x7.m.c("JobInfoScheduler");
            if (Log.isLoggable(c10, 3)) {
                Log.d(c10, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void F(tf.a aVar) {
        z3 z3Var;
        z3 z3Var2 = (z3) this.d;
        if (z3Var2 != null && ((tf.a) this.f53346c) == null && aVar != null) {
            g(z3Var2);
        }
        if (((tf.a) this.f53346c) != null && (z3Var = (z3) this.d) != null && aVar == null) {
            C(z3Var);
        }
        tf.a aVar2 = (tf.a) this.f53346c;
        if (aVar2 != null) {
            g6.h hVar = aVar2.f55087a;
            p6.m.d("Must be called from the main thread.");
            hVar.f12013i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.f55087a.p(aVar);
            z3 z3Var3 = (z3) this.d;
            if (z3Var3 != null) {
                aVar.d = z3Var3;
                aVar.f55092g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.f53346c = aVar;
    }

    public FileOutputStream G() {
        File file = (File) this.d;
        File file2 = (File) this.f53346c;
        if (file2.exists()) {
            D(file2, (File) this.f53345b);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (file.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(file);
                } catch (FileNotFoundException e10) {
                    throw new IOException("Failed to create new file " + file, e10);
                }
            }
            throw new IOException("Failed to create directory for " + file);
        }
    }

    public void H(View view) {
        if (((ArrayList) this.f53346c).remove(view)) {
            nh nhVar = (nh) this.f53345b;
            u4.d1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) nhVar.f36540b;
                int i3 = U.f55555r;
                if (recyclerView.c0()) {
                    U.f55556s = i3;
                    recyclerView.L0.add(U);
                } else {
                    View view2 = U.f55540a;
                    WeakHashMap weakHashMap = r0.i0.f54015a;
                    view2.setImportantForAccessibility(i3);
                }
                U.f55555r = 0;
            }
        }
    }

    public void I(Object obj, String str) {
        d dVar = new d(0, false);
        ((d) this.d).f53346c = dVar;
        this.d = dVar;
        dVar.d = obj;
        dVar.f53345b = str;
    }

    @Override
    public Uri a() {
        return (Uri) this.f53345b;
    }

    @Override
    public na.a c(Class cls, ma.d dVar) {
        switch (this.f53344a) {
            case 20:
                ((HashMap) this.f53345b).put(cls, dVar);
                ((HashMap) this.d).remove(cls);
                return this;
            case 25:
                ((HashMap) this.f53345b).put(cls, dVar);
                ((HashMap) this.d).remove(cls);
                return this;
            default:
                ((HashMap) this.f53345b).put(cls, dVar);
                ((HashMap) this.d).remove(cls);
                return this;
        }
    }

    @Override
    public Uri d() {
        return (Uri) this.f53346c;
    }

    @Override
    public Object e() {
        return null;
    }

    public void g(z3 z3Var) {
        if (((tf.d) this.f53345b) == null) {
            this.f53345b = new tf.d();
        }
        for (int i3 = 0; i3 < z3Var.f20086a.size(); i3++) {
            tf.d dVar = (tf.d) this.f53345b;
            tf.f c2 = z3Var.c(i3);
            dVar.h.put(c2.d, c2);
            dVar.h();
        }
    }

    @Override
    public Object mo5get() {
        return new d((Context) ((cd.a) this.f53345b).mo5get(), (u5.d) ((cd.a) this.d).mo5get(), (t5.a) ((mb.b) this.f53346c).mo5get(), 13);
    }

    @Override
    public ClipDescription getDescription() {
        return (ClipDescription) this.d;
    }

    public void h(int i3, View view, boolean z10) {
        int s6;
        RecyclerView recyclerView = (RecyclerView) ((nh) this.f53345b).f36540b;
        if (i3 < 0) {
            s6 = recyclerView.getChildCount();
        } else {
            s6 = s(i3);
        }
        ((ig) this.d).F(s6, z10);
        if (z10) {
            w(view);
        }
        recyclerView.addView(view, s6);
        u4.d1 U = RecyclerView.U(view);
        recyclerView.g0(view);
        u4.h0 h0Var = recyclerView.f2303x;
        if (h0Var != null && U != null) {
            h0Var.y(U);
        }
        ArrayList arrayList = recyclerView.Q;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((u4.q0) recyclerView.Q.get(size)).c();
            }
        }
    }

    public void i(View view, int i3, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int s6;
        RecyclerView recyclerView = (RecyclerView) ((nh) this.f53345b).f36540b;
        if (i3 < 0) {
            s6 = recyclerView.getChildCount();
        } else {
            s6 = s(i3);
        }
        ((ig) this.d).F(s6, z10);
        if (z10) {
            w(view);
        }
        u4.d1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.f55549l &= -257;
        }
        recyclerView.attachViewToParent(view, s6, layoutParams);
    }

    public void j() {
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.f53345b;
        if (a0Var != null) {
            int i3 = ((r4.e) this.f53346c).f54268n.d;
            android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.f1186b;
            uVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i3);
            uVar.f1216a.setPlaybackToLocal(builder.build());
            this.d = null;
        }
    }

    public void k(int i3) {
        u4.d1 U;
        int s6 = s(i3);
        ((ig) this.d).G(s6);
        RecyclerView recyclerView = (RecyclerView) ((nh) this.f53345b).f36540b;
        View childAt = recyclerView.getChildAt(s6);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(s6);
    }

    public void l(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f53345b;
        pa.e eVar = new pa.e(byteArrayOutputStream, hashMap, (HashMap) this.d, (ma.d) this.f53346c);
        if (obj == null) {
            return;
        }
        ma.d dVar = (ma.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, eVar);
            return;
        }
        throw new RuntimeException("No encoder for " + obj.getClass());
    }

    public qf.e m(qf.f fVar) {
        InflaterInputStream inflaterInputStream;
        int i3 = fVar.f53885c;
        InputStream inputStream = (rf.b) this.f53345b;
        if (fVar.d) {
            nh nhVar = (nh) this.f53346c;
            nhVar.getClass();
            byte[] bArr = new byte[i3];
            int i10 = 0;
            while (i10 < i3) {
                int read = ((rf.a) nhVar.f36540b).read(bArr, i10, i3 - i10);
                if (read > 0) {
                    i10 += read;
                } else {
                    throw new EOFException();
                }
            }
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < i3; i12++) {
                byte b10 = bArr[i12];
                if (!z10 || b10 != 0) {
                    bArr[i11] = b10;
                    i11++;
                }
                if (b10 == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            inputStream = new ByteArrayInputStream(bArr, 0, i11);
            i3 = i11;
        }
        if (!fVar.f53887f) {
            if (fVar.f53886e) {
                i3 = fVar.f53888g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new qf.e(inflaterInputStream, fVar.f53884b, i3, (qf.h) this.d, fVar);
        }
        throw new Exception("Frame encryption is not supported");
    }

    public View n(int i3) {
        return ((RecyclerView) ((nh) this.f53345b).f36540b).getChildAt(s(i3));
    }

    public int o() {
        return ((RecyclerView) ((nh) this.f53345b).f36540b).getChildCount() - ((ArrayList) this.f53346c).size();
    }

    public long p() {
        e3.l lVar = (e3.l) this.f53346c;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    public ByteBuffer q() {
        Bitmap bitmap = (Bitmap) this.f53346c;
        if (bitmap != null) {
            if (bitmap == null) {
                return null;
            }
            int width = bitmap.getWidth();
            int height = ((Bitmap) this.f53346c).getHeight();
            int i3 = width * height;
            int[] iArr = new int[i3];
            ((Bitmap) this.f53346c).getPixels(iArr, 0, width, 0, 0, width, height);
            byte[] bArr = new byte[i3];
            for (int i10 = 0; i10 < i3; i10++) {
                bArr[i10] = (byte) ((Color.blue(iArr[i10]) * 0.114f) + (Color.green(iArr[i10]) * 0.587f) + (Color.red(iArr[i10]) * 0.299f));
            }
            return ByteBuffer.wrap(bArr);
        }
        return (ByteBuffer) this.d;
    }

    @Override
    public void r(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        allocateDirect.put(byteBuffer).flip();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ((ArrayList) this.f53345b).add(allocateDirect);
        ((ArrayList) this.d).add(bufferInfo2);
    }

    public int s(int i3) {
        ig igVar = (ig) this.d;
        if (i3 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((nh) this.f53345b).f36540b).getChildCount();
        int i10 = i3;
        while (i10 < childCount) {
            int y9 = i3 - (i10 - igVar.y(i10));
            if (y9 == 0) {
                while (igVar.E(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += y9;
        }
        return -1;
    }

    public View t(int i3) {
        return ((RecyclerView) ((nh) this.f53345b).f36540b).getChildAt(i3);
    }

    public String toString() {
        String str = "";
        switch (this.f53344a) {
            case 1:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f53345b);
                sb2.append('{');
                d dVar = (d) ((d) this.f53346c).f53346c;
                while (dVar != null) {
                    Object obj = dVar.d;
                    sb2.append(str);
                    String str2 = (String) dVar.f53345b;
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
                    dVar = (d) dVar.f53346c;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 5:
                StringBuilder sb3 = new StringBuilder("id3v2tag[pos=");
                rf.b bVar = (rf.b) this.f53345b;
                sb3.append(bVar.f54501b);
                sb3.append(", ");
                sb3.append(bVar.e());
                sb3.append(" left]");
                return sb3.toString();
            case 15:
                return ((ig) this.d).toString() + ", hidden list:" + ((ArrayList) this.f53346c).size();
            case 22:
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append((String) this.f53345b);
                sb4.append('{');
                d dVar2 = (d) ((d) this.d).f53346c;
                while (dVar2 != null) {
                    Object obj2 = dVar2.d;
                    sb4.append(str);
                    String str3 = (String) dVar2.f53345b;
                    if (str3 != null) {
                        sb4.append(str3);
                        sb4.append('=');
                    }
                    if (obj2 != null && obj2.getClass().isArray()) {
                        String deepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb4.append((CharSequence) deepToString2, 1, deepToString2.length() - 1);
                    } else {
                        sb4.append(obj2);
                    }
                    dVar2 = (d) dVar2.f53346c;
                    str = ", ";
                }
                sb4.append('}');
                return sb4.toString();
            case 27:
                return (String) this.f53345b;
            default:
                return super.toString();
        }
    }

    public int u() {
        return ((RecyclerView) ((nh) this.f53345b).f36540b).getChildCount();
    }

    public boolean v() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f53346c;
        if (((String) this.f53345b) != null) {
            return true;
        }
        if (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.poll();
            str.getClass();
            this.f53345b = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.d).readLine();
            this.f53345b = readLine;
            if (readLine != null) {
                trim = readLine.trim();
                this.f53345b = trim;
            } else {
                return false;
            }
        } while (trim.isEmpty());
        return true;
    }

    public void w(View view) {
        ((ArrayList) this.f53346c).add(view);
        nh nhVar = (nh) this.f53345b;
        u4.d1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.f55540a;
            RecyclerView recyclerView = (RecyclerView) nhVar.f36540b;
            int i3 = U.f55556s;
            if (i3 != -1) {
                U.f55555r = i3;
            } else {
                WeakHashMap weakHashMap = r0.i0.f54015a;
                U.f55555r = view2.getImportantForAccessibility();
            }
            if (recyclerView.c0()) {
                U.f55556s = 4;
                recyclerView.L0.add(U);
                return;
            }
            WeakHashMap weakHashMap2 = r0.i0.f54015a;
            view2.setImportantForAccessibility(4);
        }
    }

    @Override
    public void x(MediaFormat mediaFormat) {
        this.f53346c = mediaFormat;
    }

    public void y(i2.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, w2.w0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: p7.d.y(i2.h, android.net.Uri, java.util.Map, long, long, w2.w0):void");
    }

    public String z() {
        if (v()) {
            String str = (String) this.f53345b;
            this.f53345b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public d(Object obj, Object obj2, Object obj3, int i3) {
        this.f53344a = i3;
        this.f53345b = obj;
        this.d = obj2;
        this.f53346c = obj3;
    }

    public d(String str, int i3) {
        this.f53344a = i3;
        switch (i3) {
            case 22:
                d dVar = new d(21, false);
                this.d = dVar;
                this.f53346c = dVar;
                this.f53345b = str;
                return;
            default:
                d dVar2 = new d(0, false);
                this.f53346c = dVar2;
                this.d = dVar2;
                this.f53345b = str;
                return;
        }
    }

    public d(int i3) {
        this.f53344a = i3;
        switch (i3) {
            case 19:
                this.f53345b = new ArrayList();
                this.d = new ArrayList();
                return;
            case 20:
                this.f53345b = new HashMap();
                this.d = new HashMap();
                this.f53346c = x7.i.f58313c;
                return;
            case 25:
                this.f53345b = new HashMap();
                this.d = new HashMap();
                this.f53346c = y7.e.f59069c;
                return;
            case 28:
                this.f53345b = new HashMap();
                this.d = new HashMap();
                this.f53346c = z7.c0.f59811c;
                return;
            default:
                this.f53345b = new Object();
                this.d = null;
                this.f53346c = null;
                return;
        }
    }

    @Override
    public void b() {
    }

    @Override
    public void f() {
    }

    public d(InputStream inputStream, long j10, int i3, qf.h hVar) {
        this.f53344a = 5;
        rf.b bVar = new rf.b(inputStream, j10, i3);
        this.f53345b = bVar;
        this.f53346c = new nh(bVar, 13);
        this.d = hVar;
    }

    public d(String str, Boolean bool, rc.a aVar, String str2) {
        this.f53344a = 9;
        this.f53345b = str;
        this.d = str2;
        this.f53346c = aVar;
    }

    public d(String str, yb.j[] jVarArr) {
        this.f53344a = 27;
        System.currentTimeMillis();
        this.f53345b = str;
        this.d = jVarArr;
        this.f53346c = null;
    }

    public d(nh nhVar, char c2) {
        this.f53344a = 15;
        this.f53345b = nhVar;
        this.d = new ig(7);
        this.f53346c = new ArrayList();
    }

    public d(File file) {
        this.f53344a = 3;
        this.f53345b = file;
        this.d = new File(file.getPath() + ".new");
        this.f53346c = new File(file.getPath() + ".bak");
    }

    public d(e3.r rVar) {
        this.f53344a = 17;
        this.f53345b = rVar;
    }

    public d(Runnable runnable) {
        this.f53344a = 6;
        this.d = new CopyOnWriteArrayList();
        this.f53346c = new HashMap();
        this.f53345b = runnable;
    }

    public d(nh nhVar) {
        this.f53344a = 4;
        this.f53344a = 4;
        this.f53345b = nhVar;
        this.d = Choreographer.getInstance();
        this.f53346c = new wy0(this, 1);
    }

    public d(String str, String str2) {
        this.f53344a = 16;
        this.f53345b = str;
        this.d = str2;
        this.f53346c = str2.isEmpty() ? str : a1.g.C(str, "/", str2);
    }

    public d(r4.e eVar, android.support.v4.media.session.a0 a0Var) {
        this.f53344a = 8;
        this.f53346c = eVar;
        this.f53345b = a0Var;
    }

    public d(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f53344a = 7;
        this.f53346c = arrayDeque;
        this.d = bufferedReader;
    }
}
