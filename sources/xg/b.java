package xg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import di.xa;
import fi.u3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.j6;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.r1;
import org.telegram.messenger.tr;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.p9;
import ug.z;
import v4.f1;
import wg.t;
import yg.d0;
import yg.i;
import yg.l;
import yg.r;
import yg.u;
import yg.v;
import yg.w;
import yg.x;
import yg.y;
public final class b extends rg.b {
    public final i6 d;
    public ek0 f60602f;
    public t h;
    public t f60603n;
    public r f60604r;
    public t f60605s;
    public TLRPC.Chat f60606w;
    public ArrayList f60601e = new ArrayList();
    public final HashMap f60607x = new HashMap();

    public b(i6 i6Var) {
        this.d = i6Var;
        z zVar = new z(this, 6);
        tr a02 = tr.a0(i10.f24637t0);
        a02.f27149a.c(new v9.b(6, a02, zVar));
    }

    @Override
    public final boolean D(f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 2 && i7 != 11 && i7 != 8 && i7 != 10 && i7 != 15 && i7 != 12 && i7 != 17 && i7 != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull P0 = mp.u1(i10.f24637t0).P0(chat.f28492id);
        if (P0 != null && (i7 = P0.participants_count) > 0) {
            return i7;
        }
        HashMap hashMap = this.f60607x;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f28492id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i7 = 0; i7 < this.f60601e.size(); i7++) {
            if (((a) this.f60601e.get(i7)).f56712a == 7) {
                g(i7);
            }
        }
    }

    @Override
    public final int b() {
        return this.f60601e.size();
    }

    @Override
    public final int d(int i7) {
        return ((a) this.f60601e.get(i7)).f56712a;
    }

    @Override
    public final void t(f1 f1Var, int i7) {
        boolean z10;
        int i10;
        int i11;
        long j3;
        boolean z11;
        int i12 = f1Var.f59249f;
        View view = f1Var.f59245a;
        a aVar = (a) this.f60601e.get(i7);
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
                                    TLRPC.InputPeer inputPeer = aVar.d;
                                    if (inputPeer != null) {
                                        if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                            TLRPC.Chat O0 = mp.u1(i10.f24637t0).O0(Long.valueOf(inputPeer.chat_id));
                                            gVar.f(O0, aVar.f60596i, aVar.f60595g, F(O0));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat O02 = mp.u1(i10.f24637t0).O0(Long.valueOf(inputPeer.channel_id));
                                            gVar.f(O02, aVar.f60596i, aVar.f60595g, F(O02));
                                        }
                                    } else {
                                        TLRPC.Chat chat = aVar.f60593e;
                                        gVar.f(chat, aVar.f60596i, aVar.f60595g, F(chat));
                                    }
                                    gVar.setChatDeleteListener(this.f60603n);
                                    return;
                                case 10:
                                    ((yg.h) view).setDate(aVar.h);
                                    return;
                                case 11:
                                    u uVar = (u) view;
                                    int i13 = aVar.f60599l;
                                    boolean z12 = aVar.f56713b;
                                    boolean z13 = aVar.f60595g;
                                    List list = (List) aVar.f60594f;
                                    TLRPC.Chat chat2 = this.f60606w;
                                    u3 u3Var = uVar.d;
                                    uVar.f61399s = i13;
                                    boolean V = v3.V(chat2);
                                    if (i13 == 0) {
                                        if (V) {
                                            i11 = 2131753595;
                                        } else {
                                            i11 = 2131753596;
                                        }
                                        u3Var.k(gd.a0(null, null, i11, new Object[0]));
                                    } else if (i13 == 1) {
                                        if (V) {
                                            i10 = 2131753333;
                                        } else {
                                            i10 = 2131753334;
                                        }
                                        u3Var.k(gd.a0(null, null, i10, new Object[0]));
                                    }
                                    uVar.f61344f.a(z12, false);
                                    uVar.setDivider(z13);
                                    u6.X(uVar.f61343e, n6.f29632n5, uVar.f61340a);
                                    if (list.size() == 0) {
                                        uVar.setSubtitle(uVar.e(gd.N0(2131753519, null)));
                                        return;
                                    } else if (list.size() <= 3) {
                                        if (list.size() == 1) {
                                            uVar.setSubtitle(uVar.e(gd.a0("BoostingFromAllCountries1", null, 2131753518, ((TLRPC.TL_help_country) list.get(0)).default_name)));
                                            return;
                                        } else if (list.size() == 2) {
                                            uVar.setSubtitle(uVar.e(gd.a0("BoostingFromAllCountries2", null, 2131753517, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name)));
                                            return;
                                        } else {
                                            uVar.setSubtitle(uVar.e(gd.a0("BoostingFromAllCountries3", null, 2131753516, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name, ((TLRPC.TL_help_country) list.get(2)).default_name)));
                                            return;
                                        }
                                    } else {
                                        uVar.setSubtitle(uVar.e(gd.G(list.size(), "BoostingFromCountriesCount", new Object[0])));
                                        return;
                                    }
                                case 12:
                                    i iVar = (i) view;
                                    TLObject tLObject = aVar.f60600m;
                                    int i14 = aVar.f60596i;
                                    int i15 = aVar.f60597j;
                                    long j10 = aVar.h;
                                    CharSequence charSequence = aVar.f60592c;
                                    boolean z14 = aVar.f60595g;
                                    boolean z15 = aVar.f56713b;
                                    u3 u3Var2 = iVar.d;
                                    iVar.f61369w = tLObject;
                                    if (i14 >= 12) {
                                        u3Var2.k(gd.G(1, "Years", new Object[0]));
                                    } else {
                                        u3Var2.k(gd.G(i14, "Months", new Object[0]));
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
                                    n5 n5Var = iVar.f61368s;
                                    r1 i17 = r1.i();
                                    if (i15 <= 0) {
                                        j10 = 0;
                                    }
                                    n5Var.l(i17.f(j10, charSequence.toString()), false);
                                    iVar.setDivider(z14);
                                    iVar.f61344f.a(z15, false);
                                    return;
                                case 13:
                                    x xVar = (x) view;
                                    xVar.setText(aVar.f60592c);
                                    int i18 = aVar.f60596i;
                                    org.telegram.ui.Components.n6 n6Var = xVar.f61411r;
                                    if (i18 > 0) {
                                        str = gd.G(i18, "BoostingBoostsCountTitle", Integer.valueOf(i18));
                                    }
                                    n6Var.a();
                                    n6Var.c(str, true, true);
                                    return;
                                case 14:
                                    ((yg.e) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f60594f);
                                    return;
                                case 15:
                                    y yVar = (y) view;
                                    CharSequence charSequence2 = aVar.f60592c;
                                    boolean z16 = aVar.f56713b;
                                    boolean z17 = aVar.f60595g;
                                    yVar.L = aVar.f60599l;
                                    yVar.f(charSequence2, z16, z17);
                                    return;
                                case 16:
                                    l lVar = (l) view;
                                    lVar.setCount(aVar.f60596i);
                                    lVar.setAfterTextChangedListener(this.f60605s);
                                    return;
                                case 17:
                                    w wVar = (w) view;
                                    TLObject tLObject2 = aVar.f60600m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i19 = aVar.f60596i;
                                    long j11 = aVar.h;
                                    boolean z18 = aVar.f56713b;
                                    TextView textView = wVar.f61406f;
                                    org.telegram.ui.Components.n6 n6Var2 = wVar.d;
                                    org.telegram.ui.Components.n6 n6Var3 = wVar.f61405e;
                                    if (wVar.f61408r == tL_starsGiveawayOption) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    wVar.f61402a.a(z18, z11);
                                    wVar.f61408r = tL_starsGiveawayOption;
                                    if (z11) {
                                        n6Var3.a();
                                    }
                                    if (tL_starsGiveawayOption == null) {
                                        n6Var2.c(wVar.h, false, true);
                                        n6Var3.c(wVar.f61407n, z11, true);
                                        textView.setText("");
                                    } else {
                                        n6Var2.c(gd.H(' ', "GiveawayStars", (int) tL_starsGiveawayOption.stars), false, true);
                                        n6Var3.c(gd.H(',', "BoostingStarOptionPerUser", (int) j11), z11, true);
                                        textView.setText(r1.i().f(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i20 = i19 + 1;
                                    wVar.f61409s = i20;
                                    if (!z11) {
                                        wVar.f61410w.e(true, i20);
                                    }
                                    wVar.invalidate();
                                    return;
                                default:
                                    return;
                            }
                        }
                        d0 d0Var = (d0) view;
                        d0Var.setText(aVar.f60592c);
                        d0Var.setBackground(aVar.f60595g);
                        return;
                    }
                    ((o4) view).setText(aVar.f60592c);
                    return;
                }
                v vVar = (v) view;
                List list2 = aVar.f60598k;
                int i21 = aVar.f60596i;
                vVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i22 = 0; i22 < list2.size(); i22++) {
                    strArr[i22] = String.valueOf((Integer) list2.get(i22));
                }
                vVar.f61400a.b(i21, null, strArr);
                vVar.setCallBack(this.h);
                return;
            }
            yg.d dVar = (yg.d) view;
            int i23 = aVar.f60599l;
            int i24 = aVar.f60596i;
            TLRPC.User user = (TLRPC.User) aVar.f60594f;
            boolean z19 = aVar.f56713b;
            p9 p9Var = dVar.f61342c;
            i6 i6Var = dVar.f61340a;
            u3 u3Var3 = dVar.d;
            n5 n5Var2 = dVar.f61343e;
            a9 a9Var = dVar.f61341b;
            if (dVar.f61359s == i23) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.f61359s = i23;
            if (i23 == 0) {
                u3Var3.k(gd.N0(2131753538, null));
                dVar.setSubtitle(gd.N0(2131753164, null));
                u6.X(n5Var2, n6.f29709r5, i6Var);
                a9Var.g(16);
                a9Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                u6.Z(dVar, dVar.getContext(), 2131231233, n6.f29415b7);
            } else if (i23 == 1) {
                u3Var3.k(gd.N0(2131753590, null));
                if (i24 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(j6.m(n10.q(user), n5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i24 > 0) {
                    dVar.setSubtitle(dVar.e(gd.G(i24, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(gd.N0(2131753282, null)));
                }
                u6.X(n5Var2, n6.f29632n5, i6Var);
                a9Var.g(6);
                a9Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                u6.Z(dVar, dVar.getContext(), 2131231234, n6.f29415b7);
            } else if (i23 == 2) {
                u3Var3.k(gd.N0(2131753329, null));
                if (i24 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(j6.m(n10.q(user), n5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i24 > 0) {
                    dVar.setSubtitle(dVar.e(gd.G(i24, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(gd.N0(2131753164, null)));
                }
                u6.X(n5Var2, n6.f29632n5, i6Var);
                a9Var.g(25);
                a9Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                u6.Z(dVar, dVar.getContext(), 2131231233, n6.f29415b7);
            } else if (i23 == 3) {
                u3Var3.k(m8.b(gd.N0(2131753254, null)));
                dVar.setSubtitle(gd.N0(2131753164, null));
                u6.X(n5Var2, n6.f29709r5, i6Var);
                a9Var.g(26);
                a9Var.i(-146917, -625593);
                dVar.setDivider(false);
                u6.Z(dVar, dVar.getContext(), 2131231234, n6.f29415b7);
            }
            dVar.f61344f.a(z19, z10);
            p9Var.setImageDrawable(a9Var);
            p9Var.setRoundRadius(g0.L(20.0f));
            return;
        }
        r rVar = (r) view;
        this.f60604r = rVar;
        rVar.setBoostViaGifsText(this.f60606w);
        this.f60604r.setStars(aVar.f60595g);
    }

    @Override
    public final f1 x(ViewGroup viewGroup, int i7) {
        xa xaVar;
        boolean z10;
        Context context = viewGroup.getContext();
        i6 i6Var = this.d;
        switch (i7) {
            case 2:
                xaVar = new yg.d(context, i6Var);
                break;
            case 3:
                xaVar = new View(context);
                break;
            case 4:
                int i10 = n6.f29394a7;
                View y6Var = new y6(context, n6.w0(i10, i6Var), 0);
                u6.h(i10, y6Var, i6Var);
                xaVar = y6Var;
                break;
            case 5:
                xaVar = new v(context, i6Var);
                break;
            case 6:
                View o4Var = new o4(context, n6.L6, 21, 15, 3, false, false, this.d);
                u6.h(n6.f29524h5, o4Var, i6Var);
                xaVar = o4Var;
                break;
            case 7:
                xaVar = new d0(context, i6Var);
                break;
            case 8:
                xaVar = new yg.b(context, i6Var);
                break;
            case 9:
                xaVar = new yg.g(context, i6Var);
                break;
            case 10:
                xaVar = new yg.h(context, i6Var);
                break;
            case 11:
                yg.c cVar = new yg.c(context, i6Var);
                cVar.f61342c.setVisibility(8);
                xaVar = cVar;
                break;
            case 12:
                xaVar = new i(context, i6Var);
                break;
            case 13:
                View xVar = new x(context, i6Var);
                u6.h(n6.f29524h5, xVar, i6Var);
                xaVar = xVar;
                break;
            case 14:
                xaVar = new yg.d(context, i6Var);
                break;
            case 15:
                r8 r8Var = new r8(context, i6Var);
                r8Var.setHeight(50);
                xaVar = r8Var;
                break;
            case 16:
                xaVar = new l(context, i6Var);
                break;
            case 17:
                xaVar = new w(context, i6Var);
                break;
            case 18:
                xa xaVar2 = new xa(context);
                String N0 = gd.N0(2131747642, null);
                if (xaVar2.f10015c == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xaVar2.f10015c = -1;
                org.telegram.ui.Components.n6 n6Var = xaVar2.f10013a;
                n6Var.c(N0, z10, true);
                int i11 = n6.f29651o6;
                n6.v0(i11);
                u6.Y(n6Var, i11, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = xaVar2.f10014b;
                u6.s(imageView, i11, null, mode);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(kr.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                xaVar2.d = false;
                xaVar2.setWillNotDraw(true);
                xaVar = xaVar2;
                break;
            default:
                xaVar = new r(context, i6Var);
                break;
        }
        return i5.c.q(xaVar, xaVar, -1, -2);
    }
}
