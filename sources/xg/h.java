package xg;

import ah.r;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.na;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.j6;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.mv0;
import ug.z;
import v4.f1;
import v4.q0;
import wg.x0;
import wg.z0;
public final class h extends rg.b {
    public final i6 d;
    public final Context f60630e;
    public ek0 f60631f;
    public ArrayList f60632n;
    public boolean f60634s;
    public y3 f60635w;
    public final boolean f60636x;
    public boolean f60637y;
    public final HashMap f60633r = new HashMap();
    public boolean E = true;
    public final boolean h = true;

    public h(Context context, i6 i6Var, boolean z10) {
        this.f60630e = context;
        this.f60636x = z10;
        this.d = i6Var;
        z zVar = new z(this, 8);
        tr a02 = tr.a0(i10.f24637t0);
        a02.f27149a.c(new v9.b(6, a02, zVar));
    }

    @Override
    public final boolean D(f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 3 && i7 != 6 && i7 != 9) {
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
        HashMap hashMap = this.f60633r;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f28492id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.f60632n;
        if (arrayList != null && !arrayList.isEmpty()) {
            g(this.f60632n.size() - 1);
        }
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f60632n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i7) {
        ArrayList arrayList = this.f60632n;
        if (arrayList != null && i7 >= 0) {
            return ((g) arrayList.get(i7)).f56712a;
        }
        return -1;
    }

    @Override
    public final void t(f1 f1Var, int i7) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        ArrayList arrayList = this.f60632n;
        if (arrayList != null && i7 >= 0) {
            g gVar = (g) arrayList.get(i7);
            int i12 = f1Var.f59249f;
            View view = f1Var.f59245a;
            int i13 = 8;
            boolean z12 = true;
            if (i12 == 3) {
                r rVar = (r) view;
                gVar.getClass();
                TLRPC.User user = gVar.f60618c;
                if (user != null) {
                    rVar.setUser(user);
                    String str = gVar.f60621g;
                    if (str != null) {
                        rVar.setSubtitle(str);
                        u6.X(rVar.f61343e, n6.f29709r5, this.d);
                    }
                } else {
                    TLRPC.InputPeer inputPeer = gVar.d;
                    if (inputPeer != null) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                            rVar.setUser(i10.i(i10.f24637t0).f());
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            rVar.setUser(mp.u1(i10.f24637t0).c2(Long.valueOf(inputPeer.user_id)));
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.Chat O0 = mp.u1(i10.f24637t0).O0(Long.valueOf(inputPeer.chat_id));
                            rVar.h(F(O0), O0);
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.Chat O02 = mp.u1(i10.f24637t0).O0(Long.valueOf(inputPeer.channel_id));
                            rVar.h(F(O02), O02);
                        }
                    }
                }
                rVar.c(gVar.f60623j, false);
                rVar.i(false, 1.0f);
                int i14 = i7 + 1;
                if (i14 < this.f60632n.size() && ((g) this.f60632n.get(i14)).f56712a != i12) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                rVar.setDivider(z10);
                if (i14 < this.f60632n.size() && ((g) this.f60632n.get(i14)).f56712a == 7) {
                    rVar.setDivider(false);
                }
                rVar.setOptions(gVar.f60626m);
                z0 z0Var = gVar.f60627n;
                z0 z0Var2 = gVar.f60628o;
                ImageView imageView = rVar.G;
                ImageView imageView2 = rVar.E;
                if (z0Var != null) {
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
                imageView2.setOnClickListener(z0Var);
                if (z0Var2 == null) {
                    z12 = false;
                }
                rVar.F = z12;
                if (z12 && rVar.H) {
                    i13 = 0;
                }
                imageView.setVisibility(i13);
                imageView.setOnClickListener(z0Var2);
                rVar.g(this.E, false);
            } else if (i12 == 6) {
                ah.c cVar = (ah.c) view;
                if (i7 >= this.f60632n.size() - 1 || (i10 = i7 + 1) >= this.f60632n.size() - 1 || ((g) this.f60632n.get(i10)).f56712a == 7) {
                    z12 = false;
                }
                cVar.f1059w = gVar.f60619e;
                cVar.f();
                cVar.setDivider(z12);
                cVar.c(gVar.f60623j, false);
            } else if (i12 == -1) {
                int i15 = gVar.f60624k;
                if (i15 < 0) {
                    i15 = (int) (g0.f24226q.y * 0.3f);
                }
                view.setLayoutParams(new q0(-1, i15));
            } else if (i12 == 7) {
                ((ah.f) view).setLetter(gVar.f60620f);
            } else if (i12 == 5) {
                try {
                    ((mv0) view).f37551b.getImageReceiver().Q0(false);
                } catch (Exception unused) {
                }
            } else if (i12 == 8) {
                y3 y3Var = (y3) view;
                if (TextUtils.equals(y3Var.getText(), gVar.f60620f)) {
                    String str2 = gVar.f60621g;
                    if (str2 == null) {
                        str2 = "";
                    }
                    y3Var.a(str2, gVar.f60625l);
                } else {
                    y3Var.setText(j6.p(gVar.f60620f, y3Var.getTextView(), null));
                    if (!TextUtils.isEmpty(gVar.f60621g)) {
                        String str3 = gVar.f60621g;
                        x0 x0Var = gVar.f60625l;
                        x3 x3Var = y3Var.f32554b;
                        x3Var.c(str3, false, true);
                        x3Var.setOnClickListener(x0Var);
                        x3Var.setVisibility(0);
                    }
                }
                this.f60635w = y3Var;
            } else if (i12 == 9) {
                m8 m8Var = (m8) view;
                m8Var.g(n6.f29786v6, n6.f29767u6);
                m8Var.o(gVar.f60622i, gVar.f60620f, false);
            } else if (i12 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != gVar.f60629p) {
                    g0.E2(gVar.f60629p);
                    frameLayout.addView(gVar.f60629p, na.c(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final f1 x(ViewGroup viewGroup, int i7) {
        r rVar;
        Context context = this.f60630e;
        if (i7 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            rVar = view;
        } else if (i7 == 3) {
            rVar = new r(this.f60630e, this.f60636x, this.f60637y, this.d, this.f60634s);
        } else {
            i6 i6Var = this.d;
            if (i7 == 5) {
                mv0 mv0Var = new mv0(context, null, 1, i6Var);
                mv0Var.d.setText(gd.N0(2131747974, null));
                mv0Var.f37553e.setText(gd.N0(2131745611, null));
                mv0Var.f37550a.setTranslationY(g0.L(24.0f));
                rVar = mv0Var;
            } else {
                boolean z10 = this.h;
                if (i7 == 7) {
                    ah.f fVar = new ah.f(context, i6Var);
                    fVar.setTag(-33024);
                    rVar = fVar;
                    if (z10) {
                        fVar.setBackground(null);
                        rVar = fVar;
                    }
                } else if (i7 == 6) {
                    ah.c cVar = new ah.c(context, i6Var);
                    cVar.setTag(-33024);
                    rVar = cVar;
                    if (z10) {
                        cVar.setBackground(null);
                        rVar = cVar;
                    }
                } else if (i7 == 8) {
                    y3 y3Var = new y3(context, i6Var);
                    y3Var.setTag(-33024);
                    rVar = y3Var;
                    if (z10) {
                        y3Var.setBackground(null);
                        rVar = y3Var;
                    }
                } else if (i7 == 9) {
                    m8 m8Var = new m8(context, i6Var);
                    m8Var.f31178n = 16;
                    m8Var.f31182x = 19;
                    rVar = m8Var;
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
        View view = f1Var.f59245a;
        if (view instanceof r) {
            ((r) view).g(this.E, false);
        }
    }
}
