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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.wq;
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
    public final h6 d;
    public pj0 f58722f;
    public t h;
    public t f58723n;
    public r f58724r;
    public t f58725s;
    public TLRPC.Chat f58726w;
    public ArrayList f58721e = new ArrayList();
    public final HashMap f58727x = new HashMap();

    public c(h6 h6Var) {
        this.d = h6Var;
        a aVar = new a(this, 0);
        yr a02 = yr.a0(p10.f24474s0);
        a02.f26723a.c(new u9.f(18, a02, aVar));
    }

    @Override
    public final boolean D(d1 d1Var) {
        int i7 = d1Var.f57056f;
        if (i7 != 2 && i7 != 11 && i7 != 8 && i7 != 10 && i7 != 15 && i7 != 12 && i7 != 17 && i7 != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull N0 = qp.s1(p10.f24474s0).N0(chat.f26960id);
        if (N0 != null && (i7 = N0.participants_count) > 0) {
            return i7;
        }
        HashMap hashMap = this.f58727x;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f26960id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i7 = 0; i7 < this.f58721e.size(); i7++) {
            if (((b) this.f58721e.get(i7)).f54543a == 7) {
                g(i7);
            }
        }
    }

    @Override
    public final int b() {
        return this.f58721e.size();
    }

    @Override
    public final int d(int i7) {
        return ((b) this.f58721e.get(i7)).f54543a;
    }

    @Override
    public final void t(d1 d1Var, int i7) {
        boolean z9;
        int i10;
        int i11;
        long j3;
        boolean z10;
        int i12 = d1Var.f57056f;
        View view = d1Var.f57052a;
        b bVar = (b) this.f58721e.get(i7);
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
                                            TLRPC.Chat M0 = qp.s1(p10.f24474s0).M0(Long.valueOf(inputPeer.chat_id));
                                            gVar.f(M0, bVar.f58716i, bVar.f58715g, F(M0));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat M02 = qp.s1(p10.f24474s0).M0(Long.valueOf(inputPeer.channel_id));
                                            gVar.f(M02, bVar.f58716i, bVar.f58715g, F(M02));
                                        }
                                    } else {
                                        TLRPC.Chat chat = bVar.f58713e;
                                        gVar.f(chat, bVar.f58716i, bVar.f58715g, F(chat));
                                    }
                                    gVar.setChatDeleteListener(this.f58723n);
                                    return;
                                case 10:
                                    ((yg.h) view).setDate(bVar.h);
                                    return;
                                case 11:
                                    u uVar = (u) view;
                                    int i13 = bVar.f58719l;
                                    boolean z11 = bVar.f54544b;
                                    boolean z12 = bVar.f58715g;
                                    List list = (List) bVar.f58714f;
                                    TLRPC.Chat chat2 = this.f58726w;
                                    e4 e4Var = uVar.d;
                                    uVar.f59498s = i13;
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
                                    uVar.f59443f.a(z11, false);
                                    uVar.setDivider(z12);
                                    t6.X(uVar.f59442e, m6.f28071n5, uVar.f59439a);
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
                                    TLObject tLObject = bVar.f58720m;
                                    int i14 = bVar.f58716i;
                                    int i15 = bVar.f58717j;
                                    long j10 = bVar.h;
                                    CharSequence charSequence = bVar.f58712c;
                                    boolean z13 = bVar.f58715g;
                                    boolean z14 = bVar.f54544b;
                                    e4 e4Var2 = iVar.d;
                                    iVar.f59468w = tLObject;
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
                                    m5 m5Var = iVar.f59467s;
                                    r1 i17 = r1.i();
                                    if (i15 <= 0) {
                                        j10 = 0;
                                    }
                                    m5Var.l(i17.f(j10, charSequence.toString()), false);
                                    iVar.setDivider(z13);
                                    iVar.f59443f.a(z14, false);
                                    return;
                                case 13:
                                    x xVar = (x) view;
                                    xVar.setText(bVar.f58712c);
                                    int i18 = bVar.f58716i;
                                    i6 i6Var = xVar.f59510r;
                                    if (i18 > 0) {
                                        str = id.G(i18, "BoostingBoostsCountTitle", Integer.valueOf(i18));
                                    }
                                    i6Var.a();
                                    i6Var.c(str, true, true);
                                    return;
                                case 14:
                                    ((yg.e) view).setGiveaway((TL_stories.PrepaidGiveaway) bVar.f58714f);
                                    return;
                                case 15:
                                    y yVar = (y) view;
                                    CharSequence charSequence2 = bVar.f58712c;
                                    boolean z15 = bVar.f54544b;
                                    boolean z16 = bVar.f58715g;
                                    yVar.K = bVar.f58719l;
                                    yVar.f(charSequence2, z15, z16);
                                    return;
                                case 16:
                                    l lVar = (l) view;
                                    lVar.setCount(bVar.f58716i);
                                    lVar.setAfterTextChangedListener(this.f58725s);
                                    return;
                                case 17:
                                    w wVar = (w) view;
                                    TLObject tLObject2 = bVar.f58720m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i19 = bVar.f58716i;
                                    long j11 = bVar.h;
                                    boolean z17 = bVar.f54544b;
                                    TextView textView = wVar.f59505f;
                                    i6 i6Var2 = wVar.d;
                                    i6 i6Var3 = wVar.f59504e;
                                    if (wVar.f59507r == tL_starsGiveawayOption) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    wVar.f59501a.a(z17, z10);
                                    wVar.f59507r = tL_starsGiveawayOption;
                                    if (z10) {
                                        i6Var3.a();
                                    }
                                    if (tL_starsGiveawayOption == null) {
                                        i6Var2.c(wVar.h, false, true);
                                        i6Var3.c(wVar.f59506n, z10, true);
                                        textView.setText("");
                                    } else {
                                        i6Var2.c(id.H(' ', "GiveawayStars", (int) tL_starsGiveawayOption.stars), false, true);
                                        i6Var3.c(id.H(',', "BoostingStarOptionPerUser", (int) j11), z10, true);
                                        textView.setText(r1.i().f(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i20 = i19 + 1;
                                    wVar.f59508s = i20;
                                    if (!z10) {
                                        wVar.f59509w.e(true, i20);
                                    }
                                    wVar.invalidate();
                                    return;
                                default:
                                    return;
                            }
                        }
                        d0 d0Var = (d0) view;
                        d0Var.setText(bVar.f58712c);
                        d0Var.setBackground(bVar.f58715g);
                        return;
                    }
                    ((n4) view).setText(bVar.f58712c);
                    return;
                }
                v vVar = (v) view;
                List list2 = bVar.f58718k;
                int i21 = bVar.f58716i;
                vVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i22 = 0; i22 < list2.size(); i22++) {
                    strArr[i22] = String.valueOf((Integer) list2.get(i22));
                }
                vVar.f59499a.b(i21, null, strArr);
                vVar.setCallBack(this.h);
                return;
            }
            yg.d dVar = (yg.d) view;
            int i23 = bVar.f58719l;
            int i24 = bVar.f58716i;
            TLRPC.User user = (TLRPC.User) bVar.f58714f;
            boolean z18 = bVar.f54544b;
            k9 k9Var = dVar.f59441c;
            h6 h6Var = dVar.f59439a;
            e4 e4Var3 = dVar.d;
            m5 m5Var2 = dVar.f59442e;
            v8 v8Var = dVar.f59440b;
            if (dVar.f59458s == i23) {
                z9 = true;
            } else {
                z9 = false;
            }
            dVar.f59458s = i23;
            if (i23 == 0) {
                e4Var3.k(id.M0(2131753541, null));
                dVar.setSubtitle(id.M0(2131753167, null));
                t6.X(m5Var2, m6.f28148r5, h6Var);
                v8Var.g(16);
                v8Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                t6.Z(dVar, dVar.getContext(), 2131231230, m6.f27854b7);
            } else if (i23 == 1) {
                e4Var3.k(id.M0(2131753593, null));
                if (i24 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(org.telegram.messenger.i6.m(t10.p(user), m5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i24 > 0) {
                    dVar.setSubtitle(dVar.e(id.G(i24, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(id.M0(2131753285, null)));
                }
                t6.X(m5Var2, m6.f28071n5, h6Var);
                v8Var.g(6);
                v8Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                t6.Z(dVar, dVar.getContext(), 2131231231, m6.f27854b7);
            } else if (i23 == 2) {
                e4Var3.k(id.M0(2131753332, null));
                if (i24 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(org.telegram.messenger.i6.m(t10.p(user), m5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i24 > 0) {
                    dVar.setSubtitle(dVar.e(id.G(i24, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(id.M0(2131753167, null)));
                }
                t6.X(m5Var2, m6.f28071n5, h6Var);
                v8Var.g(25);
                v8Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                t6.Z(dVar, dVar.getContext(), 2131231230, m6.f27854b7);
            } else if (i23 == 3) {
                e4Var3.k(m8.b(id.M0(2131753257, null)));
                dVar.setSubtitle(id.M0(2131753167, null));
                t6.X(m5Var2, m6.f28148r5, h6Var);
                v8Var.g(26);
                v8Var.i(-146917, -625593);
                dVar.setDivider(false);
                t6.Z(dVar, dVar.getContext(), 2131231231, m6.f27854b7);
            }
            dVar.f59443f.a(z18, z9);
            k9Var.setImageDrawable(v8Var);
            k9Var.setRoundRadius(g0.L(20.0f));
            return;
        }
        r rVar = (r) view;
        this.f58724r = rVar;
        rVar.setBoostViaGifsText(this.f58726w);
        this.f58724r.setStars(bVar.f58715g);
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i7) {
        kc kcVar;
        boolean z9;
        Context context = viewGroup.getContext();
        h6 h6Var = this.d;
        switch (i7) {
            case 2:
                kcVar = new yg.d(context, h6Var);
                break;
            case 3:
                kcVar = new View(context);
                break;
            case 4:
                int i10 = m6.f27834a7;
                View y6Var = new y6(context, m6.w0(i10, h6Var), 0);
                t6.h(i10, y6Var, h6Var);
                kcVar = y6Var;
                break;
            case 5:
                kcVar = new v(context, h6Var);
                break;
            case 6:
                View n4Var = new n4(context, m6.L6, 21, 15, 3, false, false, this.d);
                t6.h(m6.f27963h5, n4Var, h6Var);
                kcVar = n4Var;
                break;
            case 7:
                kcVar = new d0(context, h6Var);
                break;
            case 8:
                kcVar = new yg.b(context, h6Var);
                break;
            case 9:
                kcVar = new yg.g(context, h6Var);
                break;
            case 10:
                kcVar = new yg.h(context, h6Var);
                break;
            case 11:
                yg.c cVar = new yg.c(context, h6Var);
                cVar.f59441c.setVisibility(8);
                kcVar = cVar;
                break;
            case 12:
                kcVar = new yg.i(context, h6Var);
                break;
            case 13:
                View xVar = new x(context, h6Var);
                t6.h(m6.f27963h5, xVar, h6Var);
                kcVar = xVar;
                break;
            case 14:
                kcVar = new yg.d(context, h6Var);
                break;
            case 15:
                r8 r8Var = new r8(context, h6Var);
                r8Var.setHeight(50);
                kcVar = r8Var;
                break;
            case 16:
                kcVar = new l(context, h6Var);
                break;
            case 17:
                kcVar = new w(context, h6Var);
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
                i6 i6Var = kcVar2.f4232a;
                i6Var.c(M0, z9, true);
                int i11 = m6.f28090o6;
                m6.v0(i11);
                t6.Y(i6Var, i11, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = kcVar2.f4233b;
                t6.s(imageView, i11, null, mode);
                if (z9) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(wq.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                kcVar2.d = false;
                kcVar2.setWillNotDraw(true);
                kcVar = kcVar2;
                break;
            default:
                kcVar = new r(context, h6Var);
                break;
        }
        return jg.g.r(kcVar, kcVar, -1, -2);
    }
}
