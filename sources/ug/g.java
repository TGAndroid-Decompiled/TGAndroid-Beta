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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.web.b1;
import org.telegram.ui.xy0;
import s4.c1;
import s4.p0;
import tg.d1;
import w7.x5;
import xg.l;
public final class g extends og.b {
    public final f6 d;
    public final Context e;
    public ml0 f43759f;
    public ArrayList f43760n;
    public boolean f43762s;
    public u3 v;
    public final boolean f43763w;
    public boolean f43764x;
    public final HashMap f43761r = new HashMap();
    public boolean f43765y = true;
    public final boolean h = true;

    public g(Context context, f6 f6Var, boolean z10) {
        this.e = context;
        this.f43763w = z10;
        this.d = f6Var;
        b1 b1Var = new b1(this, 15);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new p2.b(20, messagesStorage, b1Var));
    }

    @Override
    public final boolean D(c1 c1Var) {
        int i10 = c1Var.f42700f;
        if (i10 != 3 && i10 != 6 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f18121id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f43761r;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f18121id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.f43760n;
        if (arrayList != null && !arrayList.isEmpty()) {
            m(this.f43760n.size() - 1);
        }
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f43760n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.f43760n;
        if (arrayList != null && i10 >= 0) {
            return ((f) arrayList.get(i10)).f15543a;
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
        ArrayList arrayList = this.f43760n;
        if (arrayList != null && i10 >= 0) {
            f fVar = (f) arrayList.get(i10);
            int i14 = c1Var.f42700f;
            View view = c1Var.f42697a;
            int i15 = 8;
            boolean z12 = true;
            if (i14 == 3) {
                l lVar = (l) view;
                pq pqVar = fVar.f43758r;
                if (pqVar != null) {
                    CharSequence charSequence = fVar.f43748g;
                    String str = fVar.h;
                    lVar.v.setVisibility(8);
                    lVar.G = null;
                    lVar.H = null;
                    u9 u9Var = lVar.f44332c;
                    u9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    u9Var.setImageDrawable(pqVar);
                    a6 a6Var = lVar.d;
                    a6Var.k(charSequence);
                    boolean[] zArr = lVar.f45808r;
                    zArr[0] = false;
                    lVar.setSubtitle(str);
                    k5 k5Var = lVar.e;
                    if (zArr[0]) {
                        i13 = j6.f19046n5;
                    } else {
                        i13 = j6.f19117r5;
                    }
                    k5Var.setTextColor(j6.v0(i13, lVar.f44330a));
                    np npVar = lVar.f45809s;
                    if (npVar != null) {
                        npVar.setAlpha(1.0f);
                    }
                    a6Var.i(null);
                } else {
                    TLRPC.User user = fVar.f43746c;
                    if (user != null) {
                        lVar.setUser(user);
                        String str2 = fVar.h;
                        if (str2 != null) {
                            lVar.setSubtitle(str2);
                            lVar.e.setTextColor(j6.v0(j6.f19117r5, this.d));
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
                lVar.c(fVar.f43751k, false);
                lVar.i(1.0f, false);
                int i16 = i10 + 1;
                if (i16 < this.f43760n.size() && ((f) this.f43760n.get(i16)).f15543a != i14) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                lVar.setDivider(z10);
                if (i16 < this.f43760n.size() && ((f) this.f43760n.get(i16)).f15543a == 7) {
                    lVar.setDivider(false);
                }
                lVar.setOptions(fVar.f43754n);
                d1 d1Var = fVar.f43755o;
                d1 d1Var2 = fVar.f43756p;
                ImageView imageView = lVar.E;
                ImageView imageView2 = lVar.f45811x;
                if (d1Var != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                lVar.f45810w = z11;
                if (z11 && lVar.F) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView2.setVisibility(i12);
                imageView2.setOnClickListener(d1Var);
                if (d1Var2 == null) {
                    z12 = false;
                }
                lVar.f45812y = z12;
                if (z12 && lVar.F) {
                    i15 = 0;
                }
                imageView.setVisibility(i15);
                imageView.setOnClickListener(d1Var2);
                lVar.g(this.f43765y, false);
            } else if (i14 == 6) {
                xg.b bVar = (xg.b) view;
                z12 = (i10 >= this.f43760n.size() - 1 || (i11 = i10 + 1) >= this.f43760n.size() - 1 || ((f) this.f43760n.get(i11)).f15543a == 7) ? false : false;
                bVar.f45777s = fVar.f43747f;
                bVar.f();
                bVar.setDivider(z12);
                bVar.c(fVar.f43751k, false);
            } else if (i14 == -1) {
                int i17 = fVar.f43752l;
                if (i17 < 0) {
                    i17 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new p0(-1, i17));
            } else if (i14 == 7) {
                ((xg.d) view).setLetter(fVar.f43748g);
            } else if (i14 == 5) {
                try {
                    ((zw0) view).f30673b.getImageReceiver().startAnimation();
                } catch (Exception unused) {
                }
            } else if (i14 == 8) {
                u3 u3Var = (u3) view;
                if (TextUtils.equals(u3Var.getText(), fVar.f43748g)) {
                    String str3 = fVar.h;
                    if (str3 == null) {
                        str3 = "";
                    }
                    u3Var.b(str3, fVar.f43753m);
                } else {
                    u3Var.setText(Emoji.replaceWithRestrictedEmoji(fVar.f43748g, u3Var.getTextView(), (Runnable) null));
                    if (!TextUtils.isEmpty(fVar.h)) {
                        String str4 = fVar.h;
                        xy0 xy0Var = fVar.f43753m;
                        t3 t3Var = u3Var.f21435b;
                        t3Var.c(str4, false, true);
                        t3Var.setOnClickListener(xy0Var);
                        t3Var.setVisibility(0);
                    }
                }
                this.v = u3Var;
            } else if (i14 == 9) {
                r8 r8Var = (r8) view;
                r8Var.e(j6.f19192v6, j6.f19174u6);
                r8Var.m(fVar.f43750j, fVar.f43748g, false);
            } else if (i14 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != fVar.f43757q) {
                    AndroidUtilities.removeFromParent(fVar.f43757q);
                    frameLayout.addView(fVar.f43757q, x5.c(-2.0f, -1));
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
            lVar = new l(this.e, this.f43763w, this.f43764x, this.d, this.f43762s);
        } else {
            f6 f6Var = this.d;
            if (i10 == 5) {
                zw0 zw0Var = new zw0(context, null, 1, f6Var);
                zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                zw0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                zw0Var.f30672a.setTranslationY(AndroidUtilities.dp(24.0f));
                lVar = zw0Var;
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
                    u3 u3Var = new u3(context, f6Var);
                    u3Var.setTag(-33024);
                    lVar = u3Var;
                    if (z10) {
                        u3Var.setBackground(null);
                        lVar = u3Var;
                    }
                } else if (i10 == 9) {
                    r8 r8Var = new r8(context, f6Var);
                    r8Var.f20818n = 16;
                    r8Var.f20821w = 19;
                    lVar = r8Var;
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
        View view = c1Var.f42697a;
        if (view instanceof l) {
            ((l) view).g(this.f43765y, false);
        }
    }
}
