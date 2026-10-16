package vg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.l5;
import java.util.ArrayList;
import java.util.HashMap;
import ji.p1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.z9;
import org.telegram.ui.bz0;
import s4.b1;
import s4.o0;
import ug.c1;
import w7.z5;
import yg.l;
public final class h extends pg.b {
    public final c6 d;
    public final Context e;
    public mm0 f46989f;
    public ArrayList f46990n;
    public boolean f46992s;
    public v3 v;
    public final boolean f46993w;
    public boolean f46994x;
    public final HashMap f46991r = new HashMap();
    public boolean f46995y = true;
    public final boolean h = true;

    public h(Context context, c6 c6Var, boolean z10) {
        this.e = context;
        this.f46993w = z10;
        this.d = c6Var;
        p1 p1Var = new p1(this, 18);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new s9.b(13, messagesStorage, p1Var));
    }

    @Override
    public final boolean D(b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 != 3 && i10 != 6 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f18916id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f46991r;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f18916id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.f46990n;
        if (arrayList != null && !arrayList.isEmpty()) {
            m(this.f46990n.size() - 1);
        }
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f46990n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.f46990n;
        if (arrayList != null && i10 >= 0) {
            return ((g) arrayList.get(i10)).f42904a;
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
        ArrayList arrayList = this.f46990n;
        if (arrayList != null && i10 >= 0) {
            g gVar = (g) arrayList.get(i10);
            int i14 = b1Var.f44841f;
            View view = b1Var.f44838a;
            int i15 = 8;
            boolean z12 = true;
            if (i14 == 3) {
                l lVar = (l) view;
                cr crVar = gVar.f46988r;
                if (crVar != null) {
                    CharSequence charSequence = gVar.f46978g;
                    String str = gVar.h;
                    lVar.f48780w.setVisibility(8);
                    lVar.H = null;
                    lVar.I = null;
                    z9 z9Var = lVar.f47566c;
                    z9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    z9Var.setImageDrawable(crVar);
                    l5 l5Var = lVar.d;
                    l5Var.k(charSequence);
                    boolean[] zArr = lVar.f48779s;
                    zArr[0] = false;
                    lVar.setSubtitle(str);
                    h5 h5Var = lVar.e;
                    if (zArr[0]) {
                        i13 = g6.f19783n5;
                    } else {
                        i13 = g6.f19857r5;
                    }
                    h5Var.setTextColor(g6.w0(i13, lVar.f47564a));
                    aq aqVar = lVar.v;
                    if (aqVar != null) {
                        aqVar.setAlpha(1.0f);
                    }
                    l5Var.i(null);
                } else {
                    TLRPC.User user = gVar.f46976c;
                    if (user != null) {
                        lVar.setUser(user);
                        String str2 = gVar.h;
                        if (str2 != null) {
                            lVar.setSubtitle(str2);
                            lVar.e.setTextColor(g6.w0(g6.f19857r5, this.d));
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
                lVar.c(gVar.f46981k, false);
                lVar.i(1.0f, false);
                int i16 = i10 + 1;
                if (i16 < this.f46990n.size() && ((g) this.f46990n.get(i16)).f42904a != i14) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                lVar.setDivider(z10);
                if (i16 < this.f46990n.size() && ((g) this.f46990n.get(i16)).f42904a == 7) {
                    lVar.setDivider(false);
                }
                lVar.setOptions(gVar.f46984n);
                c1 c1Var = gVar.f46985o;
                c1 c1Var2 = gVar.f46986p;
                ImageView imageView = lVar.F;
                ImageView imageView2 = lVar.f48782y;
                if (c1Var != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                lVar.f48781x = z11;
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
                lVar.g(this.f46995y, false);
            } else if (i14 == 6) {
                yg.b bVar = (yg.b) view;
                if (i10 >= this.f46990n.size() - 1 || (i11 = i10 + 1) >= this.f46990n.size() - 1 || ((g) this.f46990n.get(i11)).f42904a == 7) {
                    z12 = false;
                }
                bVar.v = gVar.f46977f;
                bVar.f();
                bVar.setDivider(z12);
                bVar.c(gVar.f46981k, false);
            } else if (i14 == -1) {
                int i17 = gVar.f46982l;
                if (i17 < 0) {
                    i17 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new o0(-1, i17));
            } else if (i14 == 7) {
                ((yg.d) view).setLetter(gVar.f46978g);
            } else if (i14 == 5) {
                try {
                    ((wx0) view).f30688b.getImageReceiver().startAnimation();
                } catch (Exception unused) {
                }
            } else if (i14 == 8) {
                v3 v3Var = (v3) view;
                if (TextUtils.equals(v3Var.getText(), gVar.f46978g)) {
                    String str3 = gVar.h;
                    if (str3 == null) {
                        str3 = "";
                    }
                    v3Var.b(str3, gVar.f46983m);
                } else {
                    v3Var.setText(Emoji.replaceWithRestrictedEmoji(gVar.f46978g, v3Var.getTextView(), (Runnable) null));
                    if (!TextUtils.isEmpty(gVar.h)) {
                        String str4 = gVar.h;
                        bz0 bz0Var = gVar.f46983m;
                        u3 u3Var = v3Var.f22268b;
                        u3Var.c(str4, false, true);
                        u3Var.setOnClickListener(bz0Var);
                        u3Var.setVisibility(0);
                    }
                }
                this.v = v3Var;
            } else if (i14 == 9) {
                r8 r8Var = (r8) view;
                r8Var.e(g6.f19933v6, g6.f19916u6);
                r8Var.m(gVar.f46980j, gVar.f46978g, false);
            } else if (i14 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != gVar.f46987q) {
                    AndroidUtilities.removeFromParent(gVar.f46987q);
                    frameLayout.addView(gVar.f46987q, z5.d(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final b1 x(ViewGroup viewGroup, int i10) {
        l lVar;
        Context context = this.e;
        if (i10 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            lVar = view;
        } else if (i10 == 3) {
            lVar = new l(this.e, this.f46993w, this.f46994x, this.d, this.f46992s);
        } else {
            c6 c6Var = this.d;
            if (i10 == 5) {
                wx0 wx0Var = new wx0(context, null, 1, c6Var);
                wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                wx0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                wx0Var.f30687a.setTranslationY(AndroidUtilities.dp(24.0f));
                lVar = wx0Var;
            } else {
                boolean z10 = this.h;
                if (i10 == 7) {
                    yg.d dVar = new yg.d(context, c6Var);
                    dVar.setTag(-33024);
                    lVar = dVar;
                    if (z10) {
                        dVar.setBackground(null);
                        lVar = dVar;
                    }
                } else if (i10 == 6) {
                    yg.b bVar = new yg.b(context, c6Var);
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
                    r8Var.f21460n = 16;
                    r8Var.f21463w = 19;
                    lVar = r8Var;
                } else if (i10 == 10) {
                    lVar = new FrameLayout(context);
                } else {
                    lVar = new View(context);
                }
            }
        }
        return new b1(lVar);
    }

    @Override
    public final void y(b1 b1Var) {
        View view = b1Var.f44838a;
        if (view instanceof l) {
            ((l) view).g(this.f46995y, false);
        }
    }
}
