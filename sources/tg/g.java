package tg;

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
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w9;
import org.telegram.ui.w71;
import org.telegram.ui.web.x1;
import org.telegram.ui.web.y1;
import s4.c1;
import s4.p0;
import sg.f1;
import w7.a6;
import wg.k;
public final class g extends ng.b {
    public final f6 d;
    public final Context e;
    public vl0 f42171f;
    public ArrayList f42172n;
    public boolean f42174s;
    public u3 v;
    public final boolean f42175w;
    public boolean f42176x;
    public final HashMap f42173r = new HashMap();
    public boolean f42177y = true;
    public final boolean h = true;

    public g(Context context, f6 f6Var, boolean z10) {
        this.e = context;
        this.f42175w = z10;
        this.d = f6Var;
        y1 y1Var = new y1(this, 11);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new x1(21, messagesStorage, y1Var));
    }

    @Override
    public final boolean D(c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 != 3 && i10 != 6 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f17195id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f42173r;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f17195id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.f42172n;
        if (arrayList != null && !arrayList.isEmpty()) {
            m(this.f42172n.size() - 1);
        }
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f42172n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.f42172n;
        if (arrayList != null && i10 >= 0) {
            return ((f) arrayList.get(i10)).f14046a;
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
        ArrayList arrayList = this.f42172n;
        if (arrayList != null && i10 >= 0) {
            f fVar = (f) arrayList.get(i10);
            int i14 = c1Var.f41613f;
            View view = c1Var.f41610a;
            int i15 = 8;
            boolean z12 = true;
            if (i14 == 3) {
                k kVar = (k) view;
                vq vqVar = fVar.f42170r;
                if (vqVar != null) {
                    CharSequence charSequence = fVar.f42160g;
                    String str = fVar.h;
                    kVar.v.setVisibility(8);
                    kVar.G = null;
                    kVar.H = null;
                    w9 w9Var = kVar.f42677c;
                    w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    w9Var.setImageDrawable(vqVar);
                    f4 f4Var = kVar.d;
                    f4Var.k(charSequence);
                    boolean[] zArr = kVar.f44011r;
                    zArr[0] = false;
                    kVar.setSubtitle(str);
                    l5 l5Var = kVar.e;
                    if (zArr[0]) {
                        i13 = j6.f18109n5;
                    } else {
                        i13 = j6.f18179r5;
                    }
                    l5Var.setTextColor(j6.v0(i13, kVar.f42675a));
                    tp tpVar = kVar.f44012s;
                    if (tpVar != null) {
                        tpVar.setAlpha(1.0f);
                    }
                    f4Var.i(null);
                } else {
                    TLRPC.User user = fVar.f42158c;
                    if (user != null) {
                        kVar.setUser(user);
                        String str2 = fVar.h;
                        if (str2 != null) {
                            kVar.setSubtitle(str2);
                            kVar.e.setTextColor(j6.v0(j6.f18179r5, this.d));
                        }
                    } else {
                        TLRPC.Chat chat = fVar.e;
                        if (chat != null) {
                            kVar.h(F(chat), chat);
                        } else {
                            TLRPC.InputPeer inputPeer = fVar.d;
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
                kVar.c(fVar.f42163k, false);
                kVar.i(1.0f, false);
                int i16 = i10 + 1;
                if (i16 < this.f42172n.size() && ((f) this.f42172n.get(i16)).f14046a != i14) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                kVar.setDivider(z10);
                if (i16 < this.f42172n.size() && ((f) this.f42172n.get(i16)).f14046a == 7) {
                    kVar.setDivider(false);
                }
                kVar.setOptions(fVar.f42166n);
                f1 f1Var = fVar.f42167o;
                f1 f1Var2 = fVar.f42168p;
                ImageView imageView = kVar.E;
                ImageView imageView2 = kVar.f44014x;
                if (f1Var != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                kVar.f44013w = z11;
                if (z11 && kVar.F) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView2.setVisibility(i12);
                imageView2.setOnClickListener(f1Var);
                if (f1Var2 == null) {
                    z12 = false;
                }
                kVar.f44015y = z12;
                if (z12 && kVar.F) {
                    i15 = 0;
                }
                imageView.setVisibility(i15);
                imageView.setOnClickListener(f1Var2);
                kVar.g(this.f42177y, false);
            } else if (i14 == 6) {
                wg.b bVar = (wg.b) view;
                z12 = (i10 >= this.f42172n.size() - 1 || (i11 = i10 + 1) >= this.f42172n.size() - 1 || ((f) this.f42172n.get(i11)).f14046a == 7) ? false : false;
                bVar.f43983s = fVar.f42159f;
                bVar.f();
                bVar.setDivider(z12);
                bVar.c(fVar.f42163k, false);
            } else if (i14 == -1) {
                int i17 = fVar.f42164l;
                if (i17 < 0) {
                    i17 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new p0(-1, i17));
            } else if (i14 == 7) {
                ((wg.d) view).setLetter(fVar.f42160g);
            } else if (i14 == 5) {
                try {
                    ((jx0) view).f24510b.getImageReceiver().startAnimation();
                } catch (Exception unused) {
                }
            } else if (i14 == 8) {
                u3 u3Var = (u3) view;
                if (TextUtils.equals(u3Var.getText(), fVar.f42160g)) {
                    String str3 = fVar.h;
                    if (str3 == null) {
                        str3 = "";
                    }
                    u3Var.b(str3, fVar.f42165m);
                } else {
                    u3Var.setText(Emoji.replaceWithRestrictedEmoji(fVar.f42160g, u3Var.getTextView(), (Runnable) null));
                    if (!TextUtils.isEmpty(fVar.h)) {
                        String str4 = fVar.h;
                        w71 w71Var = fVar.f42165m;
                        t3 t3Var = u3Var.f20476b;
                        t3Var.c(str4, false, true);
                        t3Var.setOnClickListener(w71Var);
                        t3Var.setVisibility(0);
                    }
                }
                this.v = u3Var;
            } else if (i14 == 9) {
                s8 s8Var = (s8) view;
                s8Var.e(j6.f18254v6, j6.f18236u6);
                s8Var.m(fVar.f42162j, fVar.f42160g, false);
            } else if (i14 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != fVar.f42169q) {
                    AndroidUtilities.removeFromParent(fVar.f42169q);
                    frameLayout.addView(fVar.f42169q, a6.c(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        k kVar;
        Context context = this.e;
        if (i10 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            kVar = view;
        } else if (i10 == 3) {
            kVar = new k(this.e, this.f42175w, this.f42176x, this.d, this.f42174s);
        } else {
            f6 f6Var = this.d;
            if (i10 == 5) {
                jx0 jx0Var = new jx0(context, null, 1, f6Var);
                jx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                jx0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                jx0Var.f24509a.setTranslationY(AndroidUtilities.dp(24.0f));
                kVar = jx0Var;
            } else {
                boolean z10 = this.h;
                if (i10 == 7) {
                    wg.d dVar = new wg.d(context, f6Var);
                    dVar.setTag(-33024);
                    kVar = dVar;
                    if (z10) {
                        dVar.setBackground(null);
                        kVar = dVar;
                    }
                } else if (i10 == 6) {
                    wg.b bVar = new wg.b(context, f6Var);
                    bVar.setTag(-33024);
                    kVar = bVar;
                    if (z10) {
                        bVar.setBackground(null);
                        kVar = bVar;
                    }
                } else if (i10 == 8) {
                    u3 u3Var = new u3(context, f6Var);
                    u3Var.setTag(-33024);
                    kVar = u3Var;
                    if (z10) {
                        u3Var.setBackground(null);
                        kVar = u3Var;
                    }
                } else if (i10 == 9) {
                    s8 s8Var = new s8(context, f6Var);
                    s8Var.f20041n = 16;
                    s8Var.f20044w = 19;
                    kVar = s8Var;
                } else if (i10 == 10) {
                    kVar = new FrameLayout(context);
                } else {
                    kVar = new View(context);
                }
            }
        }
        return new c1(kVar);
    }

    @Override
    public final void y(c1 c1Var) {
        View view = c1Var.f41610a;
        if (view instanceof k) {
            ((k) view).g(this.f42177y, false);
        }
    }
}
