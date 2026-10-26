package wg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import di.l4;
import ig.o;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zp;
import s4.e1;
import s4.q0;
import sg.u;
import vg.c1;
import zg.l;
public final class h extends qg.b {
    public final u6 d;
    public final Context e;
    public mm0 f51198f;
    public ArrayList f51199n;
    public boolean f51201s;
    public z3 v;
    public final boolean f51202w;
    public boolean f51203x;
    public final HashMap f51200r = new HashMap();
    public boolean f51204y = true;
    public final boolean h = true;

    public h(Context context, u6 u6Var, boolean z10) {
        this.e = context;
        this.f51202w = z10;
        this.d = u6Var;
        o oVar = new o(this, 28);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new u(22, messagesStorage, oVar));
    }

    @Override
    public final boolean D(e1 e1Var) {
        int i10 = e1Var.f47741f;
        if (i10 != 3 && i10 != 6 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f22027id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f51200r;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f22027id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.f51199n;
        if (arrayList != null && !arrayList.isEmpty()) {
            m(this.f51199n.size() - 1);
        }
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f51199n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.f51199n;
        if (arrayList != null && i10 >= 0) {
            return ((g) arrayList.get(i10)).f47040a;
        }
        return -1;
    }

    @Override
    public final void v(e1 e1Var, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        ArrayList arrayList = this.f51199n;
        if (arrayList != null && i10 >= 0) {
            g gVar = (g) arrayList.get(i10);
            int i14 = e1Var.f47741f;
            View view = e1Var.f47738a;
            int i15 = 8;
            boolean z12 = true;
            if (i14 == 3) {
                l lVar = (l) view;
                Drawable drawable = gVar.f51197r;
                if (drawable != null) {
                    CharSequence charSequence = gVar.f51187g;
                    CharSequence charSequence2 = gVar.h;
                    lVar.f52890w.setVisibility(8);
                    lVar.H = null;
                    lVar.I = null;
                    y9 y9Var = lVar.f51763c;
                    y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    y9Var.setImageDrawable(drawable);
                    l4 l4Var = lVar.d;
                    l4Var.k(charSequence);
                    boolean[] zArr = lVar.f52889s;
                    zArr[0] = false;
                    lVar.setSubtitle(charSequence2);
                    b6 b6Var = lVar.e;
                    if (zArr[0]) {
                        i13 = y6.f23539n5;
                    } else {
                        i13 = y6.f23614r5;
                    }
                    f7.Y(b6Var, i13, lVar.f51761a);
                    zp zpVar = lVar.v;
                    if (zpVar != null) {
                        zpVar.setAlpha(1.0f);
                    }
                    l4Var.i(null);
                } else {
                    TLRPC.User user = gVar.f51185c;
                    if (user != null) {
                        lVar.setUser(user);
                        CharSequence charSequence3 = gVar.h;
                        if (charSequence3 != null) {
                            lVar.setSubtitle(charSequence3);
                            f7.Y(lVar.e, y6.f23614r5, this.d);
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
                lVar.c(gVar.f51190k, false);
                lVar.i(1.0f, false);
                int i16 = i10 + 1;
                if (i16 < this.f51199n.size() && ((g) this.f51199n.get(i16)).f47040a != i14) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                lVar.setDivider(z10);
                if (i16 < this.f51199n.size() && ((g) this.f51199n.get(i16)).f47040a == 7) {
                    lVar.setDivider(false);
                }
                lVar.setOptions(gVar.f51193n);
                c1 c1Var = gVar.f51194o;
                c1 c1Var2 = gVar.f51195p;
                ImageView imageView = lVar.F;
                ImageView imageView2 = lVar.f52892y;
                if (c1Var != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                lVar.f52891x = z11;
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
                lVar.g(this.f51204y, false);
            } else if (i14 == 6) {
                zg.b bVar = (zg.b) view;
                if (i10 >= this.f51199n.size() - 1 || (i11 = i10 + 1) >= this.f51199n.size() - 1 || ((g) this.f51199n.get(i11)).f47040a == 7) {
                    z12 = false;
                }
                bVar.v = gVar.f51186f;
                bVar.f();
                bVar.setDivider(z12);
                bVar.c(gVar.f51190k, false);
            } else if (i14 == -1) {
                int i17 = gVar.f51191l;
                if (i17 < 0) {
                    i17 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new q0(-1, i17));
            } else if (i14 == 7) {
                ((zg.d) view).setLetter(gVar.f51187g);
            } else if (i14 == 5) {
                try {
                    ((ey0) view).f28015b.getImageReceiver().startAnimation();
                } catch (Exception unused) {
                }
            } else if (i14 == 8) {
                z3 z3Var = (z3) view;
                if (TextUtils.equals(z3Var.getText(), gVar.f51187g)) {
                    CharSequence charSequence4 = gVar.h;
                    if (charSequence4 == null) {
                        charSequence4 = "";
                    }
                    z3Var.a(charSequence4, gVar.f51192m);
                } else {
                    z3Var.setText(Emoji.replaceWithRestrictedEmoji(gVar.f51187g, z3Var.getTextView(), (Runnable) null));
                    if (!TextUtils.isEmpty(gVar.h)) {
                        CharSequence charSequence5 = gVar.h;
                        org.telegram.ui.web.c cVar = gVar.f51192m;
                        y3 y3Var = z3Var.f25782b;
                        y3Var.c(charSequence5, false, true);
                        y3Var.setOnClickListener(cVar);
                        y3Var.setVisibility(0);
                    }
                }
                this.v = z3Var;
            } else if (i14 == 9) {
                v8 v8Var = (v8) view;
                v8Var.g(y6.f23692v6, y6.f23673u6);
                v8Var.o(gVar.f51189j, gVar.f51187g, false);
            } else if (i14 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != gVar.f51196q) {
                    AndroidUtilities.removeFromParent(gVar.f51196q);
                    frameLayout.addView(gVar.f51196q, gb1.g(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final e1 x(ViewGroup viewGroup, int i10) {
        l lVar;
        Context context = this.e;
        if (i10 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            lVar = view;
        } else if (i10 == 3) {
            lVar = new l(this.e, this.f51202w, this.f51203x, this.d, this.f51201s);
        } else {
            u6 u6Var = this.d;
            if (i10 == 5) {
                ey0 ey0Var = new ey0(context, null, 1, u6Var);
                ey0Var.d.setText(LocaleController.getString(R.string.NoResult));
                ey0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                ey0Var.f28014a.setTranslationY(AndroidUtilities.dp(24.0f));
                lVar = ey0Var;
            } else {
                boolean z10 = this.h;
                if (i10 == 7) {
                    zg.d dVar = new zg.d(context, u6Var);
                    dVar.setTag(-33024);
                    lVar = dVar;
                    if (z10) {
                        dVar.setBackground(null);
                        lVar = dVar;
                    }
                } else if (i10 == 6) {
                    zg.b bVar = new zg.b(context, u6Var);
                    bVar.setTag(-33024);
                    lVar = bVar;
                    if (z10) {
                        bVar.setBackground(null);
                        lVar = bVar;
                    }
                } else if (i10 == 8) {
                    z3 z3Var = new z3(context, u6Var);
                    z3Var.setTag(-33024);
                    lVar = z3Var;
                    if (z10) {
                        z3Var.setBackground(null);
                        lVar = z3Var;
                    }
                } else if (i10 == 9) {
                    v8 v8Var = new v8(context, u6Var);
                    v8Var.f25597n = 16;
                    v8Var.f25600w = 19;
                    lVar = v8Var;
                } else if (i10 == 10) {
                    lVar = new FrameLayout(context);
                } else {
                    lVar = new View(context);
                }
            }
        }
        return new e1(lVar);
    }

    @Override
    public final void y(e1 e1Var) {
        View view = e1Var.f47738a;
        if (view instanceof l) {
            ((l) view).g(this.f51204y, false);
        }
    }
}
