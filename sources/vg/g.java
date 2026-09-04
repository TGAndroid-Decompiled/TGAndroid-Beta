package vg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.j5;
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
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.web.b1;
import org.telegram.ui.wy0;
import s4.c1;
import s4.p0;
import ug.d1;
import ug.r;
import w7.x5;
import yg.l;
public final class g extends pg.b {
    public final f6 d;
    public final Context f47823e;
    public ll0 f47824f;
    public ArrayList f47825n;
    public boolean f47827s;
    public u3 v;
    public final boolean f47828w;
    public boolean f47829x;
    public final HashMap f47826r = new HashMap();
    public boolean f47830y = true;
    public final boolean h = true;

    public g(Context context, f6 f6Var, boolean z10) {
        this.f47823e = context;
        this.f47828w = z10;
        this.d = f6Var;
        b1 b1Var = new b1(this, 15);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new r(2, messagesStorage, b1Var));
    }

    @Override
    public final boolean D(c1 c1Var) {
        int i10 = c1Var.f45742f;
        if (i10 != 3 && i10 != 6 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f19869id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f47826r;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f19869id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.f47825n;
        if (arrayList != null && !arrayList.isEmpty()) {
            m(this.f47825n.size() - 1);
        }
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f47825n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.f47825n;
        if (arrayList != null && i10 >= 0) {
            return ((f) arrayList.get(i10)).f44071a;
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
        ArrayList arrayList = this.f47825n;
        if (arrayList != null && i10 >= 0) {
            f fVar = (f) arrayList.get(i10);
            int i14 = c1Var.f45742f;
            View view = c1Var.f45738a;
            int i15 = 8;
            boolean z12 = true;
            if (i14 == 3) {
                l lVar = (l) view;
                oq oqVar = fVar.f47822r;
                if (oqVar != null) {
                    CharSequence charSequence = fVar.f47812g;
                    String str = fVar.h;
                    lVar.v.setVisibility(8);
                    lVar.G = null;
                    lVar.H = null;
                    x9 x9Var = lVar.f48507c;
                    x9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    x9Var.setImageDrawable(oqVar);
                    j5 j5Var = lVar.d;
                    j5Var.k(charSequence);
                    boolean[] zArr = lVar.f50193r;
                    zArr[0] = false;
                    lVar.setSubtitle(str);
                    org.telegram.ui.ActionBar.j5 j5Var2 = lVar.f48508e;
                    if (zArr[0]) {
                        i13 = j6.f20845n5;
                    } else {
                        i13 = j6.f20915r5;
                    }
                    j5Var2.setTextColor(j6.v0(i13, lVar.f48505a));
                    mp mpVar = lVar.f50194s;
                    if (mpVar != null) {
                        mpVar.setAlpha(1.0f);
                    }
                    j5Var.i(null);
                } else {
                    TLRPC.User user = fVar.f47809c;
                    if (user != null) {
                        lVar.setUser(user);
                        String str2 = fVar.h;
                        if (str2 != null) {
                            lVar.setSubtitle(str2);
                            lVar.f48508e.setTextColor(j6.v0(j6.f20915r5, this.d));
                        }
                    } else {
                        TLRPC.Chat chat = fVar.f47810e;
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
                lVar.c(fVar.f47815k, false);
                lVar.i(1.0f, false);
                int i16 = i10 + 1;
                if (i16 < this.f47825n.size() && ((f) this.f47825n.get(i16)).f44071a != i14) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                lVar.setDivider(z10);
                if (i16 < this.f47825n.size() && ((f) this.f47825n.get(i16)).f44071a == 7) {
                    lVar.setDivider(false);
                }
                lVar.setOptions(fVar.f47818n);
                d1 d1Var = fVar.f47819o;
                d1 d1Var2 = fVar.f47820p;
                ImageView imageView = lVar.E;
                ImageView imageView2 = lVar.f50196x;
                if (d1Var != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                lVar.f50195w = z11;
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
                lVar.f50197y = z12;
                if (z12 && lVar.F) {
                    i15 = 0;
                }
                imageView.setVisibility(i15);
                imageView.setOnClickListener(d1Var2);
                lVar.g(this.f47830y, false);
            } else if (i14 == 6) {
                yg.b bVar = (yg.b) view;
                z12 = (i10 >= this.f47825n.size() - 1 || (i11 = i10 + 1) >= this.f47825n.size() - 1 || ((f) this.f47825n.get(i11)).f44071a == 7) ? false : false;
                bVar.f50160s = fVar.f47811f;
                bVar.f();
                bVar.setDivider(z12);
                bVar.c(fVar.f47815k, false);
            } else if (i14 == -1) {
                int i17 = fVar.f47816l;
                if (i17 < 0) {
                    i17 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new p0(-1, i17));
            } else if (i14 == 7) {
                ((yg.d) view).setLetter(fVar.f47812g);
            } else if (i14 == 5) {
                try {
                    ((xw0) view).f32753b.getImageReceiver().startAnimation();
                } catch (Exception unused) {
                }
            } else if (i14 == 8) {
                u3 u3Var = (u3) view;
                if (TextUtils.equals(u3Var.getText(), fVar.f47812g)) {
                    String str3 = fVar.h;
                    if (str3 == null) {
                        str3 = "";
                    }
                    u3Var.b(str3, fVar.f47817m);
                } else {
                    u3Var.setText(Emoji.replaceWithRestrictedEmoji(fVar.f47812g, u3Var.getTextView(), (Runnable) null));
                    if (!TextUtils.isEmpty(fVar.h)) {
                        String str4 = fVar.h;
                        wy0 wy0Var = fVar.f47817m;
                        t3 t3Var = u3Var.f23317b;
                        t3Var.c(str4, false, true);
                        t3Var.setOnClickListener(wy0Var);
                        t3Var.setVisibility(0);
                    }
                }
                this.v = u3Var;
            } else if (i14 == 9) {
                r8 r8Var = (r8) view;
                r8Var.e(j6.f20990v6, j6.f20972u6);
                r8Var.m(fVar.f47814j, fVar.f47812g, false);
            } else if (i14 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != fVar.f47821q) {
                    AndroidUtilities.removeFromParent(fVar.f47821q);
                    frameLayout.addView(fVar.f47821q, x5.c(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        l lVar;
        Context context = this.f47823e;
        if (i10 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            lVar = view;
        } else if (i10 == 3) {
            lVar = new l(this.f47823e, this.f47828w, this.f47829x, this.d, this.f47827s);
        } else {
            f6 f6Var = this.d;
            if (i10 == 5) {
                xw0 xw0Var = new xw0(context, null, 1, f6Var);
                xw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                xw0Var.f32755e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                xw0Var.f32752a.setTranslationY(AndroidUtilities.dp(24.0f));
                lVar = xw0Var;
            } else {
                boolean z10 = this.h;
                if (i10 == 7) {
                    yg.d dVar = new yg.d(context, f6Var);
                    dVar.setTag(-33024);
                    lVar = dVar;
                    if (z10) {
                        dVar.setBackground(null);
                        lVar = dVar;
                    }
                } else if (i10 == 6) {
                    yg.b bVar = new yg.b(context, f6Var);
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
                    r8Var.f22685n = 16;
                    r8Var.f22688w = 19;
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
        View view = c1Var.f45738a;
        if (view instanceof l) {
            ((l) view).g(this.f47830y, false);
        }
    }
}
