package t7;

import android.media.MediaCodec;
import android.media.MediaDrmException;
import android.os.Trace;
import android.text.style.CharacterStyle;
import android.util.Log;
import b2.x;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.OnFailureListener;
import fi.m4;
import j$.util.Objects;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.zl;
import org.telegram.ui.vv0;
public class u implements c3.g, cg.a, dg.a, ea.c, g2.g, gb.p, ti, n5.b, n2.q, r9.d, vb, l1, r2.k, OnFailureListener, y9.c, z3.l {
    public static u f45537b;
    public final int f45538a;

    public u(int i10) {
        this.f45538a = i10;
    }

    public static MediaCodec C0(com.google.firebase.messaging.m mVar) {
        String str = ((r2.o) mVar.f6194a).f43603a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static ea.a E0(u uVar) {
        return new ea.a(System.currentTimeMillis() + 3600000, new com.google.android.gms.internal.cast.a(8), new bc.d(true, false, false), 10.0d, 1.2d, 60);
    }

    public static short L3(short s10, short s11) {
        int i10;
        int i11 = s10 + 32768;
        int i12 = s11 + 32768;
        int i13 = 65535;
        if (i11 >= 32768 && i12 >= 32768) {
            i10 = (((i11 + i12) * 2) - ((i11 * i12) / 32768)) - 65535;
        } else {
            i10 = (i11 * i12) / 32768;
        }
        if (i10 != 65536) {
            i13 = i10;
        }
        return (short) (i13 - 32768);
    }

    @Override
    public void A(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            dg.a.f6537t.A(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            dg.a.f6536q.A(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
        } else {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public void A0(u1 u1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f45538a;
    }

    @Override
    public boolean A1(u1 u1Var, TLRPC.Chat chat) {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void B(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public void B0(u1 u1Var, float f7, float f10) {
        int i10 = this.f45538a;
    }

    @Override
    public void B1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f45538a;
    }

    @Override
    public void C(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public boolean C1() {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public byte[] D() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override
    public void D0(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f45538a;
    }

    @Override
    public void E1(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public void F0(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public int F1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override
    public void G(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public int H(x xVar) {
        String str = xVar.f2523s;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                    return 2;
                case 5:
                    return 1;
                case 6:
                    return 2;
                case 7:
                case '\b':
                    return 1;
            }
        }
        throw new IllegalArgumentException(t8.b.h("Unsupported MIME type: ", str));
    }

    @Override
    public void H0(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public void H1(MessageObject messageObject) {
        int i10 = this.f45538a;
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f45538a;
    }

    @Override
    public void J1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f45538a) {
            case 17:
            default:
                pf.d.r(u1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void K(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public boolean K0(long j10) {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public CharacterStyle K1(u1 u1Var) {
        switch (this.f45538a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    public boolean K3(CharSequence charSequence) {
        return false;
    }

    @Override
    public void L(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public void L0(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public void L1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f45538a;
    }

    @Override
    public void M(int i10, u1 u1Var) {
        int i11 = this.f45538a;
    }

    @Override
    public boolean M1(u1 u1Var, MessageObject messageObject) {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N(MessageObject messageObject) {
        int i10 = this.f45538a;
    }

    @Override
    public void N0(int i10, u1 u1Var) {
        int i11 = this.f45538a;
    }

    @Override
    public void N1(u1 u1Var, ah.t tVar) {
        int i10 = this.f45538a;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void O1() {
        int i10 = this.f45538a;
    }

    @Override
    public boolean P() {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f45538a;
    }

    @Override
    public void P1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f45538a;
    }

    @Override
    public boolean Q(u1 u1Var) {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(L3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public void Q1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f45538a;
    }

    @Override
    public boolean R() {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f45538a;
    }

    @Override
    public void S0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f45538a;
    }

    @Override
    public vv0 S1() {
        switch (this.f45538a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void T(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public boolean T0(u1 u1Var, boolean z10) {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean T1(long j10) {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void U0(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public void U1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f45538a;
    }

    @Override
    public int V() {
        switch (this.f45538a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean V1(u1 u1Var, TLRPC.TodoItem todoItem) {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void W0(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public void X(wb wbVar, hb hbVar, qg qgVar, zl zlVar) {
        wbVar.setInOutOffset(wbVar.getMeasuredHeight());
        zlVar.accept(Float.valueOf(wbVar.getTranslationY()));
        o1.k kVar = new o1.k(wbVar, wb.IN_OUT_OFFSET_Y, 0.0f);
        kVar.f16161u.a(0.8f);
        kVar.f16161u.b(400.0f);
        kVar.a(new m4(1, wbVar, qgVar));
        kVar.b(new ub(zlVar, wbVar, 1));
        kVar.h();
        hbVar.run();
    }

    @Override
    public void X1(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public ih.a Y() {
        switch (this.f45538a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean Z(u1 u1Var) {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Z1(u1 u1Var, long j10) {
        int i10 = this.f45538a;
    }

    @Override
    public boolean a0(x xVar) {
        String str = xVar.f2523s;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override
    public boolean a1(int i10, u1 u1Var) {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Map b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean c() {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c0(u1 u1Var, TLRPC.User user) {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public g2.h createDataSource() {
        return new g2.c(false);
    }

    @Override
    public void d(wb wbVar, hb hbVar, fb fbVar, ib ibVar) {
        o1.k kVar = new o1.k(wbVar, wb.IN_OUT_OFFSET_Y, wbVar.getHeight());
        kVar.f16161u.a(0.8f);
        kVar.f16161u.b(400.0f);
        kVar.a(new jb(fbVar, 1));
        kVar.b(new ub(ibVar, wbVar, 0));
        kVar.h();
        hbVar.run();
    }

    @Override
    public void d0(int i10) {
        int i11 = this.f45538a;
    }

    @Override
    public boolean e() {
        switch (this.f45538a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean e0() {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean e1(MessageObject messageObject) {
        int i10 = this.f45538a;
        return c1.a(messageObject);
    }

    @Override
    public boolean e2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String f() {
        return null;
    }

    @Override
    public void f0(u1 u1Var, float f7, float f10) {
        int i10 = this.f45538a;
    }

    @Override
    public void f2(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public String g(u1 u1Var) {
        switch (this.f45538a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public byte[] g0(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public void g1() {
        int i10 = this.f45538a;
    }

    @Override
    public Object mo27get() {
        return new l5.p(Executors.newSingleThreadExecutor());
    }

    @Override
    public r2.l h(com.google.firebase.messaging.m r6) {
        throw new UnsupportedOperationException("Method not decompiled: t7.u.h(com.google.firebase.messaging.m):r2.l");
    }

    @Override
    public int h0(u1 u1Var) {
        switch (this.f45538a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void i(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f45538a;
    }

    @Override
    public void i0(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public void i1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f45538a;
    }

    @Override
    public Object i2() {
        return new ConcurrentSkipListMap();
    }

    @Override
    public void j() {
        int i10 = this.f45538a;
    }

    @Override
    public void j0(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void j2() {
        int i10 = this.f45538a;
    }

    @Override
    public n2.o k0(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override
    public boolean l0() {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void l1(u1 u1Var, TLRPC.Document document) {
        int i10 = this.f45538a;
    }

    @Override
    public void l2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f45538a;
    }

    @Override
    public void m(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f45538a;
    }

    @Override
    public void n(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public void n0(String str) {
        int i10 = this.f45538a;
    }

    @Override
    public Object n2(z5 z5Var) {
        switch (this.f45538a) {
            case 15:
                rb.a aVar = new rb.a();
                androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(7);
                ReferenceQueue referenceQueue = aVar.f43845a;
                Set set = aVar.f43846b;
                set.add(new rb.l(aVar, referenceQueue, set, nVar));
                Thread thread = new Thread(new j9.u(25, referenceQueue, set), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return aVar;
            default:
                return new Object();
        }
    }

    @Override
    public void o() {
        int i10 = this.f45538a;
    }

    @Override
    public boolean o0(b6 b6Var) {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public n2.p p() {
        throw new IllegalStateException();
    }

    @Override
    public int p0() {
        return 1;
    }

    @Override
    public boolean p2(int i10) {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public h2.b q(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void q0(u1 u1Var, float f7, float f10) {
        int i10 = this.f45538a;
    }

    @Override
    public void q1(u1 u1Var, float f7, float f10) {
        int i10 = this.f45538a;
    }

    @Override
    public void r(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public boolean r0() {
        return false;
    }

    @Override
    public void r2() {
        int i10 = this.f45538a;
    }

    @Override
    public void s() {
        int i10 = this.f45538a;
    }

    @Override
    public void s2(u1 u1Var, int i10, int i11) {
        int i12 = this.f45538a;
    }

    @Override
    public void t(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public ea.a t0(u uVar, JSONObject jSONObject) {
        return E0(uVar);
    }

    @Override
    public p9 t2() {
        switch (this.f45538a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void u(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f45538a;
    }

    @Override
    public void v(hh hhVar) {
        hhVar.run();
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10, boolean z10) {
        int i10 = this.f45538a;
    }

    @Override
    public boolean w() {
        return false;
    }

    @Override
    public boolean w0(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean w1() {
        switch (this.f45538a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String x(long j10) {
        switch (this.f45538a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean x0(MessageObject messageObject) {
        switch (this.f45538a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void x1(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public z3.n y(x xVar) {
        String str = xVar.f2523s;
        List list = xVar.v;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new b4.i(list);
                case 1:
                    return new pi.e(2);
                case 2:
                    return new ya.c(25);
                case 3:
                    return new n4.s(21);
                case 4:
                    return new g4.a(list);
                case 5:
                    return new d4.a(list);
                case 6:
                    return new h4.b(list);
                case 7:
                    return new e4.a();
                case '\b':
                    return new f4.e();
            }
        }
        throw new IllegalArgumentException(t8.b.h("Unsupported MIME type: ", str));
    }

    @Override
    public void y0(u1 u1Var) {
        int i10 = this.f45538a;
    }

    @Override
    public void y1(u1 u1Var, boolean z10) {
        int i10 = this.f45538a;
    }

    @Override
    public void z0() {
        int i10 = this.f45538a;
    }

    private final void C2() {
    }

    private final void D2() {
    }

    private final void I3() {
    }

    private final void J3() {
    }

    private final void O0() {
    }

    private final void O3() {
    }

    private final void P3() {
    }

    private final void R0() {
    }

    private final void S3() {
    }

    private final void T3() {
    }

    private final void W3() {
    }

    private final void X3() {
    }

    private final void a3() {
    }

    private final void b1() {
    }

    private final void b3() {
    }

    private final void c1() {
    }

    @Override
    public void F() {
    }

    @Override
    public void a() {
    }

    @Override
    public void release() {
    }

    @Override
    public void z() {
    }

    private final void A3(u1 u1Var) {
    }

    private final void B3(u1 u1Var) {
    }

    private final void C3(u1 u1Var) {
    }

    private final void D1(u1 u1Var) {
    }

    private final void E3(u1 u1Var) {
    }

    private final void G3(u1 u1Var) {
    }

    private final void H3(u1 u1Var) {
    }

    private final void M2(u1 u1Var) {
    }

    private final void N2(u1 u1Var) {
    }

    private final void Q2(u1 u1Var) {
    }

    private final void Q3(int i10) {
    }

    private final void R2(u1 u1Var) {
    }

    private final void R3(int i10) {
    }

    private final void S2(u1 u1Var) {
    }

    private final void T2(u1 u1Var) {
    }

    private final void U2(u1 u1Var) {
    }

    private final void U3(MessageObject messageObject) {
    }

    private final void V0(u1 u1Var) {
    }

    private final void V2(u1 u1Var) {
    }

    private final void V3(MessageObject messageObject) {
    }

    private final void W1(u1 u1Var) {
    }

    private final void X0(u1 u1Var) {
    }

    private final void Y0(u1 u1Var) {
    }

    private final void Y1(u1 u1Var) {
    }

    private final void Y2(u1 u1Var) {
    }

    private final void Z0(u1 u1Var) {
    }

    private final void Z2(u1 u1Var) {
    }

    private final void c2(u1 u1Var) {
    }

    private final void d1(u1 u1Var) {
    }

    private final void d2(u1 u1Var) {
    }

    private final void f1(u1 u1Var) {
    }

    private final void i3(String str) {
    }

    private final void j3(String str) {
    }

    private final void k1(u1 u1Var) {
    }

    private final void m1(u1 u1Var) {
    }

    private final void o3(u1 u1Var) {
    }

    private final void p3(u1 u1Var) {
    }

    private final void s1(u1 u1Var) {
    }

    private final void s3(u1 u1Var) {
    }

    private final void t1(u1 u1Var) {
    }

    private final void t3(u1 u1Var) {
    }

    private final void u1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void u2(u1 u1Var) {
    }

    private final void u3(MessageObject messageObject) {
    }

    private final void v1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void v2(u1 u1Var) {
    }

    private final void v3(MessageObject messageObject) {
    }

    private final void w2(u1 u1Var) {
    }

    private final void w3(u1 u1Var) {
    }

    private final void x2(u1 u1Var) {
    }

    private final void x3(u1 u1Var) {
    }

    private final void z1(u1 u1Var) {
    }

    @Override
    public void J(Object obj) {
    }

    @Override
    public void U(TLRPC.User user) {
    }

    @Override
    public void W(byte[] bArr) {
    }

    @Override
    public long l(long j10) {
        return j10;
    }

    @Override
    public void m0(m.l lVar) {
    }

    private final void A2(int i10, u1 u1Var) {
    }

    private final void B2(int i10, u1 u1Var) {
    }

    private final void D3(u1 u1Var, boolean z10) {
    }

    private final void F3(u1 u1Var, boolean z10) {
    }

    private final void G1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void I1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void J0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void M0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void O2(u1 u1Var, TLRPC.Document document) {
    }

    private final void P2(u1 u1Var, TLRPC.Document document) {
    }

    private final void a2(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void b2(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void h1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void j1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void k2(int i10, u1 u1Var) {
    }

    private final void k3(u1 u1Var, long j10) {
    }

    private final void l3(u1 u1Var, long j10) {
    }

    private final void m2(int i10, u1 u1Var) {
    }

    private final void o2(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void q2(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void y3(u1 u1Var, ah.t tVar) {
    }

    private final void z3(u1 u1Var, ah.t tVar) {
    }

    @Override
    public void k(byte[] bArr, j2.k kVar) {
    }

    private final void E2(u1 u1Var, float f7, float f10) {
    }

    private final void F2(u1 u1Var, float f7, float f10) {
    }

    private final void G0(u1 u1Var, float f7, float f10) {
    }

    private final void I0(u1 u1Var, float f7, float f10) {
    }

    private final void W2(u1 u1Var, float f7, float f10) {
    }

    private final void X2(u1 u1Var, float f7, float f10) {
    }

    private final void c3(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void d3(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void g2(u1 u1Var, int i10, int i11) {
    }

    private final void h2(u1 u1Var, int i10, int i11) {
    }

    private final void p1(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void q3(u1 u1Var, float f7, float f10) {
    }

    private final void r1(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void r3(u1 u1Var, float f7, float f10) {
    }

    private final void G2(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void H2(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void e3(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void f3(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void g3(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void h3(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void y2(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void z2(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void I2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void J2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void K2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void L2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void m3(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void n3(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void n1(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void o1(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void M3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void N3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void s0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override
    public void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
