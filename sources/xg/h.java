package xg;

import ah.r;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.j6;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nv0;
import ug.z;
import v4.f1;
import v4.q0;
import wg.a1;
import wg.q;
import wg.y0;
public final class h extends rg.b {
    public final h6 d;
    public final Context f60543e;
    public ek0 f60544f;
    public ArrayList f60545n;
    public boolean f60547s;
    public y3 f60548w;
    public final boolean f60549x;
    public boolean f60550y;
    public final HashMap f60546r = new HashMap();
    public boolean E = true;
    public final boolean h = true;

    public h(Context context, h6 h6Var, boolean z10) {
        this.f60543e = context;
        this.f60549x = z10;
        this.d = h6Var;
        z zVar = new z(this, 8);
        tr a02 = tr.a0(j10.f24798t0);
        a02.f27080a.c(new q(2, a02, zVar));
    }

    @Override
    public final boolean D(f1 f1Var) {
        int i7 = f1Var.f59165f;
        if (i7 != 3 && i7 != 6 && i7 != 9) {
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
        HashMap hashMap = this.f60546r;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f28431id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.f60545n;
        if (arrayList != null && !arrayList.isEmpty()) {
            g(this.f60545n.size() - 1);
        }
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f60545n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i7) {
        ArrayList arrayList = this.f60545n;
        if (arrayList != null && i7 >= 0) {
            return ((g) arrayList.get(i7)).f56630a;
        }
        return -1;
    }

    @Override
    public final void t(f1 f1Var, int i7) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        ArrayList arrayList = this.f60545n;
        if (arrayList != null && i7 >= 0) {
            g gVar = (g) arrayList.get(i7);
            int i12 = f1Var.f59165f;
            View view = f1Var.f59161a;
            int i13 = 8;
            boolean z12 = true;
            if (i12 == 3) {
                r rVar = (r) view;
                gVar.getClass();
                TLRPC.User user = gVar.f60531c;
                if (user != null) {
                    rVar.setUser(user);
                    String str = gVar.f60534g;
                    if (str != null) {
                        rVar.setSubtitle(str);
                        t6.X(rVar.f61255e, m6.f29636r5, this.d);
                    }
                } else {
                    TLRPC.InputPeer inputPeer = gVar.d;
                    if (inputPeer != null) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                            rVar.setUser(j10.i(j10.f24798t0).f());
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            rVar.setUser(mp.u1(j10.f24798t0).c2(Long.valueOf(inputPeer.user_id)));
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.Chat O0 = mp.u1(j10.f24798t0).O0(Long.valueOf(inputPeer.chat_id));
                            rVar.h(F(O0), O0);
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.Chat O02 = mp.u1(j10.f24798t0).O0(Long.valueOf(inputPeer.channel_id));
                            rVar.h(F(O02), O02);
                        }
                    }
                }
                rVar.c(gVar.f60536j, false);
                rVar.i(false, 1.0f);
                int i14 = i7 + 1;
                if (i14 < this.f60545n.size() && ((g) this.f60545n.get(i14)).f56630a != i12) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                rVar.setDivider(z10);
                if (i14 < this.f60545n.size() && ((g) this.f60545n.get(i14)).f56630a == 7) {
                    rVar.setDivider(false);
                }
                rVar.setOptions(gVar.f60539m);
                a1 a1Var = gVar.f60540n;
                a1 a1Var2 = gVar.f60541o;
                ImageView imageView = rVar.G;
                ImageView imageView2 = rVar.E;
                if (a1Var != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                rVar.f1110y = z11;
                if (z11 && rVar.H) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView2.setVisibility(i11);
                imageView2.setOnClickListener(a1Var);
                if (a1Var2 == null) {
                    z12 = false;
                }
                rVar.F = z12;
                if (z12 && rVar.H) {
                    i13 = 0;
                }
                imageView.setVisibility(i13);
                imageView.setOnClickListener(a1Var2);
                rVar.g(this.E, false);
            } else if (i12 == 6) {
                ah.c cVar = (ah.c) view;
                if (i7 >= this.f60545n.size() - 1 || (i10 = i7 + 1) >= this.f60545n.size() - 1 || ((g) this.f60545n.get(i10)).f56630a == 7) {
                    z12 = false;
                }
                cVar.f1059w = gVar.f60532e;
                cVar.f();
                cVar.setDivider(z12);
                cVar.c(gVar.f60536j, false);
            } else if (i12 == -1) {
                int i15 = gVar.f60537k;
                if (i15 < 0) {
                    i15 = (int) (g0.f24146q.y * 0.3f);
                }
                view.setLayoutParams(new q0(-1, i15));
            } else if (i12 == 7) {
                ((ah.f) view).setLetter(gVar.f60533f);
            } else if (i12 == 5) {
                try {
                    ((nv0) view).f37989b.getImageReceiver().P0(false);
                } catch (Exception unused) {
                }
            } else if (i12 == 8) {
                y3 y3Var = (y3) view;
                if (TextUtils.equals(y3Var.getText(), gVar.f60533f)) {
                    String str2 = gVar.f60534g;
                    if (str2 == null) {
                        str2 = "";
                    }
                    y3Var.a(str2, gVar.f60538l);
                } else {
                    y3Var.setText(j6.p(gVar.f60533f, y3Var.getTextView(), null));
                    if (!TextUtils.isEmpty(gVar.f60534g)) {
                        String str3 = gVar.f60534g;
                        y0 y0Var = gVar.f60538l;
                        x3 x3Var = y3Var.f32484b;
                        x3Var.c(str3, false, true);
                        x3Var.setOnClickListener(y0Var);
                        x3Var.setVisibility(0);
                    }
                }
                this.f60548w = y3Var;
            } else if (i12 == 9) {
                n8 n8Var = (n8) view;
                n8Var.g(m6.f29713v6, m6.f29694u6);
                n8Var.o(gVar.f60535i, gVar.f60533f, false);
            } else if (i12 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != gVar.f60542p) {
                    g0.E2(gVar.f60542p);
                    frameLayout.addView(gVar.f60542p, ma.c(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final f1 x(ViewGroup viewGroup, int i7) {
        r rVar;
        Context context = this.f60543e;
        if (i7 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            rVar = view;
        } else if (i7 == 3) {
            rVar = new r(this.f60543e, this.f60549x, this.f60550y, this.d, this.f60547s);
        } else {
            h6 h6Var = this.d;
            if (i7 == 5) {
                nv0 nv0Var = new nv0(context, null, 1, h6Var);
                nv0Var.d.setText(gd.N0(2131747974, null));
                nv0Var.f37991e.setText(gd.N0(2131745611, null));
                nv0Var.f37988a.setTranslationY(g0.L(24.0f));
                rVar = nv0Var;
            } else {
                boolean z10 = this.h;
                if (i7 == 7) {
                    ah.f fVar = new ah.f(context, h6Var);
                    fVar.setTag(-33024);
                    rVar = fVar;
                    if (z10) {
                        fVar.setBackground(null);
                        rVar = fVar;
                    }
                } else if (i7 == 6) {
                    ah.c cVar = new ah.c(context, h6Var);
                    cVar.setTag(-33024);
                    rVar = cVar;
                    if (z10) {
                        cVar.setBackground(null);
                        rVar = cVar;
                    }
                } else if (i7 == 8) {
                    y3 y3Var = new y3(context, h6Var);
                    y3Var.setTag(-33024);
                    rVar = y3Var;
                    if (z10) {
                        y3Var.setBackground(null);
                        rVar = y3Var;
                    }
                } else if (i7 == 9) {
                    n8 n8Var = new n8(context, h6Var);
                    n8Var.f31167n = 16;
                    n8Var.f31171x = 19;
                    rVar = n8Var;
                } else if (i7 == 10) {
                    rVar = new FrameLayout(context);
                } else {
                    rVar = new View(context);
                }
            }
        }
        return new f1(rVar);
    }

    @Override
    public final void y(f1 f1Var) {
        View view = f1Var.f59161a;
        if (view instanceof r) {
            ((r) view).g(this.E, false);
        }
    }
}
