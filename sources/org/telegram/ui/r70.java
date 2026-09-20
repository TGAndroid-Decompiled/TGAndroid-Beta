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
public final class r70 extends org.telegram.ui.Components.ul0 {
    public final Context f37058c;
    public final t70 d;

    public r70(t70 t70Var, Context context) {
        this.d = t70Var;
        this.f37058c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42977f == 0) {
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
        t70 t70Var = this.d;
        if ((i10 >= t70Var.E && i10 < t70Var.F) || i10 == t70Var.J) {
            return 0;
        }
        if (i10 != t70Var.f37664y && i10 != t70Var.H) {
            if (i10 != t70Var.f37663x && i10 != t70Var.K) {
                if (i10 != t70Var.I) {
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
        t70 t70Var = this.d;
        boolean z11 = t70Var.N;
        int i14 = c1Var.f42977f;
        View view = c1Var.f42974a;
        boolean z12 = true;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 4) {
                    if (i14 == 5) {
                        q70 q70Var = (q70) view;
                        if (t70Var.J <= 0) {
                            z12 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = t70Var.f37660r;
                        q70Var.f36785b = z12;
                        org.telegram.ui.Components.bu buVar = q70Var.f36784a;
                        p70 p70Var = q70Var.f36787f;
                        buVar.removeTextChangedListener(p70Var);
                        if (tL_messages_stickerSet == null) {
                            buVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            buVar.setText(str);
                            buVar.setSelection(str.length());
                        }
                        buVar.addTextChangedListener(p70Var);
                        return;
                    }
                    return;
                } else if (i10 == t70Var.H) {
                    ((org.telegram.ui.Cells.n4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                    return;
                } else {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (z11) {
                        i13 = R.string.ChooseEmojiPackHeader;
                    } else {
                        i13 = R.string.ChooseStickerSetHeader;
                    }
                    n4Var.setText(LocaleController.getString(i13));
                    return;
                }
            } else if (i10 == t70Var.f37663x) {
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
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.l4(this, 3), indexOf, indexOf + 9, 18);
                        ((org.telegram.ui.Cells.f9) view).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        ((org.telegram.ui.Cells.f9) view).setText(string);
                        return;
                    }
                }
                ((org.telegram.ui.Cells.f9) view).setText(string);
                return;
            } else if (i10 == t70Var.K) {
                ((org.telegram.ui.Cells.f9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
        if (i10 != t70Var.J) {
            i11 = ((org.telegram.ui.ActionBar.n2) t70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(t70Var.c0());
            int i15 = i10 - t70Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i15);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
            if (i15 != stickerSets.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            n8Var.d(tL_messages_stickerSet3, z10, false);
            n8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = t70Var.f37660r;
            if (tL_messages_stickerSet4 != null) {
                j3 = tL_messages_stickerSet4.set.f18355id;
            } else if (t70Var.b0(t70Var.v) != null) {
                j3 = t70Var.b0(t70Var.v).f18355id;
            } else {
                j3 = 0;
            }
            if (tL_messages_stickerSet2.set.f18355id != j3) {
                z12 = false;
            }
            n8Var.b(z12, false);
            return;
        }
        n8Var.b(false, false);
        n8Var.d(t70Var.f37660r, false, false);
        n8Var.setDeleteAction(new k60(this, 3));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.f37058c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 5) {
                    FrameLayout n4Var = new org.telegram.ui.Cells.n4(context);
                    n4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
                    frameLayout = n4Var;
                } else {
                    t70 t70Var = this.d;
                    q70 q70Var = new q70(t70Var, context);
                    t70Var.O = q70Var;
                    frameLayout = q70Var;
                }
            } else {
                FrameLayout f9Var = new org.telegram.ui.Cells.f9(context);
                f9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19058b7));
                frameLayout = f9Var;
            }
        } else {
            FrameLayout n8Var = new org.telegram.ui.Cells.n8(context, 3);
            n8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
            frameLayout = n8Var;
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(frameLayout);
    }
}
