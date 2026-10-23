package xh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.v;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.j9;
import org.telegram.ui.pe;
import w7.z5;
public final class d {
    public final n2 f49839a;
    public final TLRPC.Chat f49840b;
    public final int f49841c;
    public FrameLayout d;
    public v e;
    public LinearLayout f49842f;
    public TextView f49843g;
    public ImageView h;
    public b f49844i;
    public TLRPC.ChatFull f49845j;
    public int f49846k;
    public int f49847l = -1;
    public c f49848m;

    public d(TLRPC.Chat chat, n2 n2Var) {
        this.f49839a = n2Var;
        this.f49840b = chat;
        this.f49841c = n2Var.getCurrentAccount();
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
                int i10 = this.f49847l;
                n2 n2Var = this.f49839a;
                TLRPC.Chat chat = this.f49840b;
                if (i10 == -1 && chat != null) {
                    this.f49847l = n2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f20280id);
                }
                int i11 = this.f49846k;
                int i12 = this.f49847l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        n2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f20280id, 0);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f49848m;
            if (cVar != null) {
                cVar.f(z10, z11);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new j6(this.f49843g, 4, null, null, null, null, h6.f21036fe));
        arrayList.add(new j6(this.h, 8, null, null, null, null, h6.f21000de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            n2 n2Var = this.f49839a;
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(h6.L0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f49837b;

                {
                    this.f49837b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f49837b;
                            n2 n2Var2 = dVar.f49839a;
                            if (dVar.f49844i == null) {
                                dVar.f49844i = new b(dVar, n2Var2, dVar.f49840b.f20280id);
                            }
                            n2Var2.showDialog(dVar.f49844i);
                            return;
                        default:
                            d dVar2 = this.f49837b;
                            dVar2.f49839a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f49840b.f20280id, dVar2.f49846k);
                            dVar2.f49847l = dVar2.f49846k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(n2Var.getParentActivity());
            this.f49842f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f49842f, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            v vVar = new v(1, n2Var.getParentActivity(), false);
            this.e = vVar;
            vVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            j9 j9Var = this.e.f27819a;
            for (int i10 = 0; i10 < j9Var.f27454c.length; i10++) {
                j9Var.l(0, null, 0);
            }
            this.f49842f.addView(this.e, z5.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(n2Var.getParentActivity());
            this.f49843g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f49843g.setGravity(16);
            this.f49843g.setSingleLine();
            this.f49843g.setText((CharSequence) null);
            this.f49843g.setTextColor(n2Var.getThemedColor(h6.f21036fe));
            this.f49843g.setTypeface(AndroidUtilities.bold());
            this.f49842f.addView(this.f49843g, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(n2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(h6.g0(n2Var.getThemedColor(h6.f21365x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(n2Var.getThemedColor(h6.f21000de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f49837b;

                {
                    this.f49837b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f49837b;
                            n2 n2Var2 = dVar.f49839a;
                            if (dVar.f49844i == null) {
                                dVar.f49844i = new b(dVar, n2Var2, dVar.f49840b.f20280id);
                            }
                            n2Var2.showDialog(dVar.f49844i);
                            return;
                        default:
                            d dVar2 = this.f49837b;
                            dVar2.f49839a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f49840b.f20280id, dVar2.f49846k);
                            dVar2.f49847l = dVar2.f49846k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, z5.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f49845j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(pe peVar) {
        this.f49848m = peVar;
    }

    public final void e(int i10, List list, boolean z10) {
        if (this.d != null) {
            n2 n2Var = this.f49839a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f49840b;
                if (chat != null) {
                    n2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f20280id, 0);
                    this.f49847l = 0;
                }
                a(false, z10);
                this.f49846k = 0;
            } else if (this.f49846k != i10) {
                this.f49846k = i10;
                this.f49843g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = n2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.e.b(i11, user, this.f49841c);
                        }
                    }
                    this.e.setCount(min);
                    this.e.a(true);
                }
            }
        }
    }
}
