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
public final class t70 extends org.telegram.ui.Components.vm0 {
    public final Context f42115c;
    public final v70 d;

    public t70(v70 v70Var, Context context) {
        this.d = v70Var;
        this.f42115c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47901f == 0) {
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
        v70 v70Var = this.d;
        if ((i10 >= v70Var.E && i10 < v70Var.F) || i10 == v70Var.J) {
            return 0;
        }
        if (i10 != v70Var.f42706y && i10 != v70Var.H) {
            if (i10 != v70Var.f42705x && i10 != v70Var.K) {
                if (i10 != v70Var.I) {
                    return 0;
                }
                return 5;
            }
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        boolean z10;
        long j3;
        int i12;
        int i13;
        v70 v70Var = this.d;
        boolean z11 = v70Var.N;
        int i14 = d1Var.f47901f;
        View view = d1Var.f47897a;
        boolean z12 = true;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 4) {
                    if (i14 == 5) {
                        s70 s70Var = (s70) view;
                        if (v70Var.J <= 0) {
                            z12 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = v70Var.f42702r;
                        s70Var.f41827b = z12;
                        org.telegram.ui.Components.uu uuVar = s70Var.f41826a;
                        r70 r70Var = s70Var.f41830f;
                        uuVar.removeTextChangedListener(r70Var);
                        if (tL_messages_stickerSet == null) {
                            uuVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            uuVar.setText(str);
                            uuVar.setSelection(str.length());
                        }
                        uuVar.addTextChangedListener(r70Var);
                        return;
                    }
                    return;
                } else if (i10 == v70Var.H) {
                    ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                    return;
                } else {
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    if (z11) {
                        i13 = R.string.ChooseEmojiPackHeader;
                    } else {
                        i13 = R.string.ChooseStickerSetHeader;
                    }
                    m4Var.setText(LocaleController.getString(i13));
                    return;
                }
            } else if (i10 == v70Var.f42705x) {
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
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.o4(this, 3), indexOf, indexOf + 9, 18);
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
            } else if (i10 == v70Var.K) {
                ((org.telegram.ui.Cells.e9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
        if (i10 != v70Var.J) {
            i11 = ((org.telegram.ui.ActionBar.m2) v70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(v70Var.c0());
            int i15 = i10 - v70Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i15);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
            if (i15 != stickerSets.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            m8Var.d(tL_messages_stickerSet3, z10, false);
            m8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = v70Var.f42702r;
            if (tL_messages_stickerSet4 != null) {
                j3 = tL_messages_stickerSet4.set.f19830id;
            } else if (v70Var.b0(v70Var.v) != null) {
                j3 = v70Var.b0(v70Var.v).f19830id;
            } else {
                j3 = 0;
            }
            if (tL_messages_stickerSet2.set.f19830id != j3) {
                z12 = false;
            }
            m8Var.b(z12, false);
            return;
        }
        m8Var.b(false, false);
        m8Var.d(v70Var.f42702r, false, false);
        m8Var.setDeleteAction(new o60(this, 2));
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.f42115c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 5) {
                    FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
                    m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false));
                    frameLayout = m4Var;
                } else {
                    v70 v70Var = this.d;
                    s70 s70Var = new s70(v70Var, context);
                    v70Var.O = s70Var;
                    frameLayout = s70Var;
                }
            } else {
                FrameLayout e9Var = new org.telegram.ui.Cells.e9(context);
                e9Var.setBackground(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20524b7));
                frameLayout = e9Var;
            }
        } else {
            FrameLayout m8Var = new org.telegram.ui.Cells.m8(context, 3);
            m8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false));
            frameLayout = m8Var;
        }
        frameLayout.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(frameLayout);
    }
}
