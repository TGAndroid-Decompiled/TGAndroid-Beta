package qg;

import android.content.ClipData;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import e9.x1;
import ei.y7;
import gi.g4;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import m.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.m5;
import org.telegram.messenger.x2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jt0;
import org.telegram.ui.tq0;
import rg.p2;
import w7.p6;
public final class g0 implements j0, a5.b, t5.b, r9.d, u1, z1, y7, OnSuccessListener, ImageReceiver.ImageReceiverDelegate, ne.d, t0.e, qa.a, bm0, vh.a, x2.k, Continuation, zf.m, r0.n {
    public final int f44948a;
    public final Object f44949b;

    public g0(Object obj, int i10) {
        this.f44948a = i10;
        this.f44949b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        ((yh.i0) this.f44949b).h.j(k1Var);
        return r0.k1.f45250b;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public Typeface a() {
        return l0.a((Font) this.f44949b);
    }

    @Override
    public x1 b(int i10, b2.p1 p1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f44949b;
        e9.k0 t10 = e9.n0.t();
        for (int i11 = 0; i11 < p1Var.f3907a; i11++) {
            t10.c(new x2.f(i10, p1Var, i11, iVar, iArr[i11]));
        }
        return t10.f();
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        ug.x0.Q((ug.x0) this.f44949b, view);
    }

    @Override
    public void d(WebView webView, a5.a aVar, Uri uri, boolean z10, b5.h hVar) {
        b5.h hVar2;
        qi.i iVar = (qi.i) this.f44949b;
        if (webView == iVar.f45197o && z10 && uri != null && iVar.f45189f.equals(uri.toString()) && iVar.h(webView)) {
            int i10 = aVar.f281b;
            if (i10 == 0) {
                aVar.h(0);
                String str = (String) aVar.f282c;
                if (!iVar.f45199q && str != null && str.startsWith("tproxy-base64:")) {
                    synchronized (iVar.f45186a) {
                        if (!iVar.f45203u && iVar.f45200r && iVar.f45198p == hVar) {
                            if (str.length() - 14 > 1398112) {
                                iVar.f();
                                return;
                            } else {
                                iVar.f45193k.execute(new p2.b(4, iVar, str));
                                return;
                            }
                        }
                        return;
                    }
                }
                iVar.g(str, hVar);
            } else if (i10 == 1) {
                synchronized (iVar.f45186a) {
                    if (!iVar.f45203u && (hVar2 = iVar.f45198p) != null && hVar2 == hVar) {
                        aVar.h(1);
                        byte[] bArr = (byte[]) aVar.d;
                        Objects.requireNonNull(bArr);
                        iVar.f45193k.execute(new p2.b(5, iVar, bArr));
                    }
                }
            }
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        yj0 lottieAnimation;
        p2 p2Var = (p2) this.f44949b;
        if (z10 && !z11 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
            p2Var.q(lottieAnimation);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        m5.a(this, i10, str, drawable);
    }

    @Override
    public void e() {
        float f7;
        jt0 jt0Var = (jt0) this.f44949b;
        TextView textView = jt0Var.f45919y1;
        boolean a2 = jt0Var.F0.a();
        ImageView imageView = jt0Var.f45917w1;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f10 = 0.6f;
        if (a2) {
            f7 = 1.0f;
        } else {
            f7 = 0.6f;
        }
        animate.alpha(f7).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a2) {
            f10 = 1.0f;
        }
        animate2.alpha(f10).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override
    public boolean f(t0.i iVar, int i10, Bundle bundle) {
        r0.d dVar;
        m.t tVar = (m.t) this.f44949b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f47309a.d();
                Parcelable parcelable = (Parcelable) iVar.f47309a.j();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        t0.h hVar = iVar.f47309a;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.c()));
        if (i11 >= 31) {
            dVar = new j2.i(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.f45222b = clipData;
            eVar.f45223c = 2;
            dVar = eVar;
        }
        dVar.b(hVar.f());
        dVar.setExtras(bundle);
        if (r0.i0.h(tVar, dVar.build()) != null) {
            return false;
        }
        return true;
    }

    @Override
    public void g(c2 c2Var, int i10) {
        switch (this.f44948a) {
            case 8:
                ((tq0) this.f44949b).run();
                return;
            case 9:
                ((rg.b0) this.f44949b).f45720a.f45893f2.s();
                return;
            case 19:
                ((ug.r0) this.f44949b).run();
                return;
            case 20:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.f44949b;
                o2 R = LaunchActivity.R();
                if (R != null) {
                    ug.a0.T(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    return;
                }
                return;
            case 21:
                ((x2) this.f44949b).run();
                return;
            case 22:
                ((ug.r0) this.f44949b).run();
                return;
            default:
                ((ai.g0) this.f44949b).run();
                return;
        }
    }

    @Override
    public void h(qa.b bVar) {
        u9.a aVar = (u9.a) this.f44949b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.f48072b.set((u9.a) bVar.get());
    }

    @Override
    public void i(long j10) {
        ((yh.d) this.f44949b).a(j10, true);
    }

    @Override
    public Object j() {
        SQLiteDatabase a2;
        int i10 = this.f44948a;
        Object obj = this.f44949b;
        switch (i10) {
            case 2:
                s5.g gVar = (s5.g) ((s5.c) obj);
                gVar.getClass();
                int i11 = o5.a.e;
                com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r(7, false);
                rVar.f7673c = null;
                rVar.d = new ArrayList();
                rVar.e = null;
                rVar.f7672b = "";
                HashMap hashMap = new HashMap();
                a2 = gVar.a();
                a2.beginTransaction();
                try {
                    o5.a aVar = (o5.a) s5.g.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new ry(gVar, hashMap, rVar, 10));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 3:
                s5.g gVar2 = (s5.g) ((s5.d) obj);
                long d = gVar2.f46530b.d() - gVar2.d.d;
                a2 = gVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(d)};
                    Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        int i12 = rawQuery.getInt(0);
                        gVar2.e(i12, o5.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    int delete = a2.delete("events", "timestamp_ms < ?", strArr);
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 4:
                s5.g gVar3 = (s5.g) ((s5.c) ((ea.b) obj).f8557i);
                a2 = gVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.f46530b.d()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                com.google.firebase.messaging.r rVar2 = (com.google.firebase.messaging.r) obj;
                for (l5.i iVar : (Iterable) ((s5.g) ((s5.d) rVar2.f7673c)).c(new s0.b(6))) {
                    ((g3) rVar2.d).U(iVar, 1, false);
                }
                return null;
        }
    }

    @Override
    public Object j2(z5 z5Var) {
        return this.f44949b;
    }

    @Override
    public Bitmap k(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.f44949b, options);
    }

    @Override
    public void m(Canvas canvas, int i10) {
        vh.h hVar = (vh.h) this.f44949b;
        hVar.getClass();
        canvas.save();
        RectF rectF = hVar.f48884r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        hVar.e(canvas, true, i10);
        canvas.restore();
    }

    @Override
    public void o(int i10, float f7, float f10, ne.e eVar) {
        rh.c.a((rh.c) this.f44949b);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        m5.b(this, imageReceiver);
    }

    @Override
    public void onSuccess(Object obj) {
        int i10 = this.f44948a;
        Object obj2 = this.f44949b;
        switch (i10) {
            case 11:
                rg.z1 z1Var = (rg.z1) obj2;
                bc.b bVar = (bc.b) obj;
                z1Var.C0 = true;
                z1Var.B0 = false;
                return;
            case 12:
                g4 g4Var = (g4) obj2;
                bc.b bVar2 = (bc.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < bVar2.f4252a.size(); i11++) {
                    bc.a aVar = (bc.a) bVar2.f4252a.get(i11);
                    ?? obj3 = new Object();
                    obj3.f45950a = aVar.f4249a;
                    obj3.f45951b = aVar.d;
                    obj3.f45952c = aVar.e;
                    obj3.d = aVar.f4250b;
                    obj3.e = aVar.f4251c;
                    arrayList.add(obj3);
                }
                g4Var.run(arrayList);
                return;
            default:
                rg.o2 o2Var = (rg.o2) obj2;
                List list = (List) obj;
                o2Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    return;
                }
                int i12 = ((yb.a) list.get(0)).f50567c;
                String str = null;
                if (p6.f49242a == null) {
                    p6.f49242a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i12 >= 0) {
                    String[] strArr = p6.f49242a;
                    if (i12 < strArr.length) {
                        str = strArr[i12];
                    }
                }
                o2Var.f45991c0 = str;
                StringBuilder sb2 = new StringBuilder("objimg: detected #");
                sb2.append(((yb.a) list.get(0)).f50567c);
                sb2.append(" ");
                sb2.append(o2Var.f45991c0);
                sb2.append(" ");
                i2.o1.w(((yb.a) list.get(0)).f50565a, sb2);
                Emoji.getEmojiDrawable(o2Var.f45991c0);
                return;
        }
    }

    @Override
    public Object then(Task task) {
        ((CountDownLatch) this.f44949b).countDown();
        return null;
    }

    @Override
    public void H(float f7, int i10) {
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
