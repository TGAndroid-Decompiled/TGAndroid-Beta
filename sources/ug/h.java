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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.ay0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.vy0;
import org.telegram.ui.web.w1;
import s4.d1;
import s4.q0;
import tg.c1;
import w7.x5;
import xg.l;
public final class h extends og.b {
    public final e6 d;
    public final Context f48939e;
    public qm0 f48940f;
    public ArrayList f48941n;
    public boolean f48943s;
    public v3 v;
    public final boolean f48944w;
    public boolean f48945x;
    public final HashMap f48942r = new HashMap();
    public boolean f48946y = true;
    public final boolean h = true;

    public h(Context context, e6 e6Var, boolean z10) {
        this.f48939e = context;
        this.f48944w = z10;
        this.d = e6Var;
        q1 q1Var = new q1(this, 18);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new w1(25, messagesStorage, q1Var));
    }

    @Override
    public final boolean D(d1 d1Var) {
        int i10 = d1Var.f47660f;
        if (i10 != 3 && i10 != 6 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f20038id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f48942r;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f20038id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.f48941n;
        if (arrayList != null && !arrayList.isEmpty()) {
            m(this.f48941n.size() - 1);
        }
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f48941n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.f48941n;
        if (arrayList != null && i10 >= 0) {
            return ((g) arrayList.get(i10)).f17125a;
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
        ArrayList arrayList = this.f48941n;
        if (arrayList != null && i10 >= 0) {
            g gVar = (g) arrayList.get(i10);
            int i14 = d1Var.f47660f;
            View view = d1Var.f47656a;
            int i15 = 8;
            boolean z12 = true;
            if (i14 == 3) {
                l lVar = (l) view;
                fr frVar = gVar.f48938r;
                if (frVar != null) {
                    CharSequence charSequence = gVar.f48928g;
                    String str = gVar.h;
                    lVar.f51156w.setVisibility(8);
                    lVar.H = null;
                    lVar.I = null;
                    y9 y9Var = lVar.f49574c;
                    y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    y9Var.setImageDrawable(frVar);
                    a6 a6Var = lVar.d;
                    a6Var.k(charSequence);
                    boolean[] zArr = lVar.f51155s;
                    zArr[0] = false;
                    lVar.setSubtitle(str);
                    j5 j5Var = lVar.f49575e;
                    if (zArr[0]) {
                        i13 = i6.f20981n5;
                    } else {
                        i13 = i6.f21054r5;
                    }
                    j5Var.setTextColor(i6.w0(i13, lVar.f49572a));
                    dq dqVar = lVar.v;
                    if (dqVar != null) {
                        dqVar.setAlpha(1.0f);
                    }
                    a6Var.i(null);
                } else {
                    TLRPC.User user = gVar.f48925c;
                    if (user != null) {
                        lVar.setUser(user);
                        String str2 = gVar.h;
                        if (str2 != null) {
                            lVar.setSubtitle(str2);
                            lVar.f49575e.setTextColor(i6.w0(i6.f21054r5, this.d));
                        }
                    } else {
                        TLRPC.Chat chat = gVar.f48926e;
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
                lVar.c(gVar.f48931k, false);
                lVar.i(1.0f, false);
                int i16 = i10 + 1;
                if (i16 < this.f48941n.size() && ((g) this.f48941n.get(i16)).f17125a != i14) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                lVar.setDivider(z10);
                if (i16 < this.f48941n.size() && ((g) this.f48941n.get(i16)).f17125a == 7) {
                    lVar.setDivider(false);
                }
                lVar.setOptions(gVar.f48934n);
                c1 c1Var = gVar.f48935o;
                c1 c1Var2 = gVar.f48936p;
                ImageView imageView = lVar.F;
                ImageView imageView2 = lVar.f51158y;
                if (c1Var != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                lVar.f51157x = z11;
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
                lVar.g(this.f48946y, false);
            } else if (i14 == 6) {
                xg.b bVar = (xg.b) view;
                if (i10 >= this.f48941n.size() - 1 || (i11 = i10 + 1) >= this.f48941n.size() - 1 || ((g) this.f48941n.get(i11)).f17125a == 7) {
                    z12 = false;
                }
                bVar.v = gVar.f48927f;
                bVar.f();
                bVar.setDivider(z12);
                bVar.c(gVar.f48931k, false);
            } else if (i14 == -1) {
                int i17 = gVar.f48932l;
                if (i17 < 0) {
                    i17 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new q0(-1, i17));
            } else if (i14 == 7) {
                ((xg.d) view).setLetter(gVar.f48928g);
            } else if (i14 == 5) {
                try {
                    ((ay0) view).f24800b.getImageReceiver().startAnimation();
                } catch (Exception unused) {
                }
            } else if (i14 == 8) {
                v3 v3Var = (v3) view;
                if (TextUtils.equals(v3Var.getText(), gVar.f48928g)) {
                    String str3 = gVar.h;
                    if (str3 == null) {
                        str3 = "";
                    }
                    v3Var.b(str3, gVar.f48933m);
                } else {
                    v3Var.setText(Emoji.replaceWithRestrictedEmoji(gVar.f48928g, v3Var.getTextView(), (Runnable) null));
                    if (!TextUtils.isEmpty(gVar.h)) {
                        String str4 = gVar.h;
                        vy0 vy0Var = gVar.f48933m;
                        u3 u3Var = v3Var.f23537b;
                        u3Var.c(str4, false, true);
                        u3Var.setOnClickListener(vy0Var);
                        u3Var.setVisibility(0);
                    }
                }
                this.v = v3Var;
            } else if (i14 == 9) {
                r8 r8Var = (r8) view;
                r8Var.e(i6.f21128v6, i6.f21110u6);
                r8Var.m(gVar.f48930j, gVar.f48928g, false);
            } else if (i14 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != gVar.f48937q) {
                    AndroidUtilities.removeFromParent(gVar.f48937q);
                    frameLayout.addView(gVar.f48937q, x5.d(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i10) {
        l lVar;
        Context context = this.f48939e;
        if (i10 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            lVar = view;
        } else if (i10 == 3) {
            lVar = new l(this.f48939e, this.f48944w, this.f48945x, this.d, this.f48943s);
        } else {
            e6 e6Var = this.d;
            if (i10 == 5) {
                ay0 ay0Var = new ay0(context, null, 1, e6Var);
                ay0Var.d.setText(LocaleController.getString(R.string.NoResult));
                ay0Var.f24802e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                ay0Var.f24799a.setTranslationY(AndroidUtilities.dp(24.0f));
                lVar = ay0Var;
            } else {
                boolean z10 = this.h;
                if (i10 == 7) {
                    xg.d dVar = new xg.d(context, e6Var);
                    dVar.setTag(-33024);
                    lVar = dVar;
                    if (z10) {
                        dVar.setBackground(null);
                        lVar = dVar;
                    }
                } else if (i10 == 6) {
                    xg.b bVar = new xg.b(context, e6Var);
                    bVar.setTag(-33024);
                    lVar = bVar;
                    if (z10) {
                        bVar.setBackground(null);
                        lVar = bVar;
                    }
                } else if (i10 == 8) {
                    v3 v3Var = new v3(context, e6Var);
                    v3Var.setTag(-33024);
                    lVar = v3Var;
                    if (z10) {
                        v3Var.setBackground(null);
                        lVar = v3Var;
                    }
                } else if (i10 == 9) {
                    r8 r8Var = new r8(context, e6Var);
                    r8Var.f22722n = 16;
                    r8Var.f22725w = 19;
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
        View view = d1Var.f47656a;
        if (view instanceof l) {
            ((l) view).g(this.f48946y, false);
        }
    }
}
