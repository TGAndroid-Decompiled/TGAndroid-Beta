package th;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import java.net.URLDecoder;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.oz;
import org.telegram.messenger.pp;
import org.telegram.messenger.qz;
import org.telegram.messenger.rz;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.un;
public final class k2 extends j6 {
    public final o7 f49140x0;
    public final org.telegram.ui.ActionBar.p6 f49141y0;
    public final z2 f49142z0;

    public k2(z2 z2Var, Context context, b bVar, o7 o7Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, bVar);
        this.f49142z0 = z2Var;
        this.f49140x0 = o7Var;
        this.f49141y0 = p6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.o5 o5Var) {
        if (o5Var != null) {
            z2 z2Var = this.f49142z0;
            if (z2Var.f49783z1 != null) {
                TLRPC.Document document = o5Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.f5.e(z2Var.f49730l2, o5Var.documentId);
                }
                if (document != null) {
                    g2 g2Var = z2Var.L0;
                    org.telegram.ui.ActionBar.p6 p6Var = this.f49141y0;
                    wb h = new cc(g2Var, p6Var).h(document, 2, new kg.d0(this, this.f49140x0, p6Var, 9));
                    if (h != null) {
                        h.f32129a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        o7 o7Var = this.f49140x0;
        org.telegram.ui.ActionBar.k2 k2Var = o7Var.f49303f;
        boolean z10 = characterStyle instanceof h51;
        z2 z2Var = this.f49142z0;
        if (z10) {
            TLRPC.User Z1 = vp.r1(z2Var.f49730l2).Z1(Utilities.A(((h51) characterStyle).getURL()));
            if (Z1 != null) {
                vp.r1(z2Var.f49730l2).w3(Z1, null, k2Var, 0);
            }
        } else if (characterStyle instanceof e51) {
            String url = ((e51) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    o7Var.V(new j30(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                o7Var.V(new n90(bundle, null));
                return;
            }
            String b10 = gf.f.b(url);
            if (b10 != null) {
                String lowerCase = b10.toLowerCase();
                if (url.startsWith("@")) {
                    vp.r1(z2Var.f49730l2).v3(lowerCase, k2Var, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof g51);
        } else if (characterStyle instanceof d51) {
            d51 d51Var = (d51) characterStyle;
            org.telegram.messenger.i0.g(d51Var.f25340a.subSequence(d51Var.f25341b, d51Var.f25342c).toString());
            z20.r(null, 2131744219, new cc(z2Var.L0, this.f49141y0));
        } else if (characterStyle instanceof ClickableSpan) {
            ((ClickableSpan) characterStyle).onClick(view);
        }
    }

    @Override
    public final void H(final URLSpan uRLSpan, final View view, sg.v vVar) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = gf.f.u(parse, null, null, gf.f.a(parse.getHost()), null);
            } catch (Exception e) {
                f8.g(e, false);
            }
            str = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e7) {
            f8.g(e7, true);
            str = url2;
        }
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.p6 p6Var = this.f49141y0;
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
        k10.O = str;
        k10.P = false;
        k10.Q = true;
        z2 z2Var = this.f49142z0;
        y2 y2Var = z2Var.f49776x1;
        CharSequence[] charSequenceArr = (y2Var == null || y2Var.d()) ? new CharSequence[]{cd.L0(2131747833, null), cd.L0(2131751767, null)} : new CharSequence[]{cd.L0(2131747833, null)};
        final org.telegram.ui.ActionBar.p6 p6Var2 = this.f49141y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                k2 k2Var = k2.this;
                if (i10 == 0) {
                    k2Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    org.telegram.messenger.i0.g(url);
                    new cc(k2Var.f49142z0.L0, p6Var2).k(false).j();
                }
            }
        };
        k10.L = charSequenceArr;
        k10.K = onClickListener;
        k10.H0 = new ag.x(vVar, 14);
        k10.P(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, p6Var));
        ((f7) z2Var.f49783z1).h(k10);
    }

    @Override
    public final void I(e6 e6Var) {
        if (e6Var == null) {
            return;
        }
        final TLRPC.Document document = e6Var.f48931g;
        z2 z2Var = this.f49142z0;
        o7 o7Var = this.f49140x0;
        final org.telegram.ui.ActionBar.p6 p6Var = this.f49141y0;
        if (document != null) {
            z60 F = z60.F(o7Var.f49339w, p6Var, z2Var.f49759t0);
            F.f32923i = 3;
            F.a0(-org.telegram.messenger.i0.L(8.0f), 0.0f);
            F.l(2131232350, cd.L0(2131744740, null), new Runnable(this) {
                public final k2 f49014b;

                {
                    this.f49014b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    int i10 = r4;
                    org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                    TLRPC.Document document2 = document;
                    k2 k2Var = this.f49014b;
                    switch (i10) {
                        case 0:
                            z2 z2Var2 = k2Var.f49142z0;
                            qz C = qz.C(z2Var2.f49730l2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e = d20.i(z2Var2.f49730l2).e();
                            y2 y2Var = z2Var2.f49776x1;
                            if (y2Var != null) {
                                storyItem = y2Var.f49661a;
                            } else {
                                storyItem = null;
                            }
                            C.r0(oz.f(tL_document, null, null, e, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new cc(z2Var2.L0, p6Var2).Q(2131624188, 36, org.telegram.messenger.i0.R2(cd.L0(2131744739, null), -1, 2, new rz(10), null)).k(true);
                            return;
                        default:
                            z2 z2Var3 = k2Var.f49142z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f19821id = tL_inputDocument;
                            tL_inputDocument.f19805id = document2.f19799id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().Q0 != null && MediaController.B().Q0.f17468b == d20.i(z2Var3.f49730l2).e()) {
                                pp ppVar = MediaController.B().Q0;
                                ppVar.f17469c.add(0, ppVar.d(document2));
                                ppVar.e();
                            }
                            ConnectionsManager.getInstance(z2Var3.f49730l2).sendRequest(tL_account_saveMusic, null);
                            new cc(z2Var3.L0, p6Var2).Q(2131624056, 36, cd.L0(2131744741, null)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(2131232400, cd.L0(2131744742, null), new Runnable(this) {
                public final k2 f49014b;

                {
                    this.f49014b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    int i10 = r4;
                    org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                    TLRPC.Document document2 = document;
                    k2 k2Var = this.f49014b;
                    switch (i10) {
                        case 0:
                            z2 z2Var2 = k2Var.f49142z0;
                            qz C = qz.C(z2Var2.f49730l2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e = d20.i(z2Var2.f49730l2).e();
                            y2 y2Var = z2Var2.f49776x1;
                            if (y2Var != null) {
                                storyItem = y2Var.f49661a;
                            } else {
                                storyItem = null;
                            }
                            C.r0(oz.f(tL_document, null, null, e, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new cc(z2Var2.L0, p6Var2).Q(2131624188, 36, org.telegram.messenger.i0.R2(cd.L0(2131744739, null), -1, 2, new rz(10), null)).k(true);
                            return;
                        default:
                            z2 z2Var3 = k2Var.f49142z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f19821id = tL_inputDocument;
                            tL_inputDocument.f19805id = document2.f19799id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().Q0 != null && MediaController.B().Q0.f17468b == d20.i(z2Var3.f49730l2).e()) {
                                pp ppVar = MediaController.B().Q0;
                                ppVar.f17469c.add(0, ppVar.d(document2));
                                ppVar.e();
                            }
                            ConnectionsManager.getInstance(z2Var3.f49730l2).sendRequest(tL_account_saveMusic, null);
                            new cc(z2Var3.L0, p6Var2).Q(2131624056, 36, cd.L0(2131744741, null)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (e6Var.e && e6Var.f48928b != null && e6Var.d != null) {
            Bundle bundle = new Bundle();
            if (e6Var.f48928b.longValue() >= 0) {
                bundle.putLong("user_id", e6Var.f48928b.longValue());
            } else {
                bundle.putLong("chat_id", -e6Var.f48928b.longValue());
            }
            bundle.putInt("message_id", e6Var.d.intValue());
            o7Var.V(new un(bundle));
        } else if (e6Var.f48928b != null && e6Var.f48929c != null) {
            vp.r1(z2Var.f49730l2).O1().g0(e6Var.f48929c.intValue(), e6Var.f48928b.longValue(), new ag.m2(this, e6Var, o7Var, p6Var, 18));
        } else {
            wb Q = new cc(z2Var.L0, p6Var).Q(2131624011, 36, cd.L0(2131744683, null));
            Q.f32129a = 3;
            Q.k(true);
        }
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        boolean z11;
        yz0 yz0Var;
        if (!z10 && !org.telegram.messenger.i0.I3(str)) {
            if (i10 == 0) {
                gf.f.p(getContext(), Uri.parse(str), true, true, null);
                return;
            } else if (i10 == 1) {
                gf.f.p(getContext(), Uri.parse(str), false, false, null);
                return;
            } else if (i10 == 2) {
                gf.f.p(getContext(), Uri.parse(str), false, true, null);
                return;
            } else {
                return;
            }
        }
        o7 o7Var = this.f49140x0;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                org.telegram.ui.Components.s4.q0(o7Var.f49303f, str, true, true, false, false, null, null, this.f49141y0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof g51) && (yz0Var = ((g51) characterStyle).f26260a) != null && (yz0Var.f32850a & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.s4.q0(o7Var.f49303f, str, true, true, true, z11, null, null, this.f49141y0);
    }
}
