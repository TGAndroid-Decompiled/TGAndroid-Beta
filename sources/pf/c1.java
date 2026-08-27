package pf;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import f2.o1;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.e6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.qt;

public abstract class c1 extends yk0 {
    public int A;
    public int B;
    public ArrayList C;
    public ArrayList D;
    public String E;
    public int F;

    public Context f45752c;
    public ArrayList d;

    public ArrayList f45753e;

    public j1 f45754f;
    public a0.h h;

    public Timer f45755n;

    public boolean f45756r;

    public boolean f45757s;
    public boolean v;

    public boolean f45758w;

    public long f45759x;

    public boolean f45760y;

    @Override
    public final boolean D(o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 0 || i10 == 2 || i10 == 3;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.D.size();
        j1 j1Var = this.f45754f;
        int size3 = j1Var.f45839e.size();
        int size4 = j1Var.f45843j.size();
        if (i10 >= 0 && i10 < size) {
            return this.d.get(i10);
        }
        int i11 = i10 - size;
        if (size2 > 0) {
            if (i11 == 0) {
                return null;
            }
            if (i11 > 0 && i11 <= size2) {
                return this.D.get(i11 - 1);
            }
            i11 -= size2 + 1;
        }
        if (i11 >= 0 && i11 < size4) {
            return j1Var.f45843j.get(i11);
        }
        int i12 = i11 - size4;
        if (i12 <= 0 || i12 > size3) {
            return null;
        }
        return j1Var.f45839e.get(i12 - 1);
    }

    public final void F(String str) {
        try {
            Timer timer = this.f45755n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        this.d.clear();
        this.D.clear();
        this.f45753e.clear();
        if (this.f45756r) {
            this.f45754f.g(null, true, false, this.f45757s, this.v, this.f45759x, this.f45758w, 0, 0);
        }
        l();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Timer timer2 = new Timer();
        this.f45755n = timer2;
        timer2.schedule(new qt(this, str, 1), 200L, 300L);
    }

    @Override
    public final int h() {
        j1 j1Var = this.f45754f;
        this.F = -1;
        int size = this.d.size();
        if (!this.D.isEmpty()) {
            this.F = size;
            size += this.D.size() + 1;
        }
        int size2 = j1Var.f45839e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = j1Var.f45843j.size();
        return size3 != 0 ? size + size3 : size;
    }

    @Override
    public final int j(int i10) {
        Object objE = E(i10);
        if (objE == null) {
            return 1;
        }
        if (objE instanceof String) {
            return "section".equals((String) objE) ? 1 : 2;
        }
        return objE instanceof ContactsController.Contact ? 3 : 0;
    }

    @Override
    public final void v(o1 o1Var, int i10) {
        long j10;
        String publicUsername;
        long j11;
        boolean z10;
        CharSequence charSequence;
        int iIndexOfIgnoreCase;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 != 0) {
            if (i11 == 1) {
                s3 s3Var = (s3) view;
                if (i10 == this.F) {
                    s3Var.setText(LocaleController.getString(R.string.InviteToTelegramShort));
                    return;
                } else if (E(i10) == null) {
                    s3Var.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                } else {
                    s3Var.setText(LocaleController.getString(R.string.PhoneNumberSearch));
                    return;
                }
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                ContactsController.Contact contact = (ContactsController.Contact) E(i10);
                ((e6) view).u(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), y1.k(new StringBuilder("+"), contact.shortPhones.get(0), oe.b.c()), false, false);
                return;
            }
            String str = (String) E(i10);
            l8 l8Var = (l8) view;
            l8Var.e(-1, g6.f23251o6);
            l8Var.i(LocaleController.formatString(R.string.AddContactByPhone, oe.b.c().b("+" + str)), false);
            return;
        }
        TLObject tLObject = (TLObject) E(i10);
        if (tLObject != null) {
            CharSequence string = null;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                publicUsername = UserObject.getPublicUsername(user);
                if (publicUsername != null && this.E != null && !publicUsername.toLowerCase().contains(this.E.toLowerCase()) && user.usernames != null) {
                    for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                        TLRPC.TL_username tL_username = user.usernames.get(i12);
                        if (tL_username != null && tL_username.active && tL_username.username.toLowerCase().contains(this.E.toLowerCase())) {
                            publicUsername = tL_username.username;
                        }
                    }
                }
                long j12 = user.f22527id;
                z10 = user.self;
                j11 = j12;
            } else {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    publicUsername = ChatObject.getPublicUsername(chat);
                    j10 = chat.f22380id;
                } else {
                    j10 = 0;
                    publicUsername = null;
                }
                j11 = j10;
                z10 = false;
            }
            if (i10 < this.d.size()) {
                CharSequence charSequence2 = (CharSequence) this.f45753e.get(i10);
                if (charSequence2 == null || publicUsername == null || publicUsername.length() <= 0 || !charSequence2.toString().startsWith("@".concat(publicUsername))) {
                    charSequence = null;
                    string = charSequence2;
                } else {
                    charSequence = charSequence2;
                }
            } else if (i10 <= this.d.size() || publicUsername == null) {
                charSequence = null;
            } else {
                String strSubstring = this.f45754f.f45838c;
                if (strSubstring != null && strSubstring.startsWith("@")) {
                    strSubstring = strSubstring.substring(1);
                }
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "@");
                    spannableStringBuilder.append((CharSequence) publicUsername);
                    if (strSubstring != null && (iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, strSubstring)) != -1) {
                        int length = strSubstring.length();
                        if (iIndexOfIgnoreCase == 0) {
                            length++;
                        } else {
                            iIndexOfIgnoreCase++;
                        }
                        spannableStringBuilder.setSpan(new s00(g6.q6, null), iIndexOfIgnoreCase, length + iIndexOfIgnoreCase, 33);
                    }
                    charSequence = spannableStringBuilder;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    charSequence = publicUsername;
                }
            }
            e6 e6Var = (e6) view;
            if (z10) {
                string = LocaleController.getString(R.string.SavedMessages);
            }
            e6Var.u(tLObject, null, string, charSequence, false, z10);
            e6Var.t(this.h.h(j11) >= 0, false);
        }
    }

    @Override
    public final o1 x(ViewGroup viewGroup, int i10) {
        View l8Var;
        Context context = this.f45752c;
        if (i10 == 0) {
            e6 e6Var = new e6(context, null);
            e6Var.I0 = true;
            e6Var.A0 = true;
            l8Var = e6Var;
        } else if (i10 == 1) {
            s3 s3Var = new s3(context, 26, null);
            s3Var.setNoBackground(true);
            l8Var = s3Var;
        } else if (i10 == 3) {
            e6 e6Var2 = new e6(context, null);
            e6Var2.I0 = true;
            e6Var2.A0 = true;
            l8Var = e6Var2;
        } else if (i10 == 4) {
            q0 q0Var = new q0(context, 1);
            q0Var.setId(9);
            q0Var.setTag(-33024);
            l8Var = q0Var;
        } else if (i10 != 5) {
            l8Var = new l8(16, context, false);
        } else {
            h00 h00Var = new h00(context, null);
            h00Var.setIsSingleCell(true);
            h00Var.setViewType(29);
            h00Var.setBackgroundColor(g6.w0(null, g6.f23053d6, false));
            l8Var = h00Var;
        }
        return new lk0(l8Var);
    }
}
