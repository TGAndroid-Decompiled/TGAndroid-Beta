package qb;

import android.content.Context;
import android.media.MediaDrmException;
import android.text.style.CharacterStyle;
import ci.u5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import ei.l4;
import j$.util.Objects;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import m.y0;
import n7.z0;
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
import org.telegram.ui.Components.fm;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.lh;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.yi;
import org.telegram.ui.sv0;
import sc.v;
public class b implements bg.a, cg.a, df.b, fb.o, yi, n5.b, n2.q, q9.d, vb, l1, r0.r, u5.a, Continuation, x9.c, y6.d, z3.k {
    public static b f46014b;
    public final int f46015a;

    public b(int i10) {
        this.f46015a = i10;
    }

    @Override
    public void A(u1 u1Var) {
        int i10 = this.f46015a;
    }

    @Override
    public void B(u1 u1Var) {
        int i10 = this.f46015a;
    }

    @Override
    public void B0(u1 u1Var, float f7, float f10, boolean z10) {
        int i10 = this.f46015a;
    }

    @Override
    public void B1(u1 u1Var, float f7, float f10) {
        int i10 = this.f46015a;
    }

    @Override
    public void C(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public boolean C0(MessageObject messageObject) {
        switch (this.f46015a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean C2(int i10) {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void D0(u1 u1Var) {
        int i10 = this.f46015a;
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f46015a;
    }

    @Override
    public void E0() {
        int i10 = this.f46015a;
    }

    @Override
    public void E2() {
        int i10 = this.f46015a;
    }

    @Override
    public void F(u1 u1Var) {
        int i10 = this.f46015a;
    }

    @Override
    public void F0(u1 u1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f46015a;
    }

    @Override
    public void F2(u1 u1Var, int i10, int i11) {
        int i12 = this.f46015a;
    }

    @Override
    public void G(wb wbVar, hb hbVar, tg tgVar, fm fmVar) {
        wbVar.setInOutOffset(wbVar.getMeasuredHeight());
        fmVar.accept(Float.valueOf(wbVar.getTranslationY()));
        o1.k kVar = new o1.k(wbVar, wb.IN_OUT_OFFSET_Y, 0.0f);
        kVar.f16691u.a(0.8f);
        kVar.f16691u.b(400.0f);
        kVar.a(new l4(1, wbVar, tgVar));
        kVar.b(new ub(fmVar, wbVar, 1));
        kVar.h();
        hbVar.run();
    }

    @Override
    public void G0(u1 u1Var, float f7, float f10) {
        int i10 = this.f46015a;
    }

    @Override
    public p9 G2() {
        switch (this.f46015a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean H(b2.s sVar) {
        String str = sVar.f3641r;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override
    public boolean H1() {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f46015a;
    }

    @Override
    public void I0(u1 u1Var) {
        int i10 = this.f46015a;
    }

    public boolean I3(CharSequence charSequence) {
        return false;
    }

    @Override
    public byte[] J(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public void J1(u1 u1Var) {
        int i10 = this.f46015a;
    }

    @Override
    public df.a K(z0 z0Var) {
        return new ze.h(z0Var);
    }

    @Override
    public void K0(u1 u1Var) {
        int i10 = this.f46015a;
    }

    @Override
    public void K1(u1 u1Var, boolean z10) {
        int i10 = this.f46015a;
    }

    @Override
    public void L(u1 u1Var) {
        int i10 = this.f46015a;
    }

    @Override
    public void M(int i10, u1 u1Var) {
        int i11 = this.f46015a;
    }

    @Override
    public boolean M1(u1 u1Var, TLRPC.Chat chat) {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N(MessageObject messageObject) {
        int i10 = this.f46015a;
    }

    @Override
    public void N0(u1 u1Var) {
        int i10 = this.f46015a;
    }

    @Override
    public void N1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f46015a;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean O1() {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean P() {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Q(u1 u1Var) {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q1(u1 u1Var) {
        int i10 = this.f46015a;
    }

    @Override
    public boolean R() {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R0(long j3) {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int R1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f46015a;
    }

    @Override
    public void S0(u1 u1Var) {
        int i10 = this.f46015a;
    }

    @Override
    public void S1(MessageObject messageObject) {
        int i10 = this.f46015a;
    }

    @Override
    public void T(u1 u1Var) {
        int i10 = this.f46015a;
    }

    @Override
    public void T1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f46015a) {
            case 17:
            default:
                of.f.s(u1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void U(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void U0(int i10, u1 u1Var) {
        int i11 = this.f46015a;
    }

    @Override
    public CharacterStyle U1(u1 u1Var) {
        switch (this.f46015a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int V() {
        switch (this.f46015a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f46015a;
    }

    @Override
    public long W() {
        return System.currentTimeMillis();
    }

    @Override
    public void W0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f46015a;
    }

    @Override
    public boolean W1(u1 u1Var, MessageObject messageObject) {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public n2.o X(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override
    public void X0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
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
                shortBuffer2.put(na.d.o3(s10, s11));
            }
        }
    }

    @Override
    public void X1() {
        int i10 = this.f46015a;
    }

    @Override
    public hh.a Y() {
        switch (this.f46015a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean Y1() {
        return false;
    }

    @Override
    public int Z() {
        return 1;
    }

    @Override
    public void Z1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f46015a;
    }

    @Override
    public boolean a0(u1 u1Var) {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a1(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f46015a;
    }

    @Override
    public void a2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f46015a;
    }

    @Override
    public Map b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean b0(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean b1(u1 u1Var, boolean z10) {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean b2(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c(wb wbVar, hb hbVar, fb fbVar, ib ibVar) {
        o1.k kVar = new o1.k(wbVar, wb.IN_OUT_OFFSET_Y, wbVar.getHeight());
        kVar.f16691u.a(0.8f);
        kVar.f16691u.b(400.0f);
        kVar.a(new jb(fbVar, 1));
        kVar.b(new ub(ibVar, wbVar, 0));
        kVar.h();
        hbVar.run();
    }

    @Override
    public boolean c0(u1 u1Var, TLRPC.User user) {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c1(u1 u1Var) {
        int i10 = this.f46015a;
    }

    @Override
    public String d() {
        return null;
    }

    @Override
    public void d0(lh lhVar) {
        lhVar.run();
    }

    @Override
    public boolean e() {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e0(int i10) {
        int i11 = this.f46015a;
    }

    @Override
    public void e1(u1 u1Var) {
        int i10 = this.f46015a;
    }

    @Override
    public sv0 e2() {
        switch (this.f46015a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean f() {
        switch (this.f46015a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean f0() {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String g(u1 u1Var) {
        switch (this.f46015a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public boolean g2(long j3) {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object mo27get() {
        return new l5.q(Executors.newSingleThreadExecutor());
    }

    @Override
    public void h0(u1 u1Var, float f7, float f10) {
        int i10 = this.f46015a;
    }

    @Override
    public void h2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f46015a;
    }

    @Override
    public void i(u1 u1Var, bi.f fVar) {
        int i10 = this.f46015a;
    }

    @Override
    public boolean i1(int i10, u1 u1Var) {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean i2(u1 u1Var, TLRPC.TodoItem todoItem) {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f46015a;
    }

    @Override
    public int j0(u1 u1Var) {
        switch (this.f46015a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void k() {
        int i10 = this.f46015a;
    }

    @Override
    public void k0(u1 u1Var) {
        int i10 = this.f46015a;
    }

    @Override
    public void k2(u1 u1Var) {
        int i10 = this.f46015a;
    }

    @Override
    public n2.p l() {
        throw new IllegalStateException();
    }

    @Override
    public z3.m m(b2.s sVar) {
        String str = sVar.f3641r;
        List list = sVar.f3644u;
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
                    return new com.google.firebase.messaging.s(2);
                case 2:
                    return new a4.l();
                case 3:
                    return new pf.b(19);
                case 4:
                    return new g4.a(list);
                case 5:
                    return new d4.a(list);
                case 6:
                    return new com.google.firebase.messaging.s(list);
                case 7:
                    return new e4.a();
                case '\b':
                    return new f4.e();
            }
        }
        throw new IllegalArgumentException(v.i("Unsupported MIME type: ", str));
    }

    @Override
    public void m2(u1 u1Var, long j3) {
        int i10 = this.f46015a;
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f46015a;
    }

    @Override
    public boolean n1(MessageObject messageObject) {
        int i10 = this.f46015a;
        return c1.a(messageObject);
    }

    @Override
    public void o(u1 u1Var) {
        int i10 = this.f46015a;
    }

    @Override
    public boolean o0() {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void p() {
        int i10 = this.f46015a;
    }

    @Override
    public a3.l q(Context context, String str, y6.c cVar) {
        a3.l lVar = new a3.l();
        lVar.f155a = cVar.c(context, str);
        int i10 = 1;
        int a2 = cVar.a(context, str, true);
        lVar.f156b = a2;
        int i11 = lVar.f155a;
        if (i11 == 0) {
            i11 = 0;
            if (a2 == 0) {
                i10 = 0;
                lVar.f157c = i10;
                return lVar;
            }
        }
        if (a2 < i11) {
            i10 = -1;
        }
        lVar.f157c = i10;
        return lVar;
    }

    @Override
    public void q1() {
        int i10 = this.f46015a;
    }

    @Override
    public void r(u1 u1Var) {
        int i10 = this.f46015a;
    }

    @Override
    public void r0(String str) {
        int i10 = this.f46015a;
    }

    @Override
    public boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s() {
        int i10 = this.f46015a;
    }

    @Override
    public boolean s0(b6 b6Var) {
        switch (this.f46015a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f46015a;
    }

    @Override
    public void s2(u1 u1Var) {
        int i10 = this.f46015a;
    }

    @Override
    public void t(u1 u1Var) {
        int i10 = this.f46015a;
    }

    @Override
    public Object then(Task task) {
        return null;
    }

    @Override
    public void u(u1 u1Var) {
        int i10 = this.f46015a;
    }

    @Override
    public void u0(u1 u1Var, float f7, float f10) {
        int i10 = this.f46015a;
    }

    @Override
    public h2.b v(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void v1(u1 u1Var, TLRPC.Document document) {
        int i10 = this.f46015a;
    }

    @Override
    public String w(long j3) {
        switch (this.f46015a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void w0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 >= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(hg.c.i(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i12;
            int ceil = (int) Math.ceil((i11 / i10) * remaining);
            int i13 = remaining - ceil;
            float f7 = ceil;
            float f10 = f7 / f7;
            float f11 = i13;
            float f12 = f11 / f11;
            while (ceil > 0 && i13 > 0) {
                if (f10 >= f12) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    ceil--;
                    f10 = ceil / f7;
                } else {
                    shortBuffer.position(shortBuffer.position() + i12);
                    i13--;
                    f12 = i13 / f11;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
    }

    @Override
    public Object w2() {
        switch (this.f46015a) {
            case 8:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override
    public byte[] x() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override
    public Object x0(u5 u5Var) {
        switch (this.f46015a) {
            case 14:
                return new h();
            default:
                g gVar = (g) u5Var.a(g.class);
                synchronized (androidx.activity.result.c.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 == 3) {
                        androidx.activity.result.c.b(new Object());
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        if ((b10 & 1) == 0) {
                            sb2.append(" enableFirelog");
                        }
                        if ((b10 & 2) == 0) {
                            sb2.append(" firelogEventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                    }
                }
                return new ob.a(0);
        }
    }

    @Override
    public void x2() {
        int i10 = this.f46015a;
    }

    @Override
    public int y(b2.s sVar) {
        String str = sVar.f3641r;
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
        throw new IllegalArgumentException(v.i("Unsupported MIME type: ", str));
    }

    @Override
    public void z0(u1 u1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f46015a;
    }

    @Override
    public void z2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f46015a;
    }

    private final void G3() {
    }

    private final void H3() {
    }

    private final void J0() {
    }

    private final void L0() {
    }

    private final void L3() {
    }

    private final void M3() {
    }

    private final void P3() {
    }

    private final void Q3() {
    }

    private final void T3() {
    }

    private final void U3() {
    }

    private final void Y2() {
    }

    private final void Z2() {
    }

    private final void p0() {
    }

    private final void q0() {
    }

    private final void t2() {
    }

    private final void u2() {
    }

    @Override
    public void A0() {
    }

    @Override
    public void P0() {
    }

    @Override
    public void a() {
    }

    @Override
    public void release() {
    }

    private final void A1(u1 u1Var) {
    }

    private final void A3(u1 u1Var) {
    }

    private final void C1(u1 u1Var) {
    }

    private final void C3(u1 u1Var) {
    }

    private final void E3(u1 u1Var) {
    }

    private final void F3(u1 u1Var) {
    }

    private final void H0(u1 u1Var) {
    }

    private final void K2(u1 u1Var) {
    }

    private final void L2(u1 u1Var) {
    }

    private final void M0(u1 u1Var) {
    }

    private final void N3(int i10) {
    }

    private final void O0(u1 u1Var) {
    }

    private final void O2(u1 u1Var) {
    }

    private final void O3(int i10) {
    }

    private final void P2(u1 u1Var) {
    }

    private final void Q2(u1 u1Var) {
    }

    private final void R2(u1 u1Var) {
    }

    private final void R3(MessageObject messageObject) {
    }

    private final void S2(u1 u1Var) {
    }

    private final void S3(MessageObject messageObject) {
    }

    private final void T2(u1 u1Var) {
    }

    private final void V0(u1 u1Var) {
    }

    private final void W2(u1 u1Var) {
    }

    private final void X2(u1 u1Var) {
    }

    private final void Y0(u1 u1Var) {
    }

    private final void d2(u1 u1Var) {
    }

    private final void f2(u1 u1Var) {
    }

    private final void g3(String str) {
    }

    private final void h3(String str) {
    }

    private final void j1(u1 u1Var) {
    }

    private final void j2(u1 u1Var) {
    }

    private final void k1(u1 u1Var) {
    }

    private final void l1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void l2(u1 u1Var) {
    }

    private final void m1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void m3(u1 u1Var) {
    }

    private final void n3(u1 u1Var) {
    }

    private final void o1(u1 u1Var) {
    }

    private final void q3(u1 u1Var) {
    }

    private final void r1(u1 u1Var) {
    }

    private final void r3(u1 u1Var) {
    }

    private final void s3(MessageObject messageObject) {
    }

    private final void t0(u1 u1Var) {
    }

    private final void t3(MessageObject messageObject) {
    }

    private final void u3(u1 u1Var) {
    }

    private final void v0(u1 u1Var) {
    }

    private final void v3(u1 u1Var) {
    }

    private final void w1(u1 u1Var) {
    }

    private final void x1(u1 u1Var) {
    }

    private final void y0(u1 u1Var) {
    }

    private final void y3(u1 u1Var) {
    }

    private final void z3(u1 u1Var) {
    }

    @Override
    public void D(byte[] bArr) {
    }

    @Override
    public void Z0(Object obj) {
    }

    @Override
    public void p1(TLRPC.User user) {
    }

    @Override
    public void z(y0 y0Var) {
    }

    private final void B3(u1 u1Var, boolean z10) {
    }

    private final void D3(u1 u1Var, boolean z10) {
    }

    private final void F1(int i10, u1 u1Var) {
    }

    private final void G1(int i10, u1 u1Var) {
    }

    private final void L1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void M2(u1 u1Var, TLRPC.Document document) {
    }

    private final void N2(u1 u1Var, TLRPC.Document document) {
    }

    private final void P1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void Q0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void T0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void i3(u1 u1Var, long j3) {
    }

    private final void j3(u1 u1Var, long j3) {
    }

    private final void m0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void n0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void p2(int i10, u1 u1Var) {
    }

    private final void q2(int i10, u1 u1Var) {
    }

    private final void t1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void u1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void w3(u1 u1Var, bi.f fVar) {
    }

    private final void x3(u1 u1Var, bi.f fVar) {
    }

    private final void y1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void z1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void h(byte[] bArr, j2.k kVar) {
    }

    private final void D1(u1 u1Var, int i10, int i11) {
    }

    private final void E1(u1 u1Var, int i10, int i11) {
    }

    private final void U2(u1 u1Var, float f7, float f10) {
    }

    private final void V2(u1 u1Var, float f7, float f10) {
    }

    private final void a3(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void b3(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void g1(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void h1(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void i0(u1 u1Var, float f7, float f10) {
    }

    private final void l0(u1 u1Var, float f7, float f10) {
    }

    private final void o3(u1 u1Var, float f7, float f10) {
    }

    private final void p3(u1 u1Var, float f7, float f10) {
    }

    private final void v2(u1 u1Var, float f7, float f10) {
    }

    private final void y2(u1 u1Var, float f7, float f10) {
    }

    private final void A2(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void B2(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void c3(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void d3(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void e3(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void f3(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void n2(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void o2(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    private final void D2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void H2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void I2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void J2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void k3(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void l3(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void d1(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void f1(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void J3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void K3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override
    public void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
