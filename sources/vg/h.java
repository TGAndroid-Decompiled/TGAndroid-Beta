package vg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ci.k4;
import ig.k0;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.xp;
import s4.b1;
import s4.o0;
import ug.a1;
import w7.z5;
import yg.k;
public final class h extends pg.b {
    public final g6 d;
    public final Context e;
    public mm0 f48823f;
    public ArrayList f48824n;
    public boolean f48826s;
    public u3 v;
    public final boolean f48827w;
    public boolean f48828x;
    public final HashMap f48825r = new HashMap();
    public boolean f48829y = true;
    public final boolean h = true;

    public h(Context context, g6 g6Var, boolean z10) {
        this.e = context;
        this.f48827w = z10;
        this.d = g6Var;
        k0 k0Var = new k0(this, 24);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new u2.k0(6, messagesStorage, k0Var));
    }

    @Override
    public final boolean D(b1 b1Var) {
        int i10 = b1Var.f46346f;
        if (i10 != 3 && i10 != 6 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f20343id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f48825r;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f20343id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.f48824n;
        if (arrayList != null && !arrayList.isEmpty()) {
            m(this.f48824n.size() - 1);
        }
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f48824n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.f48824n;
        if (arrayList != null && i10 >= 0) {
            return ((g) arrayList.get(i10)).f44713a;
        }
        return -1;
    }

    @Override
    public final void v(b1 b1Var, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        ArrayList arrayList = this.f48824n;
        if (arrayList != null && i10 >= 0) {
            g gVar = (g) arrayList.get(i10);
            int i14 = b1Var.f46346f;
            View view = b1Var.f46343a;
            int i15 = 8;
            boolean z12 = true;
            if (i14 == 3) {
                k kVar = (k) view;
                Drawable drawable = gVar.f48822r;
                if (drawable != null) {
                    CharSequence charSequence = gVar.f48812g;
                    CharSequence charSequence2 = gVar.h;
                    kVar.f50610w.setVisibility(8);
                    kVar.H = null;
                    kVar.I = null;
                    w9 w9Var = kVar.f49401c;
                    w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    w9Var.setImageDrawable(drawable);
                    k4 k4Var = kVar.d;
                    k4Var.k(charSequence);
                    boolean[] zArr = kVar.f50609s;
                    zArr[0] = false;
                    kVar.setSubtitle(charSequence2);
                    n5 n5Var = kVar.e;
                    if (zArr[0]) {
                        i13 = k6.f21365n5;
                    } else {
                        i13 = k6.f21439r5;
                    }
                    r6.Z(n5Var, i13, kVar.f49399a);
                    xp xpVar = kVar.v;
                    if (xpVar != null) {
                        xpVar.setAlpha(1.0f);
                    }
                    k4Var.i(null);
                } else {
                    TLRPC.User user = gVar.f48810c;
                    if (user != null) {
                        kVar.setUser(user);
                        CharSequence charSequence3 = gVar.h;
                        if (charSequence3 != null) {
                            kVar.setSubtitle(charSequence3);
                            r6.Z(kVar.e, k6.f21439r5, this.d);
                        }
                    } else {
                        TLRPC.Chat chat = gVar.e;
                        if (chat != null) {
                            kVar.h(F(chat), chat);
                        } else {
                            TLRPC.InputPeer inputPeer = gVar.d;
                            if (inputPeer != null) {
                                if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                                    kVar.setUser(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                                    kVar.setUser(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(inputPeer.user_id)));
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                    TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                                    kVar.h(F(chat2), chat2);
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                    TLRPC.Chat chat3 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                                    kVar.h(F(chat3), chat3);
                                }
                            }
                        }
                    }
                }
                kVar.c(gVar.f48815k, false);
                kVar.i(1.0f, false);
                int i16 = i10 + 1;
                if (i16 < this.f48824n.size() && ((g) this.f48824n.get(i16)).f44713a != i14) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                kVar.setDivider(z10);
                if (i16 < this.f48824n.size() && ((g) this.f48824n.get(i16)).f44713a == 7) {
                    kVar.setDivider(false);
                }
                kVar.setOptions(gVar.f48818n);
                a1 a1Var = gVar.f48819o;
                a1 a1Var2 = gVar.f48820p;
                ImageView imageView = kVar.F;
                ImageView imageView2 = kVar.f50612y;
                if (a1Var != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                kVar.f50611x = z11;
                if (z11 && kVar.G) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView2.setVisibility(i12);
                imageView2.setOnClickListener(a1Var);
                if (a1Var2 == null) {
                    z12 = false;
                }
                kVar.E = z12;
                if (z12 && kVar.G) {
                    i15 = 0;
                }
                imageView.setVisibility(i15);
                imageView.setOnClickListener(a1Var2);
                kVar.g(this.f48829y, false);
            } else if (i14 == 6) {
                yg.b bVar = (yg.b) view;
                if (i10 >= this.f48824n.size() - 1 || (i11 = i10 + 1) >= this.f48824n.size() - 1 || ((g) this.f48824n.get(i11)).f44713a == 7) {
                    z12 = false;
                }
                bVar.v = gVar.f48811f;
                bVar.f();
                bVar.setDivider(z12);
                bVar.c(gVar.f48815k, false);
            } else if (i14 == -1) {
                int i17 = gVar.f48816l;
                if (i17 < 0) {
                    i17 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new o0(-1, i17));
            } else if (i14 == 7) {
                ((yg.d) view).setLetter(gVar.f48812g);
            } else if (i14 == 5) {
                try {
                    ((wx0) view).f32371b.getImageReceiver().startAnimation();
                } catch (Exception unused) {
                }
            } else if (i14 == 8) {
                u3 u3Var = (u3) view;
                if (TextUtils.equals(u3Var.getText(), gVar.f48812g)) {
                    CharSequence charSequence4 = gVar.h;
                    if (charSequence4 == null) {
                        charSequence4 = "";
                    }
                    u3Var.a(charSequence4, gVar.f48817m);
                } else {
                    u3Var.setText(Emoji.replaceWithRestrictedEmoji(gVar.f48812g, u3Var.getTextView(), (Runnable) null));
                    if (!TextUtils.isEmpty(gVar.h)) {
                        CharSequence charSequence5 = gVar.h;
                        org.telegram.ui.web.c cVar = gVar.f48817m;
                        t3 t3Var = u3Var.f23728b;
                        t3Var.c(charSequence5, false, true);
                        t3Var.setOnClickListener(cVar);
                        t3Var.setVisibility(0);
                    }
                }
                this.v = u3Var;
            } else if (i14 == 9) {
                r8 r8Var = (r8) view;
                r8Var.g(k6.f21516v6, k6.f21499u6);
                r8Var.o(gVar.f48814j, gVar.f48812g, false);
            } else if (i14 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != gVar.f48821q) {
                    AndroidUtilities.removeFromParent(gVar.f48821q);
                    frameLayout.addView(gVar.f48821q, z5.c(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final b1 x(ViewGroup viewGroup, int i10) {
        k kVar;
        Context context = this.e;
        if (i10 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            kVar = view;
        } else if (i10 == 3) {
            kVar = new k(this.e, this.f48827w, this.f48828x, this.d, this.f48826s);
        } else {
            g6 g6Var = this.d;
            if (i10 == 5) {
                wx0 wx0Var = new wx0(context, null, 1, g6Var);
                wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                wx0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                wx0Var.f32370a.setTranslationY(AndroidUtilities.dp(24.0f));
                kVar = wx0Var;
            } else {
                boolean z10 = this.h;
                if (i10 == 7) {
                    yg.d dVar = new yg.d(context, g6Var);
                    dVar.setTag(-33024);
                    kVar = dVar;
                    if (z10) {
                        dVar.setBackground(null);
                        kVar = dVar;
                    }
                } else if (i10 == 6) {
                    yg.b bVar = new yg.b(context, g6Var);
                    bVar.setTag(-33024);
                    kVar = bVar;
                    if (z10) {
                        bVar.setBackground(null);
                        kVar = bVar;
                    }
                } else if (i10 == 8) {
                    u3 u3Var = new u3(context, g6Var);
                    u3Var.setTag(-33024);
                    kVar = u3Var;
                    if (z10) {
                        u3Var.setBackground(null);
                        kVar = u3Var;
                    }
                } else if (i10 == 9) {
                    r8 r8Var = new r8(context, g6Var);
                    r8Var.f23112n = 16;
                    r8Var.f23115w = 19;
                    kVar = r8Var;
                } else if (i10 == 10) {
                    kVar = new FrameLayout(context);
                } else {
                    kVar = new View(context);
                }
            }
        }
        return new b1(kVar);
    }

    @Override
    public final void y(b1 b1Var) {
        View view = b1Var.f46343a;
        if (view instanceof k) {
            ((k) view).g(this.f48829y, false);
        }
    }
}
