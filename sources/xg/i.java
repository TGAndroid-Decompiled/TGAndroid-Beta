package xg;

import ah.r;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ja;
import fi.w3;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.vr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.sc1;
import ug.p1;
import ug.t1;
import v4.e1;
import v4.p0;
import wg.x0;
public final class i extends rg.b {
    public final e6 d;
    public final Context f59936e;
    public uj0 f59937f;
    public ArrayList f59938n;
    public boolean f59940s;
    public x3 f59941w;
    public final boolean f59942x;
    public boolean f59943y;
    public final HashMap f59939r = new HashMap();
    public boolean E = true;
    public final boolean h = true;

    public i(Context context, e6 e6Var, boolean z10) {
        this.f59936e = context;
        this.f59942x = z10;
        this.d = e6Var;
        p1 p1Var = new p1(this, 7);
        vr a02 = vr.a0(m10.f24934t0);
        a02.f27220a.c(new t1(7, a02, p1Var));
    }

    @Override
    public final boolean D(e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 3 && i7 != 6 && i7 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull N0 = np.s1(m10.f24934t0).N0(chat.f28051id);
        if (N0 != null && (i7 = N0.participants_count) > 0) {
            return i7;
        }
        HashMap hashMap = this.f59939r;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f28051id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.f59938n;
        if (arrayList != null && !arrayList.isEmpty()) {
            g(this.f59938n.size() - 1);
        }
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f59938n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i7) {
        ArrayList arrayList = this.f59938n;
        if (arrayList != null && i7 >= 0) {
            return ((h) arrayList.get(i7)).f56015a;
        }
        return -1;
    }

    @Override
    public final void t(e1 e1Var, int i7) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        ArrayList arrayList = this.f59938n;
        if (arrayList != null && i7 >= 0) {
            h hVar = (h) arrayList.get(i7);
            int i13 = e1Var.f58539f;
            View view = e1Var.f58535a;
            int i14 = 8;
            boolean z12 = true;
            if (i13 == 3) {
                r rVar = (r) view;
                Drawable drawable = hVar.f59935r;
                if (drawable != null) {
                    CharSequence charSequence = hVar.f59925g;
                    CharSequence charSequence2 = hVar.h;
                    rVar.f1110x.setVisibility(8);
                    rVar.I = null;
                    rVar.J = null;
                    i9 i9Var = rVar.f60645c;
                    i9Var.setRoundRadius(g0.L(20.0f));
                    i9Var.setImageDrawable(drawable);
                    w3 w3Var = rVar.d;
                    w3Var.k(charSequence);
                    boolean[] zArr = rVar.f1108s;
                    zArr[0] = false;
                    rVar.setSubtitle(charSequence2);
                    j5 j5Var = rVar.f60646e;
                    if (zArr[0]) {
                        i12 = j6.f29030n5;
                    } else {
                        i12 = j6.f29107r5;
                    }
                    q6.X(j5Var, i12, rVar.f60643a);
                    fp fpVar = rVar.f1109w;
                    if (fpVar != null) {
                        fpVar.setAlpha(1.0f);
                    }
                    w3Var.i(null);
                } else {
                    TLRPC.User user = hVar.f59922c;
                    if (user != null) {
                        rVar.setUser(user);
                        CharSequence charSequence3 = hVar.h;
                        if (charSequence3 != null) {
                            rVar.setSubtitle(charSequence3);
                            q6.X(rVar.f60646e, j6.f29107r5, this.d);
                        }
                    } else {
                        TLRPC.Chat chat = hVar.f59923e;
                        if (chat != null) {
                            rVar.h(F(chat), chat);
                        } else {
                            TLRPC.InputPeer inputPeer = hVar.d;
                            if (inputPeer != null) {
                                if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                                    rVar.setUser(m10.i(m10.f24934t0).f());
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                                    rVar.setUser(np.s1(m10.f24934t0).a2(Long.valueOf(inputPeer.user_id)));
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                    TLRPC.Chat M0 = np.s1(m10.f24934t0).M0(Long.valueOf(inputPeer.chat_id));
                                    rVar.h(F(M0), M0);
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                    TLRPC.Chat M02 = np.s1(m10.f24934t0).M0(Long.valueOf(inputPeer.channel_id));
                                    rVar.h(F(M02), M02);
                                }
                            }
                        }
                    }
                }
                rVar.c(hVar.f59928k, false);
                rVar.i(false, 1.0f);
                int i15 = i7 + 1;
                if (i15 < this.f59938n.size() && ((h) this.f59938n.get(i15)).f56015a != i13) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                rVar.setDivider(z10);
                if (i15 < this.f59938n.size() && ((h) this.f59938n.get(i15)).f56015a == 7) {
                    rVar.setDivider(false);
                }
                rVar.setOptions(hVar.f59931n);
                x0 x0Var = hVar.f59932o;
                x0 x0Var2 = hVar.f59933p;
                ImageView imageView = rVar.G;
                ImageView imageView2 = rVar.E;
                if (x0Var != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                rVar.f1111y = z11;
                if (z11 && rVar.H) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView2.setVisibility(i11);
                imageView2.setOnClickListener(x0Var);
                if (x0Var2 == null) {
                    z12 = false;
                }
                rVar.F = z12;
                if (z12 && rVar.H) {
                    i14 = 0;
                }
                imageView.setVisibility(i14);
                imageView.setOnClickListener(x0Var2);
                rVar.g(this.E, false);
            } else if (i13 == 6) {
                ah.c cVar = (ah.c) view;
                if (i7 >= this.f59938n.size() - 1 || (i10 = i7 + 1) >= this.f59938n.size() - 1 || ((h) this.f59938n.get(i10)).f56015a == 7) {
                    z12 = false;
                }
                cVar.f1060w = hVar.f59924f;
                cVar.f();
                cVar.setDivider(z12);
                cVar.c(hVar.f59928k, false);
            } else if (i13 == -1) {
                int i16 = hVar.f59929l;
                if (i16 < 0) {
                    i16 = (int) (g0.f23609q.y * 0.3f);
                }
                view.setLayoutParams(new p0(-1, i16));
            } else if (i13 == 7) {
                ((ah.f) view).setLetter(hVar.f59925g);
            } else if (i13 == 5) {
                try {
                    ((cv0) view).f33705b.getImageReceiver().P0(false);
                } catch (Exception unused) {
                }
            } else if (i13 == 8) {
                x3 x3Var = (x3) view;
                if (TextUtils.equals(x3Var.getText(), hVar.f59925g)) {
                    CharSequence charSequence4 = hVar.h;
                    if (charSequence4 == null) {
                        charSequence4 = "";
                    }
                    x3Var.a(charSequence4, hVar.f59930m);
                } else {
                    x3Var.setText(org.telegram.messenger.j6.p(hVar.f59925g, x3Var.getTextView(), null));
                    if (!TextUtils.isEmpty(hVar.h)) {
                        CharSequence charSequence5 = hVar.h;
                        sc1 sc1Var = hVar.f59930m;
                        org.telegram.ui.Cells.w3 w3Var2 = x3Var.f32026b;
                        w3Var2.c(charSequence5, false, true);
                        w3Var2.setOnClickListener(sc1Var);
                        w3Var2.setVisibility(0);
                    }
                }
                this.f59941w = x3Var;
            } else if (i13 == 9) {
                l8 l8Var = (l8) view;
                l8Var.g(j6.f29184v6, j6.f29165u6);
                l8Var.o(hVar.f59927j, hVar.f59925g, false);
            } else if (i13 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != hVar.f59934q) {
                    g0.E2(hVar.f59934q);
                    frameLayout.addView(hVar.f59934q, ja.c(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final e1 x(ViewGroup viewGroup, int i7) {
        r rVar;
        Context context = this.f59936e;
        if (i7 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            rVar = view;
        } else if (i7 == 3) {
            rVar = new r(this.f59936e, this.f59942x, this.f59943y, this.d, this.f59940s);
        } else {
            e6 e6Var = this.d;
            if (i7 == 5) {
                cv0 cv0Var = new cv0(context, null, 1, e6Var);
                cv0Var.d.setText(hd.M0(2131748167, null));
                cv0Var.f33707e.setText(hd.M0(2131745807, null));
                cv0Var.f33704a.setTranslationY(g0.L(24.0f));
                rVar = cv0Var;
            } else {
                boolean z10 = this.h;
                if (i7 == 7) {
                    ah.f fVar = new ah.f(context, e6Var);
                    fVar.setTag(-33024);
                    rVar = fVar;
                    if (z10) {
                        fVar.setBackground(null);
                        rVar = fVar;
                    }
                } else if (i7 == 6) {
                    ah.c cVar = new ah.c(context, e6Var);
                    cVar.setTag(-33024);
                    rVar = cVar;
                    if (z10) {
                        cVar.setBackground(null);
                        rVar = cVar;
                    }
                } else if (i7 == 8) {
                    x3 x3Var = new x3(context, e6Var);
                    x3Var.setTag(-33024);
                    rVar = x3Var;
                    if (z10) {
                        x3Var.setBackground(null);
                        rVar = x3Var;
                    }
                } else if (i7 == 9) {
                    l8 l8Var = new l8(context, e6Var);
                    l8Var.f30658n = 16;
                    l8Var.f30662x = 19;
                    rVar = l8Var;
                } else if (i7 == 10) {
                    rVar = new FrameLayout(context);
                } else {
                    rVar = new View(context);
                }
            }
        }
        return new e1(rVar);
    }

    @Override
    public final void y(e1 e1Var) {
        View view = e1Var.f58535a;
        if (view instanceof r) {
            ((r) view).g(this.E, false);
        }
    }
}
