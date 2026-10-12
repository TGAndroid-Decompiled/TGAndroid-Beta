package ug;

import ai.a6;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.web.f2;
import org.telegram.ui.xy0;
import s4.d1;
import s4.q0;
import tg.c1;
import w7.w5;
import xg.l;
public final class h extends og.b {
    public final c6 d;
    public final Context f49177e;
    public wm0 f49178f;
    public ArrayList f49179n;
    public boolean f49181s;
    public v3 v;
    public final boolean f49182w;
    public boolean f49183x;
    public final HashMap f49180r = new HashMap();
    public boolean f49184y = true;
    public final boolean h = true;

    public h(Context context, c6 c6Var, boolean z10) {
        this.f49177e = context;
        this.f49182w = z10;
        this.d = c6Var;
        q1 q1Var = new q1(this, 18);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new f2(29, messagesStorage, q1Var));
    }

    @Override
    public final boolean D(d1 d1Var) {
        int i10 = d1Var.f47901f;
        if (i10 != 3 && i10 != 6 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f19803id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f49180r;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f19803id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.f49179n;
        if (arrayList != null && !arrayList.isEmpty()) {
            m(this.f49179n.size() - 1);
        }
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f49179n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.f49179n;
        if (arrayList != null && i10 >= 0) {
            return ((g) arrayList.get(i10)).f16877a;
        }
        return -1;
    }

    @Override
    public final void v(d1 d1Var, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        ArrayList arrayList = this.f49179n;
        if (arrayList != null && i10 >= 0) {
            g gVar = (g) arrayList.get(i10);
            int i14 = d1Var.f47901f;
            View view = d1Var.f47897a;
            int i15 = 8;
            boolean z12 = true;
            if (i14 == 3) {
                l lVar = (l) view;
                hr hrVar = gVar.f49176r;
                if (hrVar != null) {
                    CharSequence charSequence = gVar.f49166g;
                    String str = gVar.h;
                    lVar.f51394w.setVisibility(8);
                    lVar.H = null;
                    lVar.I = null;
                    y9 y9Var = lVar.f49812c;
                    y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    y9Var.setImageDrawable(hrVar);
                    a6 a6Var = lVar.d;
                    a6Var.k(charSequence);
                    boolean[] zArr = lVar.f51393s;
                    zArr[0] = false;
                    lVar.setSubtitle(str);
                    h5 h5Var = lVar.f49813e;
                    if (zArr[0]) {
                        i13 = h6.f20744n5;
                    } else {
                        i13 = h6.f20818r5;
                    }
                    h5Var.setTextColor(h6.w0(i13, lVar.f49810a));
                    fq fqVar = lVar.v;
                    if (fqVar != null) {
                        fqVar.setAlpha(1.0f);
                    }
                    a6Var.i(null);
                } else {
                    TLRPC.User user = gVar.f49163c;
                    if (user != null) {
                        lVar.setUser(user);
                        String str2 = gVar.h;
                        if (str2 != null) {
                            lVar.setSubtitle(str2);
                            lVar.f49813e.setTextColor(h6.w0(h6.f20818r5, this.d));
                        }
                    } else {
                        TLRPC.Chat chat = gVar.f49164e;
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
                lVar.c(gVar.f49169k, false);
                lVar.i(1.0f, false);
                int i16 = i10 + 1;
                if (i16 < this.f49179n.size() && ((g) this.f49179n.get(i16)).f16877a != i14) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                lVar.setDivider(z10);
                if (i16 < this.f49179n.size() && ((g) this.f49179n.get(i16)).f16877a == 7) {
                    lVar.setDivider(false);
                }
                lVar.setOptions(gVar.f49172n);
                c1 c1Var = gVar.f49173o;
                c1 c1Var2 = gVar.f49174p;
                ImageView imageView = lVar.F;
                ImageView imageView2 = lVar.f51396y;
                if (c1Var != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                lVar.f51395x = z11;
                if (z11 && lVar.G) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView2.setVisibility(i12);
                imageView2.setOnClickListener(c1Var);
                if (c1Var2 == null) {
                    z12 = false;
                }
                lVar.E = z12;
                if (z12 && lVar.G) {
                    i15 = 0;
                }
                imageView.setVisibility(i15);
                imageView.setOnClickListener(c1Var2);
                lVar.g(this.f49184y, false);
            } else if (i14 == 6) {
                xg.b bVar = (xg.b) view;
                if (i10 >= this.f49179n.size() - 1 || (i11 = i10 + 1) >= this.f49179n.size() - 1 || ((g) this.f49179n.get(i11)).f16877a == 7) {
                    z12 = false;
                }
                bVar.v = gVar.f49165f;
                bVar.f();
                bVar.setDivider(z12);
                bVar.c(gVar.f49169k, false);
            } else if (i14 == -1) {
                int i17 = gVar.f49170l;
                if (i17 < 0) {
                    i17 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new q0(-1, i17));
            } else if (i14 == 7) {
                ((xg.d) view).setLetter(gVar.f49166g);
            } else if (i14 == 5) {
                try {
                    ((gy0) view).f26559b.getImageReceiver().startAnimation();
                } catch (Exception unused) {
                }
            } else if (i14 == 8) {
                v3 v3Var = (v3) view;
                if (TextUtils.equals(v3Var.getText(), gVar.f49166g)) {
                    String str3 = gVar.h;
                    if (str3 == null) {
                        str3 = "";
                    }
                    v3Var.b(str3, gVar.f49171m);
                } else {
                    v3Var.setText(Emoji.replaceWithRestrictedEmoji(gVar.f49166g, v3Var.getTextView(), (Runnable) null));
                    if (!TextUtils.isEmpty(gVar.h)) {
                        String str4 = gVar.h;
                        xy0 xy0Var = gVar.f49171m;
                        u3 u3Var = v3Var.f23310b;
                        u3Var.c(str4, false, true);
                        u3Var.setOnClickListener(xy0Var);
                        u3Var.setVisibility(0);
                    }
                }
                this.v = v3Var;
            } else if (i14 == 9) {
                r8 r8Var = (r8) view;
                r8Var.e(h6.f20893v6, h6.f20875u6);
                r8Var.m(gVar.f49168j, gVar.f49166g, false);
            } else if (i14 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != gVar.f49175q) {
                    AndroidUtilities.removeFromParent(gVar.f49175q);
                    frameLayout.addView(gVar.f49175q, w5.d(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i10) {
        l lVar;
        Context context = this.f49177e;
        if (i10 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            lVar = view;
        } else if (i10 == 3) {
            lVar = new l(this.f49177e, this.f49182w, this.f49183x, this.d, this.f49181s);
        } else {
            c6 c6Var = this.d;
            if (i10 == 5) {
                gy0 gy0Var = new gy0(context, null, 1, c6Var);
                gy0Var.d.setText(LocaleController.getString(R.string.NoResult));
                gy0Var.f26561e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                gy0Var.f26558a.setTranslationY(AndroidUtilities.dp(24.0f));
                lVar = gy0Var;
            } else {
                boolean z10 = this.h;
                if (i10 == 7) {
                    xg.d dVar = new xg.d(context, c6Var);
                    dVar.setTag(-33024);
                    lVar = dVar;
                    if (z10) {
                        dVar.setBackground(null);
                        lVar = dVar;
                    }
                } else if (i10 == 6) {
                    xg.b bVar = new xg.b(context, c6Var);
                    bVar.setTag(-33024);
                    lVar = bVar;
                    if (z10) {
                        bVar.setBackground(null);
                        lVar = bVar;
                    }
                } else if (i10 == 8) {
                    v3 v3Var = new v3(context, c6Var);
                    v3Var.setTag(-33024);
                    lVar = v3Var;
                    if (z10) {
                        v3Var.setBackground(null);
                        lVar = v3Var;
                    }
                } else if (i10 == 9) {
                    r8 r8Var = new r8(context, c6Var);
                    r8Var.f22486n = 16;
                    r8Var.f22489w = 19;
                    lVar = r8Var;
                } else if (i10 == 10) {
                    lVar = new FrameLayout(context);
                } else {
                    lVar = new View(context);
                }
            }
        }
        return new d1(lVar);
    }

    @Override
    public final void y(d1 d1Var) {
        View view = d1Var.f47897a;
        if (view instanceof l) {
            ((l) view).g(this.f49184y, false);
        }
    }
}
