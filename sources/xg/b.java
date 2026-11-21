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
import org.telegram.messenger.j10;
import org.telegram.messenger.j6;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.r1;
import org.telegram.messenger.tr;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.q9;
import ug.z;
import v4.f1;
import wg.q;
import wg.u;
import yg.d0;
import yg.i;
import yg.l;
import yg.r;
import yg.v;
import yg.w;
import yg.x;
import yg.y;
public final class b extends rg.b {
    public final h6 d;
    public ek0 f60515f;
    public u h;
    public u f60516n;
    public r f60517r;
    public u f60518s;
    public TLRPC.Chat f60519w;
    public ArrayList f60514e = new ArrayList();
    public final HashMap f60520x = new HashMap();

    public b(h6 h6Var) {
        this.d = h6Var;
        z zVar = new z(this, 6);
        tr a02 = tr.a0(j10.f24798t0);
        a02.f27080a.c(new q(2, a02, zVar));
    }

    @Override
    public final boolean D(f1 f1Var) {
        int i7 = f1Var.f59165f;
        if (i7 != 2 && i7 != 11 && i7 != 8 && i7 != 10 && i7 != 15 && i7 != 12 && i7 != 17 && i7 != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull P0 = mp.u1(j10.f24798t0).P0(chat.f28431id);
        if (P0 != null && (i7 = P0.participants_count) > 0) {
            return i7;
        }
        HashMap hashMap = this.f60520x;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f28431id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i7 = 0; i7 < this.f60514e.size(); i7++) {
            if (((a) this.f60514e.get(i7)).f56630a == 7) {
                g(i7);
            }
        }
    }

    @Override
    public final int b() {
        return this.f60514e.size();
    }

    @Override
    public final int d(int i7) {
        return ((a) this.f60514e.get(i7)).f56630a;
    }

    @Override
    public final void t(f1 f1Var, int i7) {
        boolean z10;
        int i10;
        int i11;
        long j3;
        boolean z11;
        int i12 = f1Var.f59165f;
        View view = f1Var.f59161a;
        a aVar = (a) this.f60514e.get(i7);
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
                                            TLRPC.Chat O0 = mp.u1(j10.f24798t0).O0(Long.valueOf(inputPeer.chat_id));
                                            gVar.f(O0, aVar.f60509i, aVar.f60508g, F(O0));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat O02 = mp.u1(j10.f24798t0).O0(Long.valueOf(inputPeer.channel_id));
                                            gVar.f(O02, aVar.f60509i, aVar.f60508g, F(O02));
                                        }
                                    } else {
                                        TLRPC.Chat chat = aVar.f60506e;
                                        gVar.f(chat, aVar.f60509i, aVar.f60508g, F(chat));
                                    }
                                    gVar.setChatDeleteListener(this.f60516n);
                                    return;
                                case 10:
                                    ((yg.h) view).setDate(aVar.h);
                                    return;
                                case 11:
                                    yg.u uVar = (yg.u) view;
                                    int i13 = aVar.f60512l;
                                    boolean z12 = aVar.f56631b;
                                    boolean z13 = aVar.f60508g;
                                    List list = (List) aVar.f60507f;
                                    TLRPC.Chat chat2 = this.f60519w;
                                    u3 u3Var = uVar.d;
                                    uVar.f61311s = i13;
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
                                    uVar.f61256f.a(z12, false);
                                    uVar.setDivider(z13);
                                    t6.X(uVar.f61255e, m6.f29559n5, uVar.f61252a);
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
                                    TLObject tLObject = aVar.f60513m;
                                    int i14 = aVar.f60509i;
                                    int i15 = aVar.f60510j;
                                    long j10 = aVar.h;
                                    CharSequence charSequence = aVar.f60505c;
                                    boolean z14 = aVar.f60508g;
                                    boolean z15 = aVar.f56631b;
                                    u3 u3Var2 = iVar.d;
                                    iVar.f61281w = tLObject;
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
                                    m5 m5Var = iVar.f61280s;
                                    r1 i17 = r1.i();
                                    if (i15 <= 0) {
                                        j10 = 0;
                                    }
                                    m5Var.l(i17.f(j10, charSequence.toString()), false);
                                    iVar.setDivider(z14);
                                    iVar.f61256f.a(z15, false);
                                    return;
                                case 13:
                                    x xVar = (x) view;
                                    xVar.setText(aVar.f60505c);
                                    int i18 = aVar.f60509i;
                                    o6 o6Var = xVar.f61323r;
                                    if (i18 > 0) {
                                        str = gd.G(i18, "BoostingBoostsCountTitle", Integer.valueOf(i18));
                                    }
                                    o6Var.a();
                                    o6Var.c(str, true, true);
                                    return;
                                case 14:
                                    ((yg.e) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f60507f);
                                    return;
                                case 15:
                                    y yVar = (y) view;
                                    CharSequence charSequence2 = aVar.f60505c;
                                    boolean z16 = aVar.f56631b;
                                    boolean z17 = aVar.f60508g;
                                    yVar.L = aVar.f60512l;
                                    yVar.f(charSequence2, z16, z17);
                                    return;
                                case 16:
                                    l lVar = (l) view;
                                    lVar.setCount(aVar.f60509i);
                                    lVar.setAfterTextChangedListener(this.f60518s);
                                    return;
                                case 17:
                                    w wVar = (w) view;
                                    TLObject tLObject2 = aVar.f60513m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i19 = aVar.f60509i;
                                    long j11 = aVar.h;
                                    boolean z18 = aVar.f56631b;
                                    TextView textView = wVar.f61318f;
                                    o6 o6Var2 = wVar.d;
                                    o6 o6Var3 = wVar.f61317e;
                                    if (wVar.f61320r == tL_starsGiveawayOption) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    wVar.f61314a.a(z18, z11);
                                    wVar.f61320r = tL_starsGiveawayOption;
                                    if (z11) {
                                        o6Var3.a();
                                    }
                                    if (tL_starsGiveawayOption == null) {
                                        o6Var2.c(wVar.h, false, true);
                                        o6Var3.c(wVar.f61319n, z11, true);
                                        textView.setText("");
                                    } else {
                                        o6Var2.c(gd.H(' ', "GiveawayStars", (int) tL_starsGiveawayOption.stars), false, true);
                                        o6Var3.c(gd.H(',', "BoostingStarOptionPerUser", (int) j11), z11, true);
                                        textView.setText(r1.i().f(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i20 = i19 + 1;
                                    wVar.f61321s = i20;
                                    if (!z11) {
                                        wVar.f61322w.e(true, i20);
                                    }
                                    wVar.invalidate();
                                    return;
                                default:
                                    return;
                            }
                        }
                        d0 d0Var = (d0) view;
                        d0Var.setText(aVar.f60505c);
                        d0Var.setBackground(aVar.f60508g);
                        return;
                    }
                    ((o4) view).setText(aVar.f60505c);
                    return;
                }
                v vVar = (v) view;
                List list2 = aVar.f60511k;
                int i21 = aVar.f60509i;
                vVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i22 = 0; i22 < list2.size(); i22++) {
                    strArr[i22] = String.valueOf((Integer) list2.get(i22));
                }
                vVar.f61312a.b(i21, null, strArr);
                vVar.setCallBack(this.h);
                return;
            }
            yg.d dVar = (yg.d) view;
            int i23 = aVar.f60512l;
            int i24 = aVar.f60509i;
            TLRPC.User user = (TLRPC.User) aVar.f60507f;
            boolean z19 = aVar.f56631b;
            q9 q9Var = dVar.f61254c;
            h6 h6Var = dVar.f61252a;
            u3 u3Var3 = dVar.d;
            m5 m5Var2 = dVar.f61255e;
            b9 b9Var = dVar.f61253b;
            if (dVar.f61271s == i23) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.f61271s = i23;
            if (i23 == 0) {
                u3Var3.k(gd.N0(2131753538, null));
                dVar.setSubtitle(gd.N0(2131753164, null));
                t6.X(m5Var2, m6.f29636r5, h6Var);
                b9Var.g(16);
                b9Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                t6.Z(dVar, dVar.getContext(), 2131231230, m6.f29342b7);
            } else if (i23 == 1) {
                u3Var3.k(gd.N0(2131753590, null));
                if (i24 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(j6.m(o10.q(user), m5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i24 > 0) {
                    dVar.setSubtitle(dVar.e(gd.G(i24, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(gd.N0(2131753282, null)));
                }
                t6.X(m5Var2, m6.f29559n5, h6Var);
                b9Var.g(6);
                b9Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                t6.Z(dVar, dVar.getContext(), 2131231231, m6.f29342b7);
            } else if (i23 == 2) {
                u3Var3.k(gd.N0(2131753329, null));
                if (i24 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(j6.m(o10.q(user), m5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i24 > 0) {
                    dVar.setSubtitle(dVar.e(gd.G(i24, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(gd.N0(2131753164, null)));
                }
                t6.X(m5Var2, m6.f29559n5, h6Var);
                b9Var.g(25);
                b9Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                t6.Z(dVar, dVar.getContext(), 2131231230, m6.f29342b7);
            } else if (i23 == 3) {
                u3Var3.k(n8.b(gd.N0(2131753254, null)));
                dVar.setSubtitle(gd.N0(2131753164, null));
                t6.X(m5Var2, m6.f29636r5, h6Var);
                b9Var.g(26);
                b9Var.i(-146917, -625593);
                dVar.setDivider(false);
                t6.Z(dVar, dVar.getContext(), 2131231231, m6.f29342b7);
            }
            dVar.f61256f.a(z19, z10);
            q9Var.setImageDrawable(b9Var);
            q9Var.setRoundRadius(g0.L(20.0f));
            return;
        }
        r rVar = (r) view;
        this.f60517r = rVar;
        rVar.setBoostViaGifsText(this.f60519w);
        this.f60517r.setStars(aVar.f60508g);
    }

    @Override
    public final f1 x(ViewGroup viewGroup, int i7) {
        xa xaVar;
        boolean z10;
        Context context = viewGroup.getContext();
        h6 h6Var = this.d;
        switch (i7) {
            case 2:
                xaVar = new yg.d(context, h6Var);
                break;
            case 3:
                xaVar = new View(context);
                break;
            case 4:
                int i10 = m6.f29321a7;
                View z6Var = new z6(context, m6.w0(i10, h6Var), 0);
                t6.h(i10, z6Var, h6Var);
                xaVar = z6Var;
                break;
            case 5:
                xaVar = new v(context, h6Var);
                break;
            case 6:
                View o4Var = new o4(context, m6.L6, 21, 15, 3, false, false, this.d);
                t6.h(m6.f29451h5, o4Var, h6Var);
                xaVar = o4Var;
                break;
            case 7:
                xaVar = new d0(context, h6Var);
                break;
            case 8:
                xaVar = new yg.b(context, h6Var);
                break;
            case 9:
                xaVar = new yg.g(context, h6Var);
                break;
            case 10:
                xaVar = new yg.h(context, h6Var);
                break;
            case 11:
                yg.c cVar = new yg.c(context, h6Var);
                cVar.f61254c.setVisibility(8);
                xaVar = cVar;
                break;
            case 12:
                xaVar = new i(context, h6Var);
                break;
            case 13:
                View xVar = new x(context, h6Var);
                t6.h(m6.f29451h5, xVar, h6Var);
                xaVar = xVar;
                break;
            case 14:
                xaVar = new yg.d(context, h6Var);
                break;
            case 15:
                s8 s8Var = new s8(context, h6Var);
                s8Var.setHeight(50);
                xaVar = s8Var;
                break;
            case 16:
                xaVar = new l(context, h6Var);
                break;
            case 17:
                xaVar = new w(context, h6Var);
                break;
            case 18:
                xa xaVar2 = new xa(context);
                String N0 = gd.N0(2131747642, null);
                if (xaVar2.f10051c == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xaVar2.f10051c = -1;
                o6 o6Var = xaVar2.f10049a;
                o6Var.c(N0, z10, true);
                int i11 = m6.f29578o6;
                m6.v0(i11);
                t6.Y(o6Var, i11, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = xaVar2.f10050b;
                t6.s(imageView, i11, null, mode);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(nr.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                xaVar2.d = false;
                xaVar2.setWillNotDraw(true);
                xaVar = xaVar2;
                break;
            default:
                xaVar = new r(context, h6Var);
                break;
        }
        return i5.c.q(xaVar, xaVar, -1, -2);
    }
}
