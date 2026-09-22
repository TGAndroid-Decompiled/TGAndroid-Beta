package ug;

import ai.a6;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.vy0;
import org.telegram.ui.web.b1;
import org.telegram.ui.web.g1;
import s4.c1;
import s4.p0;
import w7.y5;
import xg.l;
public final class g extends og.b {
    public final f6 d;
    public final Context e;
    public yl0 f44059f;
    public ArrayList f44060n;
    public boolean f44062s;
    public w3 v;
    public final boolean f44063w;
    public boolean f44064x;
    public final HashMap f44061r = new HashMap();
    public boolean f44065y = true;
    public final boolean h = true;

    public g(Context context, f6 f6Var, boolean z10) {
        this.e = context;
        this.f44063w = z10;
        this.d = f6Var;
        b1 b1Var = new b1(this, 15);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new g1(26, messagesStorage, b1Var));
    }

    @Override
    public final boolean D(c1 c1Var) {
        int i10 = c1Var.f42998f;
        if (i10 != 3 && i10 != 6 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f18343id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f44061r;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f18343id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.f44060n;
        if (arrayList != null && !arrayList.isEmpty()) {
            m(this.f44060n.size() - 1);
        }
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f44060n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.f44060n;
        if (arrayList != null && i10 >= 0) {
            return ((f) arrayList.get(i10)).f15719a;
        }
        return -1;
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        ArrayList arrayList = this.f44060n;
        if (arrayList != null && i10 >= 0) {
            f fVar = (f) arrayList.get(i10);
            int i14 = c1Var.f42998f;
            View view = c1Var.f42995a;
            int i15 = 8;
            boolean z12 = true;
            if (i14 == 3) {
                l lVar = (l) view;
                pq pqVar = fVar.f44058r;
                if (pqVar != null) {
                    CharSequence charSequence = fVar.f44048g;
                    String str = fVar.h;
                    lVar.v.setVisibility(8);
                    lVar.G = null;
                    lVar.H = null;
                    v9 v9Var = lVar.f44628c;
                    v9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    v9Var.setImageDrawable(pqVar);
                    a6 a6Var = lVar.d;
                    a6Var.k(charSequence);
                    boolean[] zArr = lVar.f46104r;
                    zArr[0] = false;
                    lVar.setSubtitle(str);
                    j5 j5Var = lVar.e;
                    if (zArr[0]) {
                        i13 = j6.f19293n5;
                    } else {
                        i13 = j6.f19365r5;
                    }
                    j5Var.setTextColor(j6.v0(i13, lVar.f44626a));
                    np npVar = lVar.f46105s;
                    if (npVar != null) {
                        npVar.setAlpha(1.0f);
                    }
                    a6Var.i(null);
                } else {
                    TLRPC.User user = fVar.f44046c;
                    if (user != null) {
                        lVar.setUser(user);
                        String str2 = fVar.h;
                        if (str2 != null) {
                            lVar.setSubtitle(str2);
                            lVar.e.setTextColor(j6.v0(j6.f19365r5, this.d));
                        }
                    } else {
                        TLRPC.Chat chat = fVar.e;
                        if (chat != null) {
                            lVar.h(F(chat), chat);
                        } else {
                            TLRPC.InputPeer inputPeer = fVar.d;
                            if (inputPeer != null) {
                                if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                                    lVar.setUser(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                                    lVar.setUser(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(inputPeer.user_id)));
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                    TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                                    lVar.h(F(chat2), chat2);
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                    TLRPC.Chat chat3 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                                    lVar.h(F(chat3), chat3);
                                }
                            }
                        }
                    }
                }
                lVar.c(fVar.f44051k, false);
                lVar.i(1.0f, false);
                int i16 = i10 + 1;
                if (i16 < this.f44060n.size() && ((f) this.f44060n.get(i16)).f15719a != i14) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                lVar.setDivider(z10);
                if (i16 < this.f44060n.size() && ((f) this.f44060n.get(i16)).f15719a == 7) {
                    lVar.setDivider(false);
                }
                lVar.setOptions(fVar.f44054n);
                tg.c1 c1Var2 = fVar.f44055o;
                tg.c1 c1Var3 = fVar.f44056p;
                ImageView imageView = lVar.E;
                ImageView imageView2 = lVar.f46107x;
                if (c1Var2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                lVar.f46106w = z11;
                if (z11 && lVar.F) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView2.setVisibility(i12);
                imageView2.setOnClickListener(c1Var2);
                if (c1Var3 == null) {
                    z12 = false;
                }
                lVar.f46108y = z12;
                if (z12 && lVar.F) {
                    i15 = 0;
                }
                imageView.setVisibility(i15);
                imageView.setOnClickListener(c1Var3);
                lVar.g(this.f44065y, false);
            } else if (i14 == 6) {
                xg.b bVar = (xg.b) view;
                z12 = (i10 >= this.f44060n.size() - 1 || (i11 = i10 + 1) >= this.f44060n.size() - 1 || ((f) this.f44060n.get(i11)).f15719a == 7) ? false : false;
                bVar.f46073s = fVar.f44047f;
                bVar.f();
                bVar.setDivider(z12);
                bVar.c(fVar.f44051k, false);
            } else if (i14 == -1) {
                int i17 = fVar.f44052l;
                if (i17 < 0) {
                    i17 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new p0(-1, i17));
            } else if (i14 == 7) {
                ((xg.d) view).setLetter(fVar.f44048g);
            } else if (i14 == 5) {
                try {
                    ((lx0) view).f26252b.getImageReceiver().startAnimation();
                } catch (Exception unused) {
                }
            } else if (i14 == 8) {
                w3 w3Var = (w3) view;
                if (TextUtils.equals(w3Var.getText(), fVar.f44048g)) {
                    String str3 = fVar.h;
                    if (str3 == null) {
                        str3 = "";
                    }
                    w3Var.b(str3, fVar.f44053m);
                } else {
                    w3Var.setText(Emoji.replaceWithRestrictedEmoji(fVar.f44048g, w3Var.getTextView(), (Runnable) null));
                    if (!TextUtils.isEmpty(fVar.h)) {
                        String str4 = fVar.h;
                        vy0 vy0Var = fVar.f44053m;
                        v3 v3Var = w3Var.f21802b;
                        v3Var.c(str4, false, true);
                        v3Var.setOnClickListener(vy0Var);
                        v3Var.setVisibility(0);
                    }
                }
                this.v = w3Var;
            } else if (i14 == 9) {
                s8 s8Var = (s8) view;
                s8Var.e(j6.f19440v6, j6.f19422u6);
                s8Var.m(fVar.f44050j, fVar.f44048g, false);
            } else if (i14 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != fVar.f44057q) {
                    AndroidUtilities.removeFromParent(fVar.f44057q);
                    frameLayout.addView(fVar.f44057q, y5.c(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        l lVar;
        Context context = this.e;
        if (i10 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            lVar = view;
        } else if (i10 == 3) {
            lVar = new l(this.e, this.f44063w, this.f44064x, this.d, this.f44062s);
        } else {
            f6 f6Var = this.d;
            if (i10 == 5) {
                lx0 lx0Var = new lx0(context, null, 1, f6Var);
                lx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                lx0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                lx0Var.f26251a.setTranslationY(AndroidUtilities.dp(24.0f));
                lVar = lx0Var;
            } else {
                boolean z10 = this.h;
                if (i10 == 7) {
                    xg.d dVar = new xg.d(context, f6Var);
                    dVar.setTag(-33024);
                    lVar = dVar;
                    if (z10) {
                        dVar.setBackground(null);
                        lVar = dVar;
                    }
                } else if (i10 == 6) {
                    xg.b bVar = new xg.b(context, f6Var);
                    bVar.setTag(-33024);
                    lVar = bVar;
                    if (z10) {
                        bVar.setBackground(null);
                        lVar = bVar;
                    }
                } else if (i10 == 8) {
                    w3 w3Var = new w3(context, f6Var);
                    w3Var.setTag(-33024);
                    lVar = w3Var;
                    if (z10) {
                        w3Var.setBackground(null);
                        lVar = w3Var;
                    }
                } else if (i10 == 9) {
                    s8 s8Var = new s8(context, f6Var);
                    s8Var.f21079n = 16;
                    s8Var.f21082w = 19;
                    lVar = s8Var;
                } else if (i10 == 10) {
                    lVar = new FrameLayout(context);
                } else {
                    lVar = new View(context);
                }
            }
        }
        return new c1(lVar);
    }

    @Override
    public final void y(c1 c1Var) {
        View view = c1Var.f42995a;
        if (view instanceof l) {
            ((l) view).g(this.f44065y, false);
        }
    }
}
