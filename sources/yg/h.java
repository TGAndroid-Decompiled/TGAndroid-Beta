package yg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import bh.p;
import ei.e4;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.i6;
import org.telegram.messenger.qr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.zu0;
import u4.d1;
import u4.p0;
import xg.z0;
public final class h extends sg.b {
    public final e6 d;
    public final Context f59462e;
    public tj0 f59463f;
    public ArrayList f59464n;
    public boolean f59466s;
    public x3 f59467w;
    public final boolean f59468x;
    public boolean f59469y;
    public final HashMap f59465r = new HashMap();
    public boolean E = true;
    public final boolean h = true;

    public h(Context context, e6 e6Var, boolean z10) {
        this.f59462e = context;
        this.f59468x = z10;
        this.d = e6Var;
        xg.d dVar = new xg.d(this, 5);
        qr a02 = qr.a0(h10.f22829t0);
        a02.f24934a.c(new u9.a(25, a02, dVar));
    }

    @Override
    public final boolean D(d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 3 && i3 != 6 && i3 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i3;
        TLRPC.ChatFull N0 = hp.s1(h10.f22829t0).N0(chat.f27001id);
        if (N0 != null && (i3 = N0.participants_count) > 0) {
            return i3;
        }
        HashMap hashMap = this.f59465r;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f27001id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.f59464n;
        if (arrayList != null && !arrayList.isEmpty()) {
            g(this.f59464n.size() - 1);
        }
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f59464n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i3) {
        ArrayList arrayList = this.f59464n;
        if (arrayList != null && i3 >= 0) {
            return ((g) arrayList.get(i3)).f54715a;
        }
        return -1;
    }

    @Override
    public final void t(d1 d1Var, int i3) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        ArrayList arrayList = this.f59464n;
        if (arrayList != null && i3 >= 0) {
            g gVar = (g) arrayList.get(i3);
            int i13 = d1Var.f55544f;
            View view = d1Var.f55540a;
            int i14 = 8;
            boolean z12 = true;
            if (i13 == 3) {
                p pVar = (p) view;
                Drawable drawable = gVar.f59461r;
                if (drawable != null) {
                    CharSequence charSequence = gVar.f59451g;
                    CharSequence charSequence2 = gVar.h;
                    pVar.f3349x.setVisibility(8);
                    pVar.I = null;
                    pVar.J = null;
                    k9 k9Var = pVar.f60474c;
                    k9Var.setRoundRadius(g0.L(20.0f));
                    k9Var.setImageDrawable(drawable);
                    e4 e4Var = pVar.d;
                    e4Var.k(charSequence);
                    boolean[] zArr = pVar.f3347s;
                    zArr[0] = false;
                    pVar.setSubtitle(charSequence2);
                    k5 k5Var = pVar.f60475e;
                    if (zArr[0]) {
                        i12 = k6.f28061n5;
                    } else {
                        i12 = k6.r5;
                    }
                    r6.Y(k5Var, i12, pVar.f60472a);
                    wo woVar = pVar.f3348w;
                    if (woVar != null) {
                        woVar.setAlpha(1.0f);
                    }
                    e4Var.i(null);
                } else {
                    TLRPC.User user = gVar.f59448c;
                    if (user != null) {
                        pVar.setUser(user);
                        CharSequence charSequence3 = gVar.h;
                        if (charSequence3 != null) {
                            pVar.setSubtitle(charSequence3);
                            r6.Y(pVar.f60475e, k6.r5, this.d);
                        }
                    } else {
                        TLRPC.Chat chat = gVar.f59449e;
                        if (chat != null) {
                            pVar.h(F(chat), chat);
                        } else {
                            TLRPC.InputPeer inputPeer = gVar.d;
                            if (inputPeer != null) {
                                if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                                    pVar.setUser(h10.i(h10.f22829t0).f());
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                                    pVar.setUser(hp.s1(h10.f22829t0).a2(Long.valueOf(inputPeer.user_id)));
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                    TLRPC.Chat M0 = hp.s1(h10.f22829t0).M0(Long.valueOf(inputPeer.chat_id));
                                    pVar.h(F(M0), M0);
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                    TLRPC.Chat M02 = hp.s1(h10.f22829t0).M0(Long.valueOf(inputPeer.channel_id));
                                    pVar.h(F(M02), M02);
                                }
                            }
                        }
                    }
                }
                pVar.c(gVar.f59454k, false);
                pVar.i(false, 1.0f);
                int i15 = i3 + 1;
                if (i15 < this.f59464n.size() && ((g) this.f59464n.get(i15)).f54715a != i13) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                pVar.setDivider(z10);
                if (i15 < this.f59464n.size() && ((g) this.f59464n.get(i15)).f54715a == 7) {
                    pVar.setDivider(false);
                }
                pVar.setOptions(gVar.f59457n);
                z0 z0Var = gVar.f59458o;
                z0 z0Var2 = gVar.f59459p;
                ImageView imageView = pVar.G;
                ImageView imageView2 = pVar.E;
                if (z0Var != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                pVar.f3350y = z11;
                if (z11 && pVar.H) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView2.setVisibility(i11);
                imageView2.setOnClickListener(z0Var);
                if (z0Var2 == null) {
                    z12 = false;
                }
                pVar.F = z12;
                if (z12 && pVar.H) {
                    i14 = 0;
                }
                imageView.setVisibility(i14);
                imageView.setOnClickListener(z0Var2);
                pVar.g(this.E, false);
            } else if (i13 == 6) {
                bh.c cVar = (bh.c) view;
                if (i3 >= this.f59464n.size() - 1 || (i10 = i3 + 1) >= this.f59464n.size() - 1 || ((g) this.f59464n.get(i10)).f54715a == 7) {
                    z12 = false;
                }
                cVar.f3304w = gVar.f59450f;
                cVar.f();
                cVar.setDivider(z12);
                cVar.c(gVar.f59454k, false);
            } else if (i13 == -1) {
                int i16 = gVar.f59455l;
                if (i16 < 0) {
                    i16 = (int) (g0.f22608q.y * 0.3f);
                }
                view.setLayoutParams(new p0(-1, i16));
            } else if (i13 == 7) {
                ((bh.e) view).setLetter(gVar.f59451g);
            } else if (i13 == 5) {
                try {
                    ((zu0) view).f41126b.getImageReceiver().P0(false);
                } catch (Exception unused) {
                }
            } else if (i13 == 8) {
                x3 x3Var = (x3) view;
                if (TextUtils.equals(x3Var.getText(), gVar.f59451g)) {
                    CharSequence charSequence4 = gVar.h;
                    if (charSequence4 == null) {
                        charSequence4 = "";
                    }
                    x3Var.a(charSequence4, gVar.f59456m);
                } else {
                    x3Var.setText(i6.p(gVar.f59451g, x3Var.getTextView(), null));
                    if (!TextUtils.isEmpty(gVar.h)) {
                        CharSequence charSequence5 = gVar.h;
                        org.telegram.ui.web.d dVar = gVar.f59456m;
                        w3 w3Var = x3Var.f30950b;
                        w3Var.c(charSequence5, false, true);
                        w3Var.setOnClickListener(dVar);
                        w3Var.setVisibility(0);
                    }
                }
                this.f59467w = x3Var;
            } else if (i13 == 9) {
                l8 l8Var = (l8) view;
                l8Var.g(k6.f28214v6, k6.f28196u6);
                l8Var.o(gVar.f59453j, gVar.f59451g, false);
            } else if (i13 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != gVar.f59460q) {
                    g0.E2(gVar.f59460q);
                    frameLayout.addView(gVar.f59460q, mf.c(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i3) {
        p pVar;
        Context context = this.f59462e;
        if (i3 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            pVar = view;
        } else if (i3 == 3) {
            pVar = new p(this.f59462e, this.f59468x, this.f59469y, this.d, this.f59466s);
        } else {
            e6 e6Var = this.d;
            if (i3 == 5) {
                zu0 zu0Var = new zu0(context, null, 1, e6Var);
                zu0Var.d.setText(bd.M0(2131748175, null));
                zu0Var.f41128e.setText(bd.M0(2131745817, null));
                zu0Var.f41125a.setTranslationY(g0.L(24.0f));
                pVar = zu0Var;
            } else {
                boolean z10 = this.h;
                if (i3 == 7) {
                    bh.e eVar = new bh.e(context, e6Var);
                    eVar.setTag(-33024);
                    pVar = eVar;
                    if (z10) {
                        eVar.setBackground(null);
                        pVar = eVar;
                    }
                } else if (i3 == 6) {
                    bh.c cVar = new bh.c(context, e6Var);
                    cVar.setTag(-33024);
                    pVar = cVar;
                    if (z10) {
                        cVar.setBackground(null);
                        pVar = cVar;
                    }
                } else if (i3 == 8) {
                    x3 x3Var = new x3(context, e6Var);
                    x3Var.setTag(-33024);
                    pVar = x3Var;
                    if (z10) {
                        x3Var.setBackground(null);
                        pVar = x3Var;
                    }
                } else if (i3 == 9) {
                    l8 l8Var = new l8(context, e6Var);
                    l8Var.f29597n = 16;
                    l8Var.f29601x = 19;
                    pVar = l8Var;
                } else if (i3 == 10) {
                    pVar = new FrameLayout(context);
                } else {
                    pVar = new View(context);
                }
            }
        }
        return new d1(pVar);
    }

    @Override
    public final void y(d1 d1Var) {
        View view = d1Var.f55540a;
        if (view instanceof p) {
            ((p) view).g(this.E, false);
        }
    }
}
