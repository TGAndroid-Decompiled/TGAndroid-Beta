package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class s70 extends org.telegram.ui.Components.kl0 {
    public final Context f40334c;
    public final u70 d;

    public s70(u70 u70Var, Context context) {
        this.d = u70Var;
        this.f40334c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45742f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.G;
    }

    @Override
    public final int j(int i10) {
        u70 u70Var = this.d;
        if ((i10 >= u70Var.E && i10 < u70Var.F) || i10 == u70Var.J) {
            return 0;
        }
        if (i10 != u70Var.f40964y && i10 != u70Var.H) {
            if (i10 != u70Var.f40963x && i10 != u70Var.K) {
                if (i10 != u70Var.I) {
                    return 0;
                }
                return 5;
            }
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        long j3;
        int i12;
        int i13;
        u70 u70Var = this.d;
        boolean z11 = u70Var.N;
        int i14 = c1Var.f45742f;
        View view = c1Var.f45738a;
        boolean z12 = true;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 4) {
                    if (i14 == 5) {
                        r70 r70Var = (r70) view;
                        if (u70Var.J <= 0) {
                            z12 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = u70Var.f40960r;
                        r70Var.f40085b = z12;
                        org.telegram.ui.Components.zt ztVar = r70Var.f40084a;
                        q70 q70Var = r70Var.f40088f;
                        ztVar.removeTextChangedListener(q70Var);
                        if (tL_messages_stickerSet == null) {
                            ztVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            ztVar.setText(str);
                            ztVar.setSelection(str.length());
                        }
                        ztVar.addTextChangedListener(q70Var);
                        return;
                    }
                    return;
                } else if (i10 == u70Var.H) {
                    ((org.telegram.ui.Cells.l4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                    return;
                } else {
                    org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                    if (z11) {
                        i13 = R.string.ChooseEmojiPackHeader;
                    } else {
                        i13 = R.string.ChooseStickerSetHeader;
                    }
                    l4Var.setText(LocaleController.getString(i13));
                    return;
                }
            } else if (i10 == u70Var.f40963x) {
                if (z11) {
                    i12 = R.string.ChooseEmojiPackMy;
                } else {
                    i12 = R.string.ChooseStickerSetMy;
                }
                String string = LocaleController.getString(i12);
                int indexOf = string.indexOf("@stickers");
                if (indexOf != -1) {
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.m4(this, 3), indexOf, indexOf + 9, 18);
                        ((org.telegram.ui.Cells.e9) view).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        ((org.telegram.ui.Cells.e9) view).setText(string);
                        return;
                    }
                }
                ((org.telegram.ui.Cells.e9) view).setText(string);
                return;
            } else if (i10 == u70Var.K) {
                ((org.telegram.ui.Cells.e9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
        if (i10 != u70Var.J) {
            i11 = ((org.telegram.ui.ActionBar.n2) u70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(u70Var.c0());
            int i15 = i10 - u70Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i15);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
            if (i15 != stickerSets.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            m8Var.d(tL_messages_stickerSet3, z10, false);
            m8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = u70Var.f40960r;
            if (tL_messages_stickerSet4 != null) {
                j3 = tL_messages_stickerSet4.set.f19896id;
            } else if (u70Var.b0(u70Var.v) != null) {
                j3 = u70Var.b0(u70Var.v).f19896id;
            } else {
                j3 = 0;
            }
            if (tL_messages_stickerSet2.set.f19896id != j3) {
                z12 = false;
            }
            m8Var.b(z12, false);
            return;
        }
        m8Var.b(false, false);
        m8Var.d(u70Var.f40960r, false, false);
        m8Var.setDeleteAction(new l60(this, 3));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.f40334c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 5) {
                    FrameLayout l4Var = new org.telegram.ui.Cells.l4(context);
                    l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false));
                    frameLayout = l4Var;
                } else {
                    u70 u70Var = this.d;
                    r70 r70Var = new r70(u70Var, context);
                    u70Var.O = r70Var;
                    frameLayout = r70Var;
                }
            } else {
                FrameLayout e9Var = new org.telegram.ui.Cells.e9(context);
                e9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f20627b7));
                frameLayout = e9Var;
            }
        } else {
            FrameLayout m8Var = new org.telegram.ui.Cells.m8(context, 3);
            m8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false));
            frameLayout = m8Var;
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(frameLayout);
    }
}
