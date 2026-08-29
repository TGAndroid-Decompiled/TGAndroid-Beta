package x9;

import a5.j;
import ab.n;
import ab.o;
import ab.p;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kg.w;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.y5;
import org.telegram.ui.lu0;
import pa.m;
public class d implements OnFailureListener, s0, l, e2.c, n0, SuccessContinuation, h9.c, k6.d, a9.g, mf.a, n9.b, o3.c, o9.a, j1, v2.e, m, a9.e {
    public static volatile d f50112b;
    public final int f50113a;

    public d(int i10) {
        this.f50113a = i10;
    }

    @Override
    public void A(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public void A0(s1 s1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f50113a;
    }

    @Override
    public boolean A1() {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void B0(s1 s1Var, float f9, float f10) {
        int i10 = this.f50113a;
    }

    @Override
    public void C(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public void C1(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public void D0(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f50113a;
    }

    @Override
    public void F(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public void F0(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public void F1(s1 s1Var, boolean z10) {
        int i10 = this.f50113a;
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f50113a;
    }

    @Override
    public boolean H1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object I0(j jVar) {
        ab.a aVar = new ab.a();
        n nVar = new n(0);
        ReferenceQueue referenceQueue = aVar.f300a;
        Set set = aVar.f301b;
        set.add(new p(aVar, referenceQueue, set, nVar));
        Thread thread = new Thread(new o(0, referenceQueue, set), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @Override
    public void I1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f50113a;
    }

    @Override
    public void J0(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public boolean J1() {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public void L(int i10, s1 s1Var) {
        int i11 = this.f50113a;
    }

    @Override
    public void L1(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public boolean M0(long j10) {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int M1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override
    public void N(MessageObject messageObject) {
        int i10 = this.f50113a;
    }

    @Override
    public void N0(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public void N1(MessageObject messageObject) {
        int i10 = this.f50113a;
    }

    @Override
    public boolean O(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void O1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f50113a) {
            case 17:
            default:
                ye.d.s(s1Var.getContext(), str);
                return;
        }
    }

    @Override
    public boolean P() {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P0(int i10, s1 s1Var) {
        int i11 = this.f50113a;
    }

    @Override
    public CharacterStyle P1(s1 s1Var) {
        switch (this.f50113a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean Q(s1 s1Var) {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f50113a;
    }

    @Override
    public boolean R() {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f50113a;
    }

    @Override
    public boolean R1(s1 s1Var, MessageObject messageObject) {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
        int i11 = this.f50113a;
    }

    @Override
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i10, shortBuffer2.remaining() / i11);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            short s11 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i11 == 2) {
                shortBuffer2.put(s10);
                shortBuffer2.put(s11);
            } else if (i11 == 1) {
                shortBuffer2.put(bb.a.s3(s10, s11));
            }
        }
    }

    @Override
    public void S1() {
        int i10 = this.f50113a;
    }

    @Override
    public void T(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public void U1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f50113a;
    }

    @Override
    public int V() {
        switch (this.f50113a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void V0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f50113a;
    }

    @Override
    public void V1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f50113a;
    }

    @Override
    public boolean W0(s1 s1Var, boolean z10) {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean W1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public sg.a X() {
        switch (this.f50113a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void X0(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public boolean Y(s1 s1Var) {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Y0(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public lu0 Y1() {
        switch (this.f50113a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean Z(s1 s1Var, TLRPC.User user) {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public p0 Z0(Class cls, v1.b bVar) {
        return h(cls);
    }

    @Override
    public void a() {
        synchronized (f5.a.h) {
            Object obj = f5.a.f6564i;
            synchronized (obj) {
                if (f5.a.f6565j) {
                    return;
                }
                long a2 = f5.a.a();
                synchronized (obj) {
                    f5.a.f6566k = a2;
                    f5.a.f6565j = true;
                }
            }
        }
    }

    @Override
    public boolean a2(long j10) {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object apply(Object obj) {
        return ((w3) obj).a();
    }

    @Override
    public void b2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
        int i11 = this.f50113a;
    }

    @Override
    public boolean c() {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c0(int i10) {
        int i11 = this.f50113a;
    }

    @Override
    public boolean c1(int i10, s1 s1Var) {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c2(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public com.google.android.exoplayer2.upstream.m createDataSource() {
        return new com.google.android.exoplayer2.upstream.g(false);
    }

    @Override
    public n9.a d(ya.a aVar, JSONObject jSONObject) {
        a5.c cVar;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            cVar = new a5.c(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            cVar = new a5.c(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        a5.c cVar2 = cVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        kb.d dVar = new kb.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j10 = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j10 * 1000) + System.currentTimeMillis();
        }
        return new n9.a(currentTimeMillis, cVar2, dVar, optDouble, optDouble2, optInt2);
    }

    @Override
    public boolean d0() {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public List e(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (a9.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f232a;
            if (str != null) {
                bVar = new a9.b(str, bVar.f233b, bVar.f234c, bVar.d, bVar.f235e, new w(5, str, bVar), bVar.f237g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override
    public void e0(s1 s1Var, float f9, float f10) {
        int i10 = this.f50113a;
    }

    @Override
    public void e2(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public boolean f() {
        switch (this.f50113a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public int f0(s1 s1Var) {
        switch (this.f50113a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public String g(s1 s1Var) {
        switch (this.f50113a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void g0(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public void g2(s1 s1Var, long j10) {
        int i10 = this.f50113a;
    }

    @Override
    public p0 h(Class cls) {
        return new m0(true);
    }

    @Override
    public boolean h1(MessageObject messageObject) {
        int i10 = this.f50113a;
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public String i() {
        return null;
    }

    @Override
    public void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f50113a;
    }

    @Override
    public boolean j0() {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j2(s1 s1Var, hh.f fVar) {
        int i10 = this.f50113a;
    }

    @Override
    public void k() {
        int i10 = this.f50113a;
    }

    @Override
    public void k1() {
        int i10 = this.f50113a;
    }

    @Override
    public StackTraceElement[] m(StackTraceElement[] stackTraceElementArr) {
        int i10;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i14 = i11 - intValue;
                if (i11 + i14 <= stackTraceElementArr.length) {
                    for (int i15 = 0; i15 < i14; i15++) {
                        if (stackTraceElementArr[intValue + i15].equals(stackTraceElementArr[i11 + i15])) {
                        }
                    }
                    int intValue2 = i11 - num.intValue();
                    if (i13 < 10) {
                        System.arraycopy(stackTraceElementArr, i11, stackTraceElementArr2, i12, intValue2);
                        i12 += intValue2;
                        i13++;
                    }
                    i10 = (intValue2 - 1) + i11;
                    hashMap.put(stackTraceElement, Integer.valueOf(i11));
                    i11 = i10 + 1;
                }
            }
            stackTraceElementArr2[i12] = stackTraceElementArr[i11];
            i12++;
            i10 = i11;
            i13 = 1;
            hashMap.put(stackTraceElement, Integer.valueOf(i11));
            i11 = i10 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i12];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i12);
        if (i12 < stackTraceElementArr.length) {
            return stackTraceElementArr3;
        }
        return stackTraceElementArr;
    }

    @Override
    public void m0(String str) {
        int i10 = this.f50113a;
    }

    @Override
    public void m1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f50113a;
    }

    @Override
    public boolean m2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    public Signature[] m3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override
    public void n(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f50113a;
    }

    @Override
    public boolean n0(y5 y5Var) {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void n2(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public void o(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public void p() {
        int i10 = this.f50113a;
    }

    @Override
    public void p0(s1 s1Var, float f9, float f10) {
        int i10 = this.f50113a;
    }

    @Override
    public void p1(s1 s1Var, TLRPC.Document document) {
        int i10 = this.f50113a;
    }

    @Override
    public Object p2() {
        switch (this.f50113a) {
            case 20:
                return new ArrayList();
            default:
                return new pa.l(true);
        }
    }

    @Override
    public void q2() {
        int i10 = this.f50113a;
    }

    @Override
    public void s(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public void s2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
        int i10 = this.f50113a;
    }

    @Override
    public void t() {
        int i10 = this.f50113a;
    }

    @Override
    public void t0(s1 s1Var, TLRPC.User user, float f9, float f10) {
        int i10 = this.f50113a;
    }

    @Override
    public Task then(Object obj) {
        Void r12 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override
    public void u(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public void u1(s1 s1Var, float f9, float f10) {
        int i10 = this.f50113a;
    }

    @Override
    public boolean u2(int i10) {
        switch (this.f50113a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void v0(s1 s1Var, float f9, float f10, boolean z10) {
        int i10 = this.f50113a;
    }

    @Override
    public void w(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        switch (this.f50113a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void w2() {
        int i10 = this.f50113a;
    }

    @Override
    public void x2(s1 s1Var, int i10, int i11) {
        int i12 = this.f50113a;
    }

    @Override
    public String y(long j10) {
        switch (this.f50113a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void y0(s1 s1Var) {
        int i10 = this.f50113a;
    }

    @Override
    public l9 y2() {
        switch (this.f50113a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public c8.a z(Context context, String str, k6.c cVar) {
        c8.a aVar = new c8.a();
        int i10 = cVar.i(context, str, true);
        aVar.f3003b = i10;
        if (i10 != 0) {
            aVar.f3004c = 1;
            return aVar;
        }
        int l10 = cVar.l(context, str);
        aVar.f3002a = l10;
        if (l10 != 0) {
            aVar.f3004c = -1;
        }
        return aVar;
    }

    @Override
    public void z0() {
        int i10 = this.f50113a;
    }

    private final void A3() {
    }

    private final void B1() {
    }

    private final void D() {
    }

    private final void E2() {
    }

    private final void F2() {
    }

    private final void G() {
    }

    private final void W() {
    }

    private final void a0() {
    }

    private final void n3() {
    }

    private final void o3() {
    }

    private final void r3() {
    }

    private final void s3() {
    }

    private final void v3() {
    }

    private final void w3() {
    }

    private final void z1() {
    }

    private final void z3() {
    }

    @Override
    public void b() {
    }

    @Override
    public void h0() {
    }

    @Override
    public void q() {
    }

    private final void C2(s1 s1Var) {
    }

    private final void D2(s1 s1Var) {
    }

    private final void E0(s1 s1Var) {
    }

    private final void G0(s1 s1Var) {
    }

    private final void H0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void I(s1 s1Var) {
    }

    private final void J(s1 s1Var) {
    }

    private final void K0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void L0(s1 s1Var) {
    }

    private final void M(s1 s1Var) {
    }

    private final void M2(String str) {
    }

    private final void N2(String str) {
    }

    private final void O0(s1 s1Var) {
    }

    private final void S2(s1 s1Var) {
    }

    private final void T2(s1 s1Var) {
    }

    private final void U(s1 s1Var) {
    }

    private final void U0(s1 s1Var) {
    }

    private final void W2(s1 s1Var) {
    }

    private final void X2(s1 s1Var) {
    }

    private final void Y2(MessageObject messageObject) {
    }

    private final void Z2(MessageObject messageObject) {
    }

    private final void a1(s1 s1Var) {
    }

    private final void a3(s1 s1Var) {
    }

    private final void b0(s1 s1Var) {
    }

    private final void b3(s1 s1Var) {
    }

    private final void e1(s1 s1Var) {
    }

    private final void e3(s1 s1Var) {
    }

    private final void f1(s1 s1Var) {
    }

    private final void f2(s1 s1Var) {
    }

    private final void f3(s1 s1Var) {
    }

    private final void g3(s1 s1Var) {
    }

    private final void h2(s1 s1Var) {
    }

    private final void i0(s1 s1Var) {
    }

    private final void i3(s1 s1Var) {
    }

    private final void k3(s1 s1Var) {
    }

    private final void l2(s1 s1Var) {
    }

    private final void l3(s1 s1Var) {
    }

    private final void o2(s1 s1Var) {
    }

    private final void q0(s1 s1Var) {
    }

    private final void q1(s1 s1Var) {
    }

    private final void r0(s1 s1Var) {
    }

    private final void r1(s1 s1Var) {
    }

    private final void r2(s1 s1Var) {
    }

    private final void s1(s1 s1Var) {
    }

    private final void t1(s1 s1Var) {
    }

    private final void t2(s1 s1Var) {
    }

    private final void t3(int i10) {
    }

    private final void u3(int i10) {
    }

    private final void v2(s1 s1Var) {
    }

    private final void x3(MessageObject messageObject) {
    }

    private final void y3(MessageObject messageObject) {
    }

    private final void z2(s1 s1Var) {
    }

    @Override
    public long l(long j10) {
        return j10;
    }

    private final void B(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void O2(s1 s1Var, long j10) {
    }

    private final void P2(s1 s1Var, long j10) {
    }

    private final void Q0(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void T0(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void b1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void c3(s1 s1Var, hh.f fVar) {
    }

    private final void d1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void d3(s1 s1Var, hh.f fVar) {
    }

    private final void h3(s1 s1Var, boolean z10) {
    }

    private final void i2(s1 s1Var, TLRPC.Document document) {
    }

    private final void j1(int i10, s1 s1Var) {
    }

    private final void j3(s1 s1Var, boolean z10) {
    }

    private final void k0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void k2(s1 s1Var, TLRPC.Document document) {
    }

    private final void l1(int i10, s1 s1Var) {
    }

    private final void n1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void o0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void o1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void x(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void x1(int i10, s1 s1Var) {
    }

    private final void y1(int i10, s1 s1Var) {
    }

    @Override
    public void l0(int i10, Object obj) {
    }

    private final void A2(s1 s1Var, float f9, float f10) {
    }

    private final void B2(s1 s1Var, float f9, float f10) {
    }

    private final void C0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final void D1(s1 s1Var, float f9, float f10) {
    }

    private final void E1(s1 s1Var, float f9, float f10) {
    }

    private final void G2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void H2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void U2(s1 s1Var, float f9, float f10) {
    }

    private final void V2(s1 s1Var, float f9, float f10) {
    }

    private final void g1(s1 s1Var, int i10, int i11) {
    }

    private final void i1(s1 s1Var, int i10, int i11) {
    }

    private final void r(s1 s1Var, float f9, float f10) {
    }

    private final void v(s1 s1Var, float f9, float f10) {
    }

    private final void x0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final void G1(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void I2(s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    private final void J2(s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    private final void K1(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void K2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void L2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void v1(s1 s1Var, float f9, float f10, boolean z10) {
    }

    private final void w1(s1 s1Var, float f9, float f10, boolean z10) {
    }

    private final void Q2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void R2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void T1(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    private final void X1(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    private final void Z1(s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    private final void d2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    private final void s0(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    private final void u0(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    private final void p3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void q3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
