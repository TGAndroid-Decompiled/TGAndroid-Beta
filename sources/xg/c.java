package xg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bi.kc;
import di.d4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.r1;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xq;
import ti.p;
import v4.d1;
import wg.u;
import yg.d0;
import yg.l;
import yg.r;
import yg.v;
import yg.w;
import yg.x;
import yg.y;
public final class c extends rg.b {
    public final f6 d;
    public pj0 f58625f;
    public u h;
    public u f58626n;
    public r f58627r;
    public u f58628s;
    public TLRPC.Chat f58629w;
    public ArrayList f58624e = new ArrayList();
    public final HashMap f58630x = new HashMap();

    public c(f6 f6Var) {
        this.d = f6Var;
        a aVar = new a(this, 0);
        yr a02 = yr.a0(p10.f24467s0);
        a02.f26696a.c(new p(22, a02, aVar));
    }

    @Override
    public final boolean D(d1 d1Var) {
        int i7 = d1Var.f56955f;
        if (i7 != 2 && i7 != 11 && i7 != 8 && i7 != 10 && i7 != 15 && i7 != 12 && i7 != 17 && i7 != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull N0 = qp.s1(p10.f24467s0).N0(chat.f26953id);
        if (N0 != null && (i7 = N0.participants_count) > 0) {
            return i7;
        }
        HashMap hashMap = this.f58630x;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f26953id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i7 = 0; i7 < this.f58624e.size(); i7++) {
            if (((b) this.f58624e.get(i7)).f54439a == 7) {
                g(i7);
            }
        }
    }

    @Override
    public final int b() {
        return this.f58624e.size();
    }

    @Override
    public final int d(int i7) {
        return ((b) this.f58624e.get(i7)).f54439a;
    }

    @Override
    public final void t(d1 d1Var, int i7) {
        boolean z9;
        int i10;
        int i11;
        long j3;
        boolean z10;
        int i12 = d1Var.f56955f;
        View view = d1Var.f56951a;
        b bVar = (b) this.f58624e.get(i7);
        if (i12 != 0) {
            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = null;
            if (i12 != 2) {
                if (i12 != 5) {
                    if (i12 != 6) {
                        if (i12 != 7) {
                            String str = "";
                            switch (i12) {
                                case 9:
                                    yg.g gVar = (yg.g) view;
                                    TLRPC.InputPeer inputPeer = bVar.d;
                                    if (inputPeer != null) {
                                        if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                            TLRPC.Chat M0 = qp.s1(p10.f24467s0).M0(Long.valueOf(inputPeer.chat_id));
                                            gVar.f(M0, bVar.f58619i, bVar.f58618g, F(M0));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat M02 = qp.s1(p10.f24467s0).M0(Long.valueOf(inputPeer.channel_id));
                                            gVar.f(M02, bVar.f58619i, bVar.f58618g, F(M02));
                                        }
                                    } else {
                                        TLRPC.Chat chat = bVar.f58616e;
                                        gVar.f(chat, bVar.f58619i, bVar.f58618g, F(chat));
                                    }
                                    gVar.setChatDeleteListener(this.f58626n);
                                    return;
                                case 10:
                                    ((yg.h) view).setDate(bVar.h);
                                    return;
                                case 11:
                                    yg.u uVar = (yg.u) view;
                                    int i13 = bVar.f58622l;
                                    boolean z11 = bVar.f54440b;
                                    boolean z12 = bVar.f58618g;
                                    List list = (List) bVar.f58617f;
                                    TLRPC.Chat chat2 = this.f58629w;
                                    d4 d4Var = uVar.d;
                                    uVar.f59398s = i13;
                                    boolean V = t3.V(chat2);
                                    if (i13 == 0) {
                                        if (V) {
                                            i11 = 2131753598;
                                        } else {
                                            i11 = 2131753599;
                                        }
                                        d4Var.k(hd.a0(null, null, i11, new Object[0]));
                                    } else if (i13 == 1) {
                                        if (V) {
                                            i10 = 2131753336;
                                        } else {
                                            i10 = 2131753337;
                                        }
                                        d4Var.k(hd.a0(null, null, i10, new Object[0]));
                                    }
                                    uVar.f59343f.a(z11, false);
                                    uVar.setDivider(z12);
                                    r6.Y(uVar.f59342e, k6.f28030n5, uVar.f59339a);
                                    if (list.size() == 0) {
                                        uVar.setSubtitle(uVar.e(hd.M0(2131753522, null)));
                                        return;
                                    } else if (list.size() <= 3) {
                                        if (list.size() == 1) {
                                            uVar.setSubtitle(uVar.e(hd.a0("BoostingFromAllCountries1", null, 2131753521, ((TLRPC.TL_help_country) list.get(0)).default_name)));
                                            return;
                                        } else if (list.size() == 2) {
                                            uVar.setSubtitle(uVar.e(hd.a0("BoostingFromAllCountries2", null, 2131753520, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name)));
                                            return;
                                        } else {
                                            uVar.setSubtitle(uVar.e(hd.a0("BoostingFromAllCountries3", null, 2131753519, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name, ((TLRPC.TL_help_country) list.get(2)).default_name)));
                                            return;
                                        }
                                    } else {
                                        uVar.setSubtitle(uVar.e(hd.G(list.size(), "BoostingFromCountriesCount", new Object[0])));
                                        return;
                                    }
                                case 12:
                                    yg.i iVar = (yg.i) view;
                                    TLObject tLObject = bVar.f58623m;
                                    int i14 = bVar.f58619i;
                                    int i15 = bVar.f58620j;
                                    long j10 = bVar.h;
                                    CharSequence charSequence = bVar.f58615c;
                                    boolean z13 = bVar.f58618g;
                                    boolean z14 = bVar.f54440b;
                                    d4 d4Var2 = iVar.d;
                                    iVar.f59368w = tLObject;
                                    if (i14 >= 12) {
                                        d4Var2.k(hd.G(1, "Years", new Object[0]));
                                    } else {
                                        d4Var2.k(hd.G(i14, "Months", new Object[0]));
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    r1 i16 = r1.i();
                                    if (i15 > 0) {
                                        j3 = j10 / i15;
                                    } else {
                                        j3 = j10;
                                    }
                                    sb2.append(i16.f(j3, charSequence.toString()));
                                    sb2.append(" x ");
                                    sb2.append(i15);
                                    iVar.setSubtitle(sb2.toString());
                                    k5 k5Var = iVar.f59367s;
                                    r1 i17 = r1.i();
                                    if (i15 <= 0) {
                                        j10 = 0;
                                    }
                                    k5Var.l(i17.f(j10, charSequence.toString()), false);
                                    iVar.setDivider(z13);
                                    iVar.f59343f.a(z14, false);
                                    return;
                                case 13:
                                    x xVar = (x) view;
                                    xVar.setText(bVar.f58615c);
                                    int i18 = bVar.f58619i;
                                    j6 j6Var = xVar.f59410r;
                                    if (i18 > 0) {
                                        str = hd.G(i18, "BoostingBoostsCountTitle", Integer.valueOf(i18));
                                    }
                                    j6Var.a();
                                    j6Var.c(str, true, true);
                                    return;
                                case 14:
                                    ((yg.e) view).setGiveaway((TL_stories.PrepaidGiveaway) bVar.f58617f);
                                    return;
                                case 15:
                                    y yVar = (y) view;
                                    CharSequence charSequence2 = bVar.f58615c;
                                    boolean z15 = bVar.f54440b;
                                    boolean z16 = bVar.f58618g;
                                    yVar.K = bVar.f58622l;
                                    yVar.f(charSequence2, z15, z16);
                                    return;
                                case 16:
                                    l lVar = (l) view;
                                    lVar.setCount(bVar.f58619i);
                                    lVar.setAfterTextChangedListener(this.f58628s);
                                    return;
                                case 17:
                                    w wVar = (w) view;
                                    TLObject tLObject2 = bVar.f58623m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i19 = bVar.f58619i;
                                    long j11 = bVar.h;
                                    boolean z17 = bVar.f54440b;
                                    TextView textView = wVar.f59405f;
                                    j6 j6Var2 = wVar.d;
                                    j6 j6Var3 = wVar.f59404e;
                                    if (wVar.f59407r == tL_starsGiveawayOption) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    wVar.f59401a.a(z17, z10);
                                    wVar.f59407r = tL_starsGiveawayOption;
                                    if (z10) {
                                        j6Var3.a();
                                    }
                                    if (tL_starsGiveawayOption == null) {
                                        j6Var2.c(wVar.h, false, true);
                                        j6Var3.c(wVar.f59406n, z10, true);
                                        textView.setText("");
                                    } else {
                                        j6Var2.c(hd.H(' ', "GiveawayStars", (int) tL_starsGiveawayOption.stars), false, true);
                                        j6Var3.c(hd.H(',', "BoostingStarOptionPerUser", (int) j11), z10, true);
                                        textView.setText(r1.i().f(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i20 = i19 + 1;
                                    wVar.f59408s = i20;
                                    if (!z10) {
                                        wVar.f59409w.e(true, i20);
                                    }
                                    wVar.invalidate();
                                    return;
                                default:
                                    return;
                            }
                        }
                        d0 d0Var = (d0) view;
                        d0Var.setText(bVar.f58615c);
                        d0Var.setBackground(bVar.f58618g);
                        return;
                    }
                    ((n4) view).setText(bVar.f58615c);
                    return;
                }
                v vVar = (v) view;
                List list2 = bVar.f58621k;
                int i21 = bVar.f58619i;
                vVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i22 = 0; i22 < list2.size(); i22++) {
                    strArr[i22] = String.valueOf((Integer) list2.get(i22));
                }
                vVar.f59399a.b(i21, null, strArr);
                vVar.setCallBack(this.h);
                return;
            }
            yg.d dVar = (yg.d) view;
            int i23 = bVar.f58622l;
            int i24 = bVar.f58619i;
            TLRPC.User user = (TLRPC.User) bVar.f58617f;
            boolean z18 = bVar.f54440b;
            l9 l9Var = dVar.f59341c;
            f6 f6Var = dVar.f59339a;
            d4 d4Var3 = dVar.d;
            k5 k5Var2 = dVar.f59342e;
            w8 w8Var = dVar.f59340b;
            if (dVar.f59358s == i23) {
                z9 = true;
            } else {
                z9 = false;
            }
            dVar.f59358s = i23;
            if (i23 == 0) {
                d4Var3.k(hd.M0(2131753541, null));
                dVar.setSubtitle(hd.M0(2131753167, null));
                r6.Y(k5Var2, k6.f28107r5, f6Var);
                w8Var.g(16);
                w8Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                r6.a0(dVar, dVar.getContext(), 2131231230, k6.f27813b7);
            } else if (i23 == 1) {
                d4Var3.k(hd.M0(2131753593, null));
                if (i24 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(i6.m(t10.p(user), k5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i24 > 0) {
                    dVar.setSubtitle(dVar.e(hd.G(i24, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(hd.M0(2131753285, null)));
                }
                r6.Y(k5Var2, k6.f28030n5, f6Var);
                w8Var.g(6);
                w8Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                r6.a0(dVar, dVar.getContext(), 2131231231, k6.f27813b7);
            } else if (i23 == 2) {
                d4Var3.k(hd.M0(2131753332, null));
                if (i24 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(i6.m(t10.p(user), k5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i24 > 0) {
                    dVar.setSubtitle(dVar.e(hd.G(i24, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(hd.M0(2131753167, null)));
                }
                r6.Y(k5Var2, k6.f28030n5, f6Var);
                w8Var.g(25);
                w8Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                r6.a0(dVar, dVar.getContext(), 2131231230, k6.f27813b7);
            } else if (i23 == 3) {
                d4Var3.k(m8.b(hd.M0(2131753257, null)));
                dVar.setSubtitle(hd.M0(2131753167, null));
                r6.Y(k5Var2, k6.f28107r5, f6Var);
                w8Var.g(26);
                w8Var.i(-146917, -625593);
                dVar.setDivider(false);
                r6.a0(dVar, dVar.getContext(), 2131231231, k6.f27813b7);
            }
            dVar.f59343f.a(z18, z9);
            l9Var.setImageDrawable(w8Var);
            l9Var.setRoundRadius(g0.L(20.0f));
            return;
        }
        r rVar = (r) view;
        this.f58627r = rVar;
        rVar.setBoostViaGifsText(this.f58629w);
        this.f58627r.setStars(bVar.f58618g);
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i7) {
        kc kcVar;
        boolean z9;
        Context context = viewGroup.getContext();
        f6 f6Var = this.d;
        switch (i7) {
            case 2:
                kcVar = new yg.d(context, f6Var);
                break;
            case 3:
                kcVar = new View(context);
                break;
            case 4:
                int i10 = k6.f27793a7;
                View y6Var = new y6(context, k6.w0(i10, f6Var), 0);
                r6.i(i10, y6Var, f6Var);
                kcVar = y6Var;
                break;
            case 5:
                kcVar = new v(context, f6Var);
                break;
            case 6:
                View n4Var = new n4(context, k6.L6, 21, 15, 3, false, false, this.d);
                r6.i(k6.f27922h5, n4Var, f6Var);
                kcVar = n4Var;
                break;
            case 7:
                kcVar = new d0(context, f6Var);
                break;
            case 8:
                kcVar = new yg.b(context, f6Var);
                break;
            case 9:
                kcVar = new yg.g(context, f6Var);
                break;
            case 10:
                kcVar = new yg.h(context, f6Var);
                break;
            case 11:
                yg.c cVar = new yg.c(context, f6Var);
                cVar.f59341c.setVisibility(8);
                kcVar = cVar;
                break;
            case 12:
                kcVar = new yg.i(context, f6Var);
                break;
            case 13:
                View xVar = new x(context, f6Var);
                r6.i(k6.f27922h5, xVar, f6Var);
                kcVar = xVar;
                break;
            case 14:
                kcVar = new yg.d(context, f6Var);
                break;
            case 15:
                r8 r8Var = new r8(context, f6Var);
                r8Var.setHeight(50);
                kcVar = r8Var;
                break;
            case 16:
                kcVar = new l(context, f6Var);
                break;
            case 17:
                kcVar = new w(context, f6Var);
                break;
            case 18:
                kc kcVar2 = new kc(context);
                String M0 = hd.M0(2131747835, null);
                if (kcVar2.f4234c == -1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                kcVar2.f4234c = -1;
                j6 j6Var = kcVar2.f4232a;
                j6Var.c(M0, z9, true);
                int i11 = k6.f28049o6;
                k6.v0(i11);
                r6.Z(j6Var, i11, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = kcVar2.f4233b;
                r6.t(imageView, i11, null, mode);
                if (z9) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(xq.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                kcVar2.d = false;
                kcVar2.setWillNotDraw(true);
                kcVar = kcVar2;
                break;
            default:
                kcVar = new r(context, f6Var);
                break;
        }
        return jg.g.r(kcVar, kcVar, -1, -2);
    }
}
