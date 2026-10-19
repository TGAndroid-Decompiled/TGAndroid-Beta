package vg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ci.l4;
import ig.l0;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xp;
import qg.n;
import s4.b1;
import s4.o0;
import w7.z5;
import yg.k;
public final class h extends pg.b {
    public final d6 d;
    public final Context e;
    public im0 f48374f;
    public ArrayList f48375n;
    public boolean f48377s;
    public u3 v;
    public final boolean f48378w;
    public boolean f48379x;
    public final HashMap f48376r = new HashMap();
    public boolean f48380y = true;
    public final boolean h = true;

    public h(Context context, d6 d6Var, boolean z10) {
        this.e = context;
        this.f48378w = z10;
        this.d = d6Var;
        l0 l0Var = new l0(this, 24);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new uf.c(4, messagesStorage, l0Var));
    }

    @Override
    public final boolean D(b1 b1Var) {
        int i10 = b1Var.f45913f;
        if (i10 != 3 && i10 != 6 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f20275id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f48376r;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f20275id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.f48375n;
        if (arrayList != null && !arrayList.isEmpty()) {
            m(this.f48375n.size() - 1);
        }
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f48375n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.f48375n;
        if (arrayList != null && i10 >= 0) {
            return ((g) arrayList.get(i10)).f44286a;
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
        ArrayList arrayList = this.f48375n;
        if (arrayList != null && i10 >= 0) {
            g gVar = (g) arrayList.get(i10);
            int i14 = b1Var.f45913f;
            View view = b1Var.f45910a;
            int i15 = 8;
            boolean z12 = true;
            if (i14 == 3) {
                k kVar = (k) view;
                Drawable drawable = gVar.f48373r;
                if (drawable != null) {
                    CharSequence charSequence = gVar.f48363g;
                    CharSequence charSequence2 = gVar.h;
                    kVar.f50160w.setVisibility(8);
                    kVar.H = null;
                    kVar.I = null;
                    w9 w9Var = kVar.f48952c;
                    w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    w9Var.setImageDrawable(drawable);
                    l4 l4Var = kVar.d;
                    l4Var.k(charSequence);
                    boolean[] zArr = kVar.f50159s;
                    zArr[0] = false;
                    kVar.setSubtitle(charSequence2);
                    j5 j5Var = kVar.e;
                    if (zArr[0]) {
                        i13 = h6.f21171n5;
                    } else {
                        i13 = h6.f21245r5;
                    }
                    j5Var.setTextColor(h6.w0(i13, kVar.f48950a));
                    xp xpVar = kVar.v;
                    if (xpVar != null) {
                        xpVar.setAlpha(1.0f);
                    }
                    l4Var.i(null);
                } else {
                    TLRPC.User user = gVar.f48361c;
                    if (user != null) {
                        kVar.setUser(user);
                        CharSequence charSequence3 = gVar.h;
                        if (charSequence3 != null) {
                            kVar.setSubtitle(charSequence3);
                            kVar.e.setTextColor(h6.w0(h6.f21245r5, this.d));
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
                kVar.c(gVar.f48366k, false);
                kVar.i(1.0f, false);
                int i16 = i10 + 1;
                if (i16 < this.f48375n.size() && ((g) this.f48375n.get(i16)).f44286a != i14) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                kVar.setDivider(z10);
                if (i16 < this.f48375n.size() && ((g) this.f48375n.get(i16)).f44286a == 7) {
                    kVar.setDivider(false);
                }
                kVar.setOptions(gVar.f48369n);
                ug.b1 b1Var2 = gVar.f48370o;
                ug.b1 b1Var3 = gVar.f48371p;
                ImageView imageView = kVar.F;
                ImageView imageView2 = kVar.f50162y;
                if (b1Var2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                kVar.f50161x = z11;
                if (z11 && kVar.G) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView2.setVisibility(i12);
                imageView2.setOnClickListener(b1Var2);
                if (b1Var3 == null) {
                    z12 = false;
                }
                kVar.E = z12;
                if (z12 && kVar.G) {
                    i15 = 0;
                }
                imageView.setVisibility(i15);
                imageView.setOnClickListener(b1Var3);
                kVar.g(this.f48380y, false);
            } else if (i14 == 6) {
                yg.b bVar = (yg.b) view;
                if (i10 >= this.f48375n.size() - 1 || (i11 = i10 + 1) >= this.f48375n.size() - 1 || ((g) this.f48375n.get(i11)).f44286a == 7) {
                    z12 = false;
                }
                bVar.v = gVar.f48362f;
                bVar.f();
                bVar.setDivider(z12);
                bVar.c(gVar.f48366k, false);
            } else if (i14 == -1) {
                int i17 = gVar.f48367l;
                if (i17 < 0) {
                    i17 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new o0(-1, i17));
            } else if (i14 == 7) {
                ((yg.d) view).setLetter(gVar.f48363g);
            } else if (i14 == 5) {
                try {
                    ((sx0) view).f30353b.getImageReceiver().startAnimation();
                } catch (Exception unused) {
                }
            } else if (i14 == 8) {
                u3 u3Var = (u3) view;
                if (TextUtils.equals(u3Var.getText(), gVar.f48363g)) {
                    CharSequence charSequence4 = gVar.h;
                    if (charSequence4 == null) {
                        charSequence4 = "";
                    }
                    u3Var.b(charSequence4, gVar.f48368m);
                } else {
                    u3Var.setText(Emoji.replaceWithRestrictedEmoji(gVar.f48363g, u3Var.getTextView(), (Runnable) null));
                    if (!TextUtils.isEmpty(gVar.h)) {
                        CharSequence charSequence5 = gVar.h;
                        n nVar = gVar.f48368m;
                        t3 t3Var = u3Var.f23590b;
                        t3Var.c(charSequence5, false, true);
                        t3Var.setOnClickListener(nVar);
                        t3Var.setVisibility(0);
                    }
                }
                this.v = u3Var;
            } else if (i14 == 9) {
                q8 q8Var = (q8) view;
                q8Var.e(h6.f21322v6, h6.f21305u6);
                q8Var.m(gVar.f48365j, gVar.f48363g, false);
            } else if (i14 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != gVar.f48372q) {
                    AndroidUtilities.removeFromParent(gVar.f48372q);
                    frameLayout.addView(gVar.f48372q, z5.c(-2.0f, -1));
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
            kVar = new k(this.e, this.f48378w, this.f48379x, this.d, this.f48377s);
        } else {
            d6 d6Var = this.d;
            if (i10 == 5) {
                sx0 sx0Var = new sx0(context, null, 1, d6Var);
                sx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                sx0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                sx0Var.f30352a.setTranslationY(AndroidUtilities.dp(24.0f));
                kVar = sx0Var;
            } else {
                boolean z10 = this.h;
                if (i10 == 7) {
                    yg.d dVar = new yg.d(context, d6Var);
                    dVar.setTag(-33024);
                    kVar = dVar;
                    if (z10) {
                        dVar.setBackground(null);
                        kVar = dVar;
                    }
                } else if (i10 == 6) {
                    yg.b bVar = new yg.b(context, d6Var);
                    bVar.setTag(-33024);
                    kVar = bVar;
                    if (z10) {
                        bVar.setBackground(null);
                        kVar = bVar;
                    }
                } else if (i10 == 8) {
                    u3 u3Var = new u3(context, d6Var);
                    u3Var.setTag(-33024);
                    kVar = u3Var;
                    if (z10) {
                        u3Var.setBackground(null);
                        kVar = u3Var;
                    }
                } else if (i10 == 9) {
                    q8 q8Var = new q8(context, d6Var);
                    q8Var.f22785n = 16;
                    q8Var.f22788w = 19;
                    kVar = q8Var;
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
        View view = b1Var.f45910a;
        if (view instanceof k) {
            ((k) view).g(this.f48380y, false);
        }
    }
}
