package xg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bi.kc;
import di.e4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.g0;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xq;
import v4.d1;
import wg.t;
import yg.d0;
import yg.l;
import yg.r;
import yg.u;
import yg.v;
import yg.w;
import yg.x;
import yg.y;
public final class c extends rg.b {
    public final g6 d;
    public qj0 f58724f;
    public t h;
    public t f58725n;
    public r f58726r;
    public t f58727s;
    public TLRPC.Chat f58728w;
    public ArrayList f58723e = new ArrayList();
    public final HashMap f58729x = new HashMap();

    public c(g6 g6Var) {
        this.d = g6Var;
        a aVar = new a(this, 0);
        yr a02 = yr.a0(p10.f24470s0);
        a02.f26719a.c(new u9.f(18, a02, aVar));
    }

    @Override
    public final boolean D(d1 d1Var) {
        int i7 = d1Var.f57060f;
        if (i7 != 2 && i7 != 11 && i7 != 8 && i7 != 10 && i7 != 15 && i7 != 12 && i7 != 17 && i7 != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull N0 = qp.s1(p10.f24470s0).N0(chat.f26956id);
        if (N0 != null && (i7 = N0.participants_count) > 0) {
            return i7;
        }
        HashMap hashMap = this.f58729x;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f26956id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i7 = 0; i7 < this.f58723e.size(); i7++) {
            if (((b) this.f58723e.get(i7)).f54544a == 7) {
                g(i7);
            }
        }
    }

    @Override
    public final int b() {
        return this.f58723e.size();
    }

    @Override
    public final int d(int i7) {
        return ((b) this.f58723e.get(i7)).f54544a;
    }

    @Override
    public final void t(d1 d1Var, int i7) {
        boolean z9;
        int i10;
        int i11;
        long j3;
        boolean z10;
        int i12 = d1Var.f57060f;
        View view = d1Var.f57056a;
        b bVar = (b) this.f58723e.get(i7);
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
                                            TLRPC.Chat M0 = qp.s1(p10.f24470s0).M0(Long.valueOf(inputPeer.chat_id));
                                            gVar.f(M0, bVar.f58718i, bVar.f58717g, F(M0));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat M02 = qp.s1(p10.f24470s0).M0(Long.valueOf(inputPeer.channel_id));
                                            gVar.f(M02, bVar.f58718i, bVar.f58717g, F(M02));
                                        }
                                    } else {
                                        TLRPC.Chat chat = bVar.f58715e;
                                        gVar.f(chat, bVar.f58718i, bVar.f58717g, F(chat));
                                    }
                                    gVar.setChatDeleteListener(this.f58725n);
                                    return;
                                case 10:
                                    ((yg.h) view).setDate(bVar.h);
                                    return;
                                case 11:
                                    u uVar = (u) view;
                                    int i13 = bVar.f58721l;
                                    boolean z11 = bVar.f54545b;
                                    boolean z12 = bVar.f58717g;
                                    List list = (List) bVar.f58716f;
                                    TLRPC.Chat chat2 = this.f58728w;
                                    e4 e4Var = uVar.d;
                                    uVar.f59500s = i13;
                                    boolean V = t3.V(chat2);
                                    if (i13 == 0) {
                                        if (V) {
                                            i11 = 2131753598;
                                        } else {
                                            i11 = 2131753599;
                                        }
                                        e4Var.k(id.a0(null, null, i11, new Object[0]));
                                    } else if (i13 == 1) {
                                        if (V) {
                                            i10 = 2131753336;
                                        } else {
                                            i10 = 2131753337;
                                        }
                                        e4Var.k(id.a0(null, null, i10, new Object[0]));
                                    }
                                    uVar.f59445f.a(z11, false);
                                    uVar.setDivider(z12);
                                    s6.X(uVar.f59444e, l6.f28046n5, uVar.f59441a);
                                    if (list.size() == 0) {
                                        uVar.setSubtitle(uVar.e(id.M0(2131753522, null)));
                                        return;
                                    } else if (list.size() <= 3) {
                                        if (list.size() == 1) {
                                            uVar.setSubtitle(uVar.e(id.a0("BoostingFromAllCountries1", null, 2131753521, ((TLRPC.TL_help_country) list.get(0)).default_name)));
                                            return;
                                        } else if (list.size() == 2) {
                                            uVar.setSubtitle(uVar.e(id.a0("BoostingFromAllCountries2", null, 2131753520, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name)));
                                            return;
                                        } else {
                                            uVar.setSubtitle(uVar.e(id.a0("BoostingFromAllCountries3", null, 2131753519, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name, ((TLRPC.TL_help_country) list.get(2)).default_name)));
                                            return;
                                        }
                                    } else {
                                        uVar.setSubtitle(uVar.e(id.G(list.size(), "BoostingFromCountriesCount", new Object[0])));
                                        return;
                                    }
                                case 12:
                                    yg.i iVar = (yg.i) view;
                                    TLObject tLObject = bVar.f58722m;
                                    int i14 = bVar.f58718i;
                                    int i15 = bVar.f58719j;
                                    long j10 = bVar.h;
                                    CharSequence charSequence = bVar.f58714c;
                                    boolean z13 = bVar.f58717g;
                                    boolean z14 = bVar.f54545b;
                                    e4 e4Var2 = iVar.d;
                                    iVar.f59470w = tLObject;
                                    if (i14 >= 12) {
                                        e4Var2.k(id.G(1, "Years", new Object[0]));
                                    } else {
                                        e4Var2.k(id.G(i14, "Months", new Object[0]));
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
                                    l5 l5Var = iVar.f59469s;
                                    r1 i17 = r1.i();
                                    if (i15 <= 0) {
                                        j10 = 0;
                                    }
                                    l5Var.l(i17.f(j10, charSequence.toString()), false);
                                    iVar.setDivider(z13);
                                    iVar.f59445f.a(z14, false);
                                    return;
                                case 13:
                                    x xVar = (x) view;
                                    xVar.setText(bVar.f58714c);
                                    int i18 = bVar.f58718i;
                                    j6 j6Var = xVar.f59512r;
                                    if (i18 > 0) {
                                        str = id.G(i18, "BoostingBoostsCountTitle", Integer.valueOf(i18));
                                    }
                                    j6Var.a();
                                    j6Var.c(str, true, true);
                                    return;
                                case 14:
                                    ((yg.e) view).setGiveaway((TL_stories.PrepaidGiveaway) bVar.f58716f);
                                    return;
                                case 15:
                                    y yVar = (y) view;
                                    CharSequence charSequence2 = bVar.f58714c;
                                    boolean z15 = bVar.f54545b;
                                    boolean z16 = bVar.f58717g;
                                    yVar.K = bVar.f58721l;
                                    yVar.f(charSequence2, z15, z16);
                                    return;
                                case 16:
                                    l lVar = (l) view;
                                    lVar.setCount(bVar.f58718i);
                                    lVar.setAfterTextChangedListener(this.f58727s);
                                    return;
                                case 17:
                                    w wVar = (w) view;
                                    TLObject tLObject2 = bVar.f58722m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i19 = bVar.f58718i;
                                    long j11 = bVar.h;
                                    boolean z17 = bVar.f54545b;
                                    TextView textView = wVar.f59507f;
                                    j6 j6Var2 = wVar.d;
                                    j6 j6Var3 = wVar.f59506e;
                                    if (wVar.f59509r == tL_starsGiveawayOption) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    wVar.f59503a.a(z17, z10);
                                    wVar.f59509r = tL_starsGiveawayOption;
                                    if (z10) {
                                        j6Var3.a();
                                    }
                                    if (tL_starsGiveawayOption == null) {
                                        j6Var2.c(wVar.h, false, true);
                                        j6Var3.c(wVar.f59508n, z10, true);
                                        textView.setText("");
                                    } else {
                                        j6Var2.c(id.H(' ', "GiveawayStars", (int) tL_starsGiveawayOption.stars), false, true);
                                        j6Var3.c(id.H(',', "BoostingStarOptionPerUser", (int) j11), z10, true);
                                        textView.setText(r1.i().f(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i20 = i19 + 1;
                                    wVar.f59510s = i20;
                                    if (!z10) {
                                        wVar.f59511w.e(true, i20);
                                    }
                                    wVar.invalidate();
                                    return;
                                default:
                                    return;
                            }
                        }
                        d0 d0Var = (d0) view;
                        d0Var.setText(bVar.f58714c);
                        d0Var.setBackground(bVar.f58717g);
                        return;
                    }
                    ((n4) view).setText(bVar.f58714c);
                    return;
                }
                v vVar = (v) view;
                List list2 = bVar.f58720k;
                int i21 = bVar.f58718i;
                vVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i22 = 0; i22 < list2.size(); i22++) {
                    strArr[i22] = String.valueOf((Integer) list2.get(i22));
                }
                vVar.f59501a.b(i21, null, strArr);
                vVar.setCallBack(this.h);
                return;
            }
            yg.d dVar = (yg.d) view;
            int i23 = bVar.f58721l;
            int i24 = bVar.f58718i;
            TLRPC.User user = (TLRPC.User) bVar.f58716f;
            boolean z18 = bVar.f54545b;
            l9 l9Var = dVar.f59443c;
            g6 g6Var = dVar.f59441a;
            e4 e4Var3 = dVar.d;
            l5 l5Var2 = dVar.f59444e;
            w8 w8Var = dVar.f59442b;
            if (dVar.f59460s == i23) {
                z9 = true;
            } else {
                z9 = false;
            }
            dVar.f59460s = i23;
            if (i23 == 0) {
                e4Var3.k(id.M0(2131753541, null));
                dVar.setSubtitle(id.M0(2131753167, null));
                s6.X(l5Var2, l6.f28123r5, g6Var);
                w8Var.g(16);
                w8Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                s6.Z(dVar, dVar.getContext(), 2131231230, l6.f27829b7);
            } else if (i23 == 1) {
                e4Var3.k(id.M0(2131753593, null));
                if (i24 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(i6.m(t10.p(user), l5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i24 > 0) {
                    dVar.setSubtitle(dVar.e(id.G(i24, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(id.M0(2131753285, null)));
                }
                s6.X(l5Var2, l6.f28046n5, g6Var);
                w8Var.g(6);
                w8Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                s6.Z(dVar, dVar.getContext(), 2131231231, l6.f27829b7);
            } else if (i23 == 2) {
                e4Var3.k(id.M0(2131753332, null));
                if (i24 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(i6.m(t10.p(user), l5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i24 > 0) {
                    dVar.setSubtitle(dVar.e(id.G(i24, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(id.M0(2131753167, null)));
                }
                s6.X(l5Var2, l6.f28046n5, g6Var);
                w8Var.g(25);
                w8Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                s6.Z(dVar, dVar.getContext(), 2131231230, l6.f27829b7);
            } else if (i23 == 3) {
                e4Var3.k(m8.b(id.M0(2131753257, null)));
                dVar.setSubtitle(id.M0(2131753167, null));
                s6.X(l5Var2, l6.f28123r5, g6Var);
                w8Var.g(26);
                w8Var.i(-146917, -625593);
                dVar.setDivider(false);
                s6.Z(dVar, dVar.getContext(), 2131231231, l6.f27829b7);
            }
            dVar.f59445f.a(z18, z9);
            l9Var.setImageDrawable(w8Var);
            l9Var.setRoundRadius(g0.L(20.0f));
            return;
        }
        r rVar = (r) view;
        this.f58726r = rVar;
        rVar.setBoostViaGifsText(this.f58728w);
        this.f58726r.setStars(bVar.f58717g);
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i7) {
        kc kcVar;
        boolean z9;
        Context context = viewGroup.getContext();
        g6 g6Var = this.d;
        switch (i7) {
            case 2:
                kcVar = new yg.d(context, g6Var);
                break;
            case 3:
                kcVar = new View(context);
                break;
            case 4:
                int i10 = l6.f27809a7;
                View y6Var = new y6(context, l6.w0(i10, g6Var), 0);
                s6.h(i10, y6Var, g6Var);
                kcVar = y6Var;
                break;
            case 5:
                kcVar = new v(context, g6Var);
                break;
            case 6:
                View n4Var = new n4(context, l6.L6, 21, 15, 3, false, false, this.d);
                s6.h(l6.f27938h5, n4Var, g6Var);
                kcVar = n4Var;
                break;
            case 7:
                kcVar = new d0(context, g6Var);
                break;
            case 8:
                kcVar = new yg.b(context, g6Var);
                break;
            case 9:
                kcVar = new yg.g(context, g6Var);
                break;
            case 10:
                kcVar = new yg.h(context, g6Var);
                break;
            case 11:
                yg.c cVar = new yg.c(context, g6Var);
                cVar.f59443c.setVisibility(8);
                kcVar = cVar;
                break;
            case 12:
                kcVar = new yg.i(context, g6Var);
                break;
            case 13:
                View xVar = new x(context, g6Var);
                s6.h(l6.f27938h5, xVar, g6Var);
                kcVar = xVar;
                break;
            case 14:
                kcVar = new yg.d(context, g6Var);
                break;
            case 15:
                r8 r8Var = new r8(context, g6Var);
                r8Var.setHeight(50);
                kcVar = r8Var;
                break;
            case 16:
                kcVar = new l(context, g6Var);
                break;
            case 17:
                kcVar = new w(context, g6Var);
                break;
            case 18:
                kc kcVar2 = new kc(context);
                String M0 = id.M0(2131747836, null);
                if (kcVar2.f4234c == -1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                kcVar2.f4234c = -1;
                j6 j6Var = kcVar2.f4232a;
                j6Var.c(M0, z9, true);
                int i11 = l6.f28065o6;
                l6.v0(i11);
                s6.Y(j6Var, i11, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = kcVar2.f4233b;
                s6.s(imageView, i11, null, mode);
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
                kcVar = new r(context, g6Var);
                break;
        }
        return jg.g.r(kcVar, kcVar, -1, -2);
    }
}
