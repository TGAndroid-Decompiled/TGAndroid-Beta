package p4;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.j0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d2.t1;
import g2.l0;
import g2.n0;
import g2.y;
import gi.v5;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileWriter;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import r0.i0;
import r0.k1;
public class q implements r0.m, hf.b, OnCompleteListener, h6.a, SuccessContinuation, i6.n, b4.m, e3.i {
    public Object f53181a;
    public Object f53182b;

    public q(Context context) {
        this.f53181a = context;
    }

    public static String I(q qVar) {
        Collection<String> collection = (Collection) qVar.f53182b;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) qVar.f53181a;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (upperCase.matches("[A-F0-9]+")) {
                sb2.append("/");
                sb2.append(upperCase);
            } else {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
        }
        if (collection != null) {
            if (!collection.isEmpty()) {
                if (str == null) {
                    sb2.append("/");
                }
                sb2.append("/");
                boolean z10 = true;
                for (String str2 : collection) {
                    i6.a.b(str2);
                    if (!z10) {
                        sb2.append(",");
                    }
                    if (!i6.a.f14618a.matcher(str2).matches()) {
                        StringBuilder sb3 = new StringBuilder(str2.length());
                        for (int i3 = 0; i3 < str2.length(); i3++) {
                            char charAt = str2.charAt(i3);
                            if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '_' && charAt != '-' && charAt != '.' && charAt != ':'))) {
                                sb3.append(String.format("%%%04x", Integer.valueOf(charAt)));
                            } else {
                                sb3.append(charAt);
                            }
                        }
                        str2 = sb3.toString();
                    }
                    sb2.append(str2);
                    z10 = false;
                }
            } else {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
        }
        if (str == null && collection == null) {
            sb2.append("/");
        }
        if (collection == null) {
            sb2.append("/");
        }
        sb2.append("//ALLOW_IPV6");
        return sb2.toString();
    }

    public static void c(q qVar, boolean z10, boolean z11) {
        synchronized (qVar) {
            boolean z12 = false;
            if (z10) {
                if (((PowerManager.WakeLock) qVar.f53182b) == null) {
                    if (((Context) qVar.f53181a).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        g2.a.l("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) qVar.f53181a).getSystemService("power");
                    if (powerManager == null) {
                        g2.a.l("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    }
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    qVar.f53182b = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) qVar.f53182b;
            if (wakeLock == null) {
                return;
            }
            if (z10 && z11) {
                z12 = true;
            }
            if (z12) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public static void d(q qVar, k2.c cVar) {
        qVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) qVar.f53181a).entrySet()) {
            if (entry.getKey() == null) {
                List list = (List) entry.getValue();
                if (!e(cVar, list).equals(e((k2.c) qVar.f53182b, list))) {
                    throw null;
                }
            } else {
                throw new ClassCastException();
            }
        }
        qVar.f53182b = cVar;
    }

    public static k2.c e(k2.c cVar, List list) {
        cVar.getClass();
        Map map = cVar.f16458a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new k2.c(hashMap);
    }

    public static boolean f(Editable editable, KeyEvent keyEvent, boolean z10) {
        androidx.emoji2.text.w[] wVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (wVarArr = (androidx.emoji2.text.w[]) editable.getSpans(selectionStart, selectionEnd, androidx.emoji2.text.w.class)) != null && wVarArr.length > 0) {
                for (androidx.emoji2.text.w wVar : wVarArr) {
                    int spanStart = editable.getSpanStart(wVar);
                    int spanEnd = editable.getSpanEnd(wVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public hf.a A(q qVar) {
        int i3;
        List list = (List) this.f53182b;
        List list2 = (List) qVar.f53181a;
        if (list2 != null) {
            i3 = list2.size();
        } else {
            i3 = 0;
        }
        if (i3 > 0) {
            ArrayList arrayList = new ArrayList(list.size() + i3);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new bd.j(qVar, (List) this.f53181a, list);
    }

    @Override
    public b4.d B(int i3, int i10, byte[] bArr) {
        return a1.g.a(this, bArr, i10);
    }

    public void C(androidx.mediarouter.app.q qVar) {
        if (qVar != null) {
            if (!((Set) this.f53182b).add(qVar)) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            qVar.f(handler);
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f53181a;
            hVar.f1200a.registerCallback(qVar.f2225a, handler);
            synchronized (hVar.f1201b) {
                if (hVar.f1203e.a() != null) {
                    android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(qVar);
                    hVar.d.put(qVar, gVar);
                    qVar.f2227c = gVar;
                    try {
                        hVar.f1203e.a().p(gVar);
                        qVar.e(13, null, null);
                    } catch (RemoteException e10) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                    }
                } else {
                    qVar.f2227c = null;
                    hVar.f1202c.add(qVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void D(android.support.v4.media.session.s sVar, Handler handler) {
        l lVar = (l) this.f53181a;
        synchronized (lVar.d) {
            lVar.f53173l = sVar;
            lVar.f53164a.setCallback((android.support.v4.media.session.r) sVar.f1212e, handler);
            sVar.d0(lVar, handler);
        }
    }

    public void E(int i3) {
        try {
            k8.e eVar = (k8.e) this.f53181a;
            Parcel P0 = eVar.P0();
            P0.writeInt(i3);
            eVar.T0(P0, 16);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public void F(byte[] r20, int r21, int r22, b4.l r23, g2.k r24) {
        throw new UnsupportedOperationException("Method not decompiled: p4.q.F(byte[], int, int, b4.l, g2.k):void");
    }

    public void G(w wVar) {
        l lVar = (l) this.f53181a;
        lVar.f53169g = wVar;
        synchronized (lVar.d) {
            for (int beginBroadcast = lVar.f53168f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) lVar.f53168f.getBroadcastItem(beginBroadcast)).u0(wVar);
                } catch (RemoteException | SecurityException e10) {
                    g2.a.d("MediaSessionCompat", "Dead object in setPlaybackState.", e10);
                }
            }
            lVar.f53168f.finishBroadcast();
        }
        MediaSession mediaSession = lVar.f53164a;
        if (wVar.f53202x == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(wVar.f53193a, wVar.f53194b, wVar.d, wVar.f53198n);
            builder.setBufferedPosition(wVar.f53195c);
            builder.setActions(wVar.f53196e);
            builder.setErrorMessage(wVar.h);
            for (v vVar : wVar.f53199r) {
                vVar.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(vVar.f53190a, vVar.f53191b, vVar.f53192c);
                builder2.setExtras(vVar.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(wVar.f53200s);
            builder.setExtras(wVar.f53201w);
            wVar.f53202x = builder.build();
        }
        mediaSession.setPlaybackState(wVar.f53202x);
    }

    public void H(androidx.mediarouter.app.q qVar) {
        if (qVar != null) {
            if (!((Set) this.f53182b).remove(qVar)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((android.support.v4.media.session.h) this.f53181a).b(qVar);
                return;
            } finally {
                qVar.f(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public k1 R0(View view, k1 k1Var) {
        b5.l lVar = (b5.l) this.f53182b;
        k1 g7 = i0.g(view, k1Var);
        if (g7.f54026a.n()) {
            return g7;
        }
        Rect rect = (Rect) this.f53181a;
        rect.left = g7.b();
        rect.top = g7.d();
        rect.right = g7.c();
        rect.bottom = g7.a();
        int childCount = lVar.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            k1 b10 = i0.b(lVar.getChildAt(i3), g7);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return g7.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override
    public int Y() {
        return 1;
    }

    @Override
    public e3.h a(e3.p pVar, long j10) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        y yVar = (y) this.f53182b;
        yVar.K(min);
        pVar.c(0, min, yVar.f11923a);
        int i3 = -1;
        int i10 = -1;
        long j11 = -9223372036854775807L;
        while (yVar.a() >= 4) {
            if (j3.a.a(yVar.f11924b, yVar.f11923a) != 442) {
                yVar.O(1);
            } else {
                yVar.O(4);
                long c2 = l4.x.c(yVar);
                if (c2 != -9223372036854775807L) {
                    long b10 = ((l0) this.f53181a).b(c2);
                    if (b10 > j10) {
                        if (j11 == -9223372036854775807L) {
                            return new e3.h(b10, -1, position);
                        }
                        return new e3.h(-9223372036854775807L, 0, position + i10);
                    } else if (b10 + 100000 > j10) {
                        return new e3.h(-9223372036854775807L, 0, position + yVar.f11924b);
                    } else {
                        j11 = b10;
                        i10 = yVar.f11924b;
                    }
                }
                int i11 = yVar.f11925c;
                if (yVar.a() < 10) {
                    yVar.N(i11);
                } else {
                    yVar.O(9);
                    int A = yVar.A() & 7;
                    if (yVar.a() < A) {
                        yVar.N(i11);
                    } else {
                        yVar.O(A);
                        if (yVar.a() < 4) {
                            yVar.N(i11);
                        } else {
                            if (j3.a.a(yVar.f11924b, yVar.f11923a) == 443) {
                                yVar.O(4);
                                int H = yVar.H();
                                if (yVar.a() < H) {
                                    yVar.N(i11);
                                } else {
                                    yVar.O(H);
                                }
                            }
                            while (true) {
                                if (yVar.a() < 4) {
                                    break;
                                }
                                int a10 = j3.a.a(yVar.f11924b, yVar.f11923a);
                                if (a10 == 442 || a10 == 441 || (a10 >>> 8) != 1) {
                                    break;
                                }
                                yVar.O(4);
                                if (yVar.a() < 2) {
                                    yVar.N(i11);
                                    break;
                                }
                                yVar.N(Math.min(yVar.f11925c, yVar.f11924b + yVar.H()));
                            }
                        }
                    }
                }
                i3 = yVar.f11924b;
            }
        }
        if (j11 != -9223372036854775807L) {
            return new e3.h(j11, -2, position + i3);
        }
        return e3.h.d;
    }

    @Override
    public void b() {
        y yVar = (y) this.f53182b;
        byte[] bArr = n0.f11874b;
        yVar.getClass();
        yVar.L(bArr.length, bArr);
    }

    public void g(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.f53181a).f1847y;
        if (sVar != null) {
            sVar.p().f1838o.g(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53182b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void h(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        j0 j0Var = (j0) this.f53181a;
        androidx.fragment.app.v vVar = j0Var.f1845w.f1942b;
        androidx.fragment.app.s sVar = j0Var.f1847y;
        if (sVar != null) {
            sVar.p().f1838o.h(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53182b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override
    public void i(String str, long j10, long j11, long j12) {
        i6.n nVar = (i6.n) this.f53181a;
        if (nVar != null) {
            nVar.i(str, j10, j11, j12);
        }
    }

    public void j(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.f53181a).f1847y;
        if (sVar != null) {
            sVar.p().f1838o.j(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53182b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void k(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.f53181a).f1847y;
        if (sVar != null) {
            sVar.p().f1838o.k(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53182b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void l(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.f53181a).f1847y;
        if (sVar != null) {
            sVar.p().f1838o.l(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53182b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void m(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.f53181a).f1847y;
        if (sVar != null) {
            sVar.p().f1838o.m(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53182b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void n(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        j0 j0Var = (j0) this.f53181a;
        androidx.fragment.app.v vVar = j0Var.f1845w.f1942b;
        androidx.fragment.app.s sVar = j0Var.f1847y;
        if (sVar != null) {
            sVar.p().f1838o.n(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53182b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void o(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.f53181a).f1847y;
        if (sVar != null) {
            sVar.p().f1838o.o(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53182b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override
    public void onComplete(Task task) {
        c9.c cVar = (c9.c) this.f53181a;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f53182b;
        synchronized (cVar.f4251f) {
            cVar.f4250e.remove(taskCompletionSource);
        }
    }

    @Override
    public void p(String str, long j10, int i3, Object obj, long j11, long j12) {
        int i10;
        i6.m mVar = (i6.m) this.f53182b;
        if (((i6.n) this.f53181a) != null) {
            if (i3 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.f14633i)};
                i6.b bVar = mVar.f14653a;
                Log.w(bVar.f14620a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((g6.h) mVar.h.f1155b).f12013i.iterator();
                while (it.hasNext()) {
                    ((g6.g) it.next()).o();
                }
                i10 = 2001;
            } else {
                i10 = i3;
            }
            ((i6.n) this.f53181a).p(str, j10, i10, obj, j11, j12);
        }
    }

    public void q(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.f53181a).f1847y;
        if (sVar != null) {
            sVar.p().f1838o.q(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53182b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void r(androidx.fragment.app.s f10, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.f53181a).f1847y;
        if (sVar != null) {
            sVar.p().f1838o.r(f10, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53182b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void s(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.f53181a).f1847y;
        if (sVar != null) {
            sVar.p().f1838o.s(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53182b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void t(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.f53181a).f1847y;
        if (sVar != null) {
            sVar.p().f1838o.t(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53182b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override
    public Task then(Object obj) {
        FileWriter fileWriter;
        Void r10 = (Void) obj;
        ha.c cVar = (ha.c) this.f53182b;
        JSONObject jSONObject = (JSONObject) ((aa.g) this.f53181a).f288c.f282a.submit(new d5.f(this, 1)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            ha.b k02 = ((v5) cVar.f14374c).k0(jSONObject);
            android.support.v4.media.c cVar2 = (android.support.v4.media.c) cVar.f14375e;
            long j10 = k02.f14369c;
            cVar2.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) cVar2.f1155b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Throwable th2) {
                        th = th2;
                        fileWriter2 = fileWriter;
                        z9.g.b(fileWriter2, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    z9.g.b(fileWriter, "Failed to close settings writer.");
                    ha.c.d("Loaded settings: ", jSONObject);
                    SharedPreferences.Editor edit = ((Context) cVar.f14372a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    edit.putString("existing_instance_identifier", (String) ((ha.e) cVar.f14373b).f14384f);
                    edit.apply();
                    ((AtomicReference) cVar.h).set(k02);
                    ((TaskCompletionSource) ((AtomicReference) cVar.f14378i).get()).trySetResult(k02);
                    return Tasks.forResult(null);
                }
            } catch (Exception e11) {
                e = e11;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                z9.g.b(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            z9.g.b(fileWriter, "Failed to close settings writer.");
            ha.c.d("Loaded settings: ", jSONObject);
            SharedPreferences.Editor edit2 = ((Context) cVar.f14372a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", (String) ((ha.e) cVar.f14373b).f14384f);
            edit2.apply();
            ((AtomicReference) cVar.h).set(k02);
            ((TaskCompletionSource) ((AtomicReference) cVar.f14378i).get()).trySetResult(k02);
        }
        return Tasks.forResult(null);
    }

    public void u(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.f53181a).f1847y;
        if (sVar != null) {
            sVar.p().f1838o.u(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53182b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public e3.o v(Object... objArr) {
        Constructor a10;
        synchronized (((AtomicBoolean) this.f53182b)) {
            if (!((AtomicBoolean) this.f53182b).get()) {
                try {
                    a10 = ((t1) this.f53181a).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f53182b).set(true);
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            a10 = null;
        }
        if (a10 == null) {
            return null;
        }
        try {
            return (e3.o) a10.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    public synchronized Map w() {
        try {
            if (((Map) this.f53182b) == null) {
                this.f53182b = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f53181a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f53182b;
    }

    public android.support.v4.media.session.m x() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.f53181a).f1200a.getTransportControls();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            return new android.support.v4.media.session.l(transportControls);
        }
        if (i3 >= 24) {
            return new android.support.v4.media.session.l(transportControls);
        }
        return new android.support.v4.media.session.l(transportControls);
    }

    public boolean y(CharSequence charSequence, int i3, int i10, androidx.emoji2.text.p pVar) {
        int i11;
        if (pVar.f1746c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.f53182b;
            r1.a b10 = pVar.b();
            int a10 = b10.a(8);
            if (a10 != 0) {
                ((ByteBuffer) b10.d).getShort(a10 + b10.f54061a);
            }
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.f1719b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i3 < i10) {
                sb2.append(charSequence.charAt(i3));
                i3++;
            }
            TextPaint textPaint = dVar.f1720a;
            String sb3 = sb2.toString();
            int i12 = i0.c.f14498a;
            if (textPaint.hasGlyph(sb3)) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            pVar.f1746c = i11;
        }
        if (pVar.f1746c != 2) {
            return false;
        }
        return true;
    }

    @Override
    public void z(Bitmap bitmap) {
        tf.b bVar = (tf.b) this.f53181a;
        bVar.f55095b = bitmap;
        h6.f fVar = (h6.f) this.f53182b;
        fVar.f14322l = bVar;
        fVar.b();
    }

    public q(Object obj, Object obj2) {
        this.f53181a = obj;
        this.f53182b = obj2;
    }

    public q(Object obj, Object obj2, boolean z10) {
        this.f53181a = obj2;
        this.f53182b = obj;
    }

    public q(int i3) {
        switch (i3) {
            case 23:
                this.f53181a = new HashMap();
                return;
            case 24:
            case 25:
            default:
                this.f53181a = new ConcurrentHashMap(16, 0.75f, 10);
                this.f53182b = new ReferenceQueue();
                return;
            case 26:
                this.f53181a = new HashMap();
                this.f53182b = k2.c.f16457b;
                return;
            case 27:
                this.f53181a = new y();
                this.f53182b = new k4.a();
                return;
        }
    }

    public q(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f53181a = new Messenger(iBinder);
            this.f53182b = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f53182b = new l6.f(iBinder);
            this.f53181a = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    @Override
    public void reset() {
    }

    public q(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (mediaSessionCompat$Token != null) {
            this.f53182b = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f53181a = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f53181a = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public q(t1 t1Var) {
        this.f53181a = t1Var;
        this.f53182b = new AtomicBoolean(false);
    }
}
