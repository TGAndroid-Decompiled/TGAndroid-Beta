package vh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.i9;
import org.telegram.ui.xe;
import w7.a6;
public final class e {
    public final p2 f43360a;
    public final TLRPC.Chat f43361b;
    public final int f43362c;
    public FrameLayout d;
    public b e;
    public LinearLayout f43363f;
    public TextView f43364g;
    public ImageView h;
    public c f43365i;
    public TLRPC.ChatFull f43366j;
    public int f43367k;
    public int f43368l = -1;
    public d f43369m;

    public e(TLRPC.Chat chat, p2 p2Var) {
        this.f43360a = p2Var;
        this.f43361b = chat;
        this.f43362c = p2Var.getCurrentAccount();
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        if (this.d.getVisibility() == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                int i10 = this.f43368l;
                p2 p2Var = this.f43360a;
                TLRPC.Chat chat = this.f43361b;
                if (i10 == -1 && chat != null) {
                    this.f43368l = p2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f17195id);
                }
                int i11 = this.f43367k;
                int i12 = this.f43368l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        p2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f17195id, 0);
                    }
                } else {
                    return;
                }
            }
            d dVar = this.f43369m;
            if (dVar != null) {
                dVar.g(z10, z11);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new l6(this.f43364g, 4, null, null, null, null, j6.fe));
        arrayList.add(new l6(this.h, 8, null, null, null, null, j6.f17936de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            p2 p2Var = this.f43360a;
            FrameLayout frameLayout = new FrameLayout(p2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(j6.K0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final e f43358b;

                {
                    this.f43358b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            e eVar = this.f43358b;
                            p2 p2Var2 = eVar.f43360a;
                            if (eVar.f43365i == null) {
                                eVar.f43365i = new c(eVar, p2Var2, eVar.f43361b.f17195id);
                            }
                            p2Var2.showDialog(eVar.f43365i);
                            return;
                        default:
                            e eVar2 = this.f43358b;
                            eVar2.f43360a.getMessagesController().setChatPendingRequestsOnClose(eVar2.f43361b.f17195id, eVar2.f43367k);
                            eVar2.f43368l = eVar2.f43367k;
                            eVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(p2Var.getParentActivity());
            this.f43363f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f43363f, a6.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            b bVar = new b(0, p2Var.getParentActivity(), false);
            this.e = bVar;
            bVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            i9 i9Var = this.e.f24315a;
            for (int i10 = 0; i10 < i9Var.f23937c.length; i10++) {
                i9Var.l(0, null, 0);
            }
            this.f43363f.addView(this.e, a6.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(p2Var.getParentActivity());
            this.f43364g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f43364g.setGravity(16);
            this.f43364g.setSingleLine();
            this.f43364g.setText((CharSequence) null);
            this.f43364g.setTextColor(p2Var.getThemedColor(j6.fe));
            this.f43364g.setTypeface(AndroidUtilities.bold());
            this.f43363f.addView(this.f43364g, a6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(p2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(j6.f0(p2Var.getThemedColor(j6.f18290x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(p2Var.getThemedColor(j6.f17936de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final e f43358b;

                {
                    this.f43358b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            e eVar = this.f43358b;
                            p2 p2Var2 = eVar.f43360a;
                            if (eVar.f43365i == null) {
                                eVar.f43365i = new c(eVar, p2Var2, eVar.f43361b.f17195id);
                            }
                            p2Var2.showDialog(eVar.f43365i);
                            return;
                        default:
                            e eVar2 = this.f43358b;
                            eVar2.f43360a.getMessagesController().setChatPendingRequestsOnClose(eVar2.f43361b.f17195id, eVar2.f43367k);
                            eVar2.f43368l = eVar2.f43367k;
                            eVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, a6.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f43366j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(xe xeVar) {
        this.f43369m = xeVar;
    }

    public final void e(int i10, List list, boolean z10) {
        if (this.d != null) {
            p2 p2Var = this.f43360a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f43361b;
                if (chat != null) {
                    p2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f17195id, 0);
                    this.f43368l = 0;
                }
                a(false, z10);
                this.f43367k = 0;
            } else if (this.f43367k != i10) {
                this.f43367k = i10;
                this.f43364g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = p2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.e.b(i11, user, this.f43362c);
                        }
                    }
                    this.e.setCount(min);
                    this.e.a(true);
                }
            }
        }
    }
}
