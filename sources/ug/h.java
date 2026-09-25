package ug;

import ai.z5;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ii.q1;
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
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.ny0;
import org.telegram.ui.web.o1;
import s4.c1;
import s4.p0;
import w7.y5;
import xg.l;
public final class h extends og.b {
    public final d6 d;
    public final Context e;
    public wl0 f44023f;
    public ArrayList f44024n;
    public boolean f44026s;
    public v3 v;
    public final boolean f44027w;
    public boolean f44028x;
    public final HashMap f44025r = new HashMap();
    public boolean f44029y = true;
    public final boolean h = true;

    public h(Context context, d6 d6Var, boolean z10) {
        this.e = context;
        this.f44027w = z10;
        this.d = d6Var;
        q1 q1Var = new q1(this, 18);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new o1(25, messagesStorage, q1Var));
    }

    @Override
    public final boolean D(c1 c1Var) {
        int i10 = c1Var.f42964f;
        if (i10 != 3 && i10 != 6 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f18336id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f44025r;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f18336id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.f44024n;
        if (arrayList != null && !arrayList.isEmpty()) {
            m(this.f44024n.size() - 1);
        }
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f44024n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.f44024n;
        if (arrayList != null && i10 >= 0) {
            return ((g) arrayList.get(i10)).f15715a;
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
        ArrayList arrayList = this.f44024n;
        if (arrayList != null && i10 >= 0) {
            g gVar = (g) arrayList.get(i10);
            int i14 = c1Var.f42964f;
            View view = c1Var.f42961a;
            int i15 = 8;
            boolean z12 = true;
            if (i14 == 3) {
                l lVar = (l) view;
                qq qqVar = gVar.f44022r;
                if (qqVar != null) {
                    CharSequence charSequence = gVar.f44012g;
                    String str = gVar.h;
                    lVar.v.setVisibility(8);
                    lVar.G = null;
                    lVar.H = null;
                    w9 w9Var = lVar.f44591c;
                    w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    w9Var.setImageDrawable(qqVar);
                    z5 z5Var = lVar.d;
                    z5Var.k(charSequence);
                    boolean[] zArr = lVar.f46064r;
                    zArr[0] = false;
                    lVar.setSubtitle(str);
                    h5 h5Var = lVar.e;
                    if (zArr[0]) {
                        i13 = h6.f19243n5;
                    } else {
                        i13 = h6.f19316r5;
                    }
                    h5Var.setTextColor(h6.v0(i13, lVar.f44589a));
                    op opVar = lVar.f46065s;
                    if (opVar != null) {
                        opVar.setAlpha(1.0f);
                    }
                    z5Var.i(null);
                } else {
                    TLRPC.User user = gVar.f44010c;
                    if (user != null) {
                        lVar.setUser(user);
                        String str2 = gVar.h;
                        if (str2 != null) {
                            lVar.setSubtitle(str2);
                            lVar.e.setTextColor(h6.v0(h6.f19316r5, this.d));
                        }
                    } else {
                        TLRPC.Chat chat = gVar.e;
                        if (chat != null) {
                            lVar.h(F(chat), chat);
                        } else {
                            TLRPC.InputPeer inputPeer = gVar.d;
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
                lVar.c(gVar.f44015k, false);
                lVar.i(1.0f, false);
                int i16 = i10 + 1;
                if (i16 < this.f44024n.size() && ((g) this.f44024n.get(i16)).f15715a != i14) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                lVar.setDivider(z10);
                if (i16 < this.f44024n.size() && ((g) this.f44024n.get(i16)).f15715a == 7) {
                    lVar.setDivider(false);
                }
                lVar.setOptions(gVar.f44018n);
                tg.c1 c1Var2 = gVar.f44019o;
                tg.c1 c1Var3 = gVar.f44020p;
                ImageView imageView = lVar.E;
                ImageView imageView2 = lVar.f46067x;
                if (c1Var2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                lVar.f46066w = z11;
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
                lVar.f46068y = z12;
                if (z12 && lVar.F) {
                    i15 = 0;
                }
                imageView.setVisibility(i15);
                imageView.setOnClickListener(c1Var3);
                lVar.g(this.f44029y, false);
            } else if (i14 == 6) {
                xg.b bVar = (xg.b) view;
                z12 = (i10 >= this.f44024n.size() - 1 || (i11 = i10 + 1) >= this.f44024n.size() - 1 || ((g) this.f44024n.get(i11)).f15715a == 7) ? false : false;
                bVar.f46033s = gVar.f44011f;
                bVar.f();
                bVar.setDivider(z12);
                bVar.c(gVar.f44015k, false);
            } else if (i14 == -1) {
                int i17 = gVar.f44016l;
                if (i17 < 0) {
                    i17 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new p0(-1, i17));
            } else if (i14 == 7) {
                ((xg.d) view).setLetter(gVar.f44012g);
            } else if (i14 == 5) {
                try {
                    ((ix0) view).f25190b.getImageReceiver().startAnimation();
                } catch (Exception unused) {
                }
            } else if (i14 == 8) {
                v3 v3Var = (v3) view;
                if (TextUtils.equals(v3Var.getText(), gVar.f44012g)) {
                    String str3 = gVar.h;
                    if (str3 == null) {
                        str3 = "";
                    }
                    v3Var.b(str3, gVar.f44017m);
                } else {
                    v3Var.setText(Emoji.replaceWithRestrictedEmoji(gVar.f44012g, v3Var.getTextView(), (Runnable) null));
                    if (!TextUtils.isEmpty(gVar.h)) {
                        String str4 = gVar.h;
                        ny0 ny0Var = gVar.f44017m;
                        u3 u3Var = v3Var.f21680b;
                        u3Var.c(str4, false, true);
                        u3Var.setOnClickListener(ny0Var);
                        u3Var.setVisibility(0);
                    }
                }
                this.v = v3Var;
            } else if (i14 == 9) {
                r8 r8Var = (r8) view;
                r8Var.e(h6.f19391v6, h6.f19373u6);
                r8Var.m(gVar.f44014j, gVar.f44012g, false);
            } else if (i14 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != gVar.f44021q) {
                    AndroidUtilities.removeFromParent(gVar.f44021q);
                    frameLayout.addView(gVar.f44021q, y5.c(-2.0f, -1));
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
            lVar = new l(this.e, this.f44027w, this.f44028x, this.d, this.f44026s);
        } else {
            d6 d6Var = this.d;
            if (i10 == 5) {
                ix0 ix0Var = new ix0(context, null, 1, d6Var);
                ix0Var.d.setText(LocaleController.getString(R.string.NoResult));
                ix0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                ix0Var.f25189a.setTranslationY(AndroidUtilities.dp(24.0f));
                lVar = ix0Var;
            } else {
                boolean z10 = this.h;
                if (i10 == 7) {
                    xg.d dVar = new xg.d(context, d6Var);
                    dVar.setTag(-33024);
                    lVar = dVar;
                    if (z10) {
                        dVar.setBackground(null);
                        lVar = dVar;
                    }
                } else if (i10 == 6) {
                    xg.b bVar = new xg.b(context, d6Var);
                    bVar.setTag(-33024);
                    lVar = bVar;
                    if (z10) {
                        bVar.setBackground(null);
                        lVar = bVar;
                    }
                } else if (i10 == 8) {
                    v3 v3Var = new v3(context, d6Var);
                    v3Var.setTag(-33024);
                    lVar = v3Var;
                    if (z10) {
                        v3Var.setBackground(null);
                        lVar = v3Var;
                    }
                } else if (i10 == 9) {
                    r8 r8Var = new r8(context, d6Var);
                    r8Var.f20879n = 16;
                    r8Var.f20882w = 19;
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
        View view = c1Var.f42961a;
        if (view instanceof l) {
            ((l) view).g(this.f44029y, false);
        }
    }
}
