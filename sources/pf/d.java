package pf;

import ag.y1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import f2.o1;
import h7.z5;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.a3;
import org.telegram.ui.Cells.j4;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.w6;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zm;

public abstract class d extends vk0 {
    public final boolean A;
    public int B;
    public final boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;

    public final int f45761r = UserConfig.selectedAccount;

    public final Context f45762s;
    public final int v;

    public final boolean f45763w;

    public final a0.h f45764x;

    public ArrayList f45765y;

    public d(Context context, int i10, boolean z10, a0.h hVar, int i11) {
        this.f45762s = context;
        this.v = i10;
        this.f45763w = z10;
        this.f45764x = hVar;
        this.A = i11 != 0;
        this.C = i11 == 2;
    }

    @Override
    public final String F(int i10) {
        if (this.B == 2 || this.E) {
            return null;
        }
        int i11 = this.f45761r;
        int i12 = this.v;
        ContactsController contactsController = ContactsController.getInstance(i11);
        ArrayList<String> arrayList = i12 == 2 ? contactsController.sortedUsersMutualSectionsArray : contactsController.sortedUsersSectionsArray;
        int iS = S(i10);
        if (iS == -1) {
            iS = arrayList.size() - 1;
        }
        if (i12 == 0 || this.A) {
            if (iS <= 0 || iS > arrayList.size()) {
                return null;
            }
            return arrayList.get(iS - 1);
        }
        if (iS < 0 || iS >= arrayList.size()) {
            return null;
        }
        return arrayList.get(iS);
    }

    @Override
    public final void G(zk0 zk0Var, float f10, int[] iArr) {
        iArr[0] = (int) (h() * f10);
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        boolean z10 = this.G;
        int i11 = this.f45761r;
        if (z10) {
            if (i10 == 0) {
                return 1;
            }
            if (i10 == 1) {
                return ContactsController.getInstance(i11).phoneBookContacts.size() + 2;
            }
            return 0;
        }
        int i12 = this.v;
        ContactsController contactsController = ContactsController.getInstance(i11);
        HashMap<String, ArrayList<TLRPC.TL_contact>> map = i12 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
        ContactsController contactsController2 = ContactsController.getInstance(i11);
        ArrayList<String> arrayList = i12 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
        boolean z11 = this.A;
        boolean z12 = this.f45763w;
        if (i12 != 0 && !z11) {
            if (!this.E) {
                if (i10 < arrayList.size()) {
                    int size = map.get(arrayList.get(i10)).size();
                    return (i10 != arrayList.size() - 1 || z12) ? size + 1 : size;
                }
                if (z12) {
                    return ContactsController.getInstance(i11).phoneBookContacts.size();
                }
                return 0;
            }
            return 1;
        }
        if (i10 == 0) {
            if (this.E) {
                return 2;
            }
            return z11 ? 3 : 4;
        }
        if (!this.E) {
            if (this.B != 2) {
                int i13 = i10 - 1;
                if (i13 < arrayList.size()) {
                    int size2 = map.get(arrayList.get(i13)).size();
                    arrayList.size();
                    return size2;
                }
            } else if (i10 == 1) {
                if (this.f45765y.isEmpty()) {
                    return 0;
                }
                return this.f45765y.size();
            }
            if (z12) {
                return ContactsController.getInstance(i11).phoneBookContacts.size();
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final int N(int i10, int i11) {
        return Objects.hash(Integer.valueOf(i10 * (-49612)), O(i10, i11));
    }

    @Override
    public final Object O(int i10, int i11) {
        int i12;
        boolean z10 = this.G;
        int i13 = this.f45761r;
        if (z10 && i10 == 1 && i11 > 1 && (i12 = i11 - 2) < ContactsController.getInstance(i13).phoneBookContacts.size()) {
            return ContactsController.getInstance(i13).phoneBookContacts.get(i12);
        }
        if (P(i10, i11) == 2) {
            return "Header";
        }
        int i14 = this.v;
        ContactsController contactsController = ContactsController.getInstance(i13);
        HashMap<String, ArrayList<TLRPC.TL_contact>> map = i14 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
        ContactsController contactsController2 = ContactsController.getInstance(i13);
        ArrayList<String> arrayList = i14 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
        if (i14 != 0 && !this.A) {
            if (i10 < arrayList.size()) {
                ArrayList<TLRPC.TL_contact> arrayList2 = map.get(arrayList.get(i10));
                if (i11 < arrayList2.size()) {
                    return MessagesController.getInstance(i13).getUser(Long.valueOf(arrayList2.get(i11).user_id));
                }
            }
            return null;
        }
        if (i10 == 0) {
            return null;
        }
        if (this.B != 2) {
            int i15 = i10 - 1;
            if (i15 < arrayList.size()) {
                ArrayList<TLRPC.TL_contact> arrayList3 = map.get(arrayList.get(i15));
                if (i11 < arrayList3.size()) {
                    return MessagesController.getInstance(i13).getUser(Long.valueOf(arrayList3.get(i11).user_id));
                }
                return null;
            }
        } else if (i10 == 1) {
            if (i11 < this.f45765y.size()) {
                return MessagesController.getInstance(i13).getUser(Long.valueOf(((TLRPC.TL_contact) this.f45765y.get(i11)).user_id));
            }
            return null;
        }
        if (!this.f45763w || i11 < 0 || i11 >= ContactsController.getInstance(i13).phoneBookContacts.size()) {
            return null;
        }
        return ContactsController.getInstance(i13).phoneBookContacts.get(i11);
    }

    @Override
    public final int P(int i10, int i11) {
        if (this.G) {
            if (i10 == 0) {
                return 4;
            }
            if (i10 != 1) {
                return 8;
            }
            if (i11 == 0) {
                return 5;
            }
            return i11 == 1 ? 7 : 8;
        }
        int i12 = this.v;
        int i13 = this.f45761r;
        ContactsController contactsController = ContactsController.getInstance(i13);
        HashMap<String, ArrayList<TLRPC.TL_contact>> map = i12 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
        ContactsController contactsController2 = ContactsController.getInstance(i13);
        ArrayList<String> arrayList = i12 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
        boolean z10 = this.A;
        if (i12 == 0 || z10) {
            if (i10 == 0) {
                if (z10) {
                    if (i11 == 1) {
                        return 5;
                    }
                    if (i11 == 2) {
                        int i14 = this.B;
                        if (i14 == 1 || i14 == 2) {
                            return 7;
                        }
                        return 2;
                    }
                } else if (this.f45763w) {
                    if (i11 >= 2) {
                        if (i11 == 2) {
                            return 5;
                        }
                        if (i11 == 3) {
                            if (this.E) {
                                return 5;
                            }
                            int i15 = this.B;
                            if (i15 == 1 || i15 == 2) {
                                return 7;
                            }
                            return 2;
                        }
                    }
                } else {
                    if (i11 == 2) {
                        return 5;
                    }
                    if (i11 == 3) {
                        if (this.E) {
                            return 5;
                        }
                        int i16 = this.B;
                        if (i16 == 1 || i16 == 2) {
                            return 7;
                        }
                        return 2;
                    }
                }
            } else {
                if (this.E) {
                    return 4;
                }
                if (this.B != 2) {
                    int i17 = i10 - 1;
                    if (i17 < arrayList.size()) {
                        if (i11 < map.get(arrayList.get(i17)).size()) {
                            return 0;
                        }
                    }
                } else if (i10 == 1) {
                    if (i11 < this.f45765y.size()) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        if (this.E) {
            return 4;
        }
        if (i11 < map.get(arrayList.get(i10)).size()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final View T(int i10, View view) {
        View view2;
        int i11 = this.f45761r;
        int i12 = this.v;
        ContactsController contactsController = ContactsController.getInstance(i11);
        if (i12 == 2) {
            HashMap<String, ArrayList<TLRPC.TL_contact>> map = contactsController.usersMutualSectionsDict;
        } else {
            HashMap<String, ArrayList<TLRPC.TL_contact>> map2 = contactsController.usersSectionsDict;
        }
        ContactsController contactsController2 = ContactsController.getInstance(i11);
        ArrayList<String> arrayList = i12 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
        if (view == null) {
            o4 o4Var = new o4(this.f45762s);
            o4Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(64.0f)));
            TextView textView = new TextView(o4Var.getContext());
            o4Var.f24779a = textView;
            pa.m(22.0f, 1, textView);
            pa.s(g6.B6, null, false, textView, 17);
            o4Var.addView(textView, z5.d(-1, -1.0f, 119, 12.0f, 0.0f, 0.0f, 0.0f));
            view2 = o4Var;
        } else {
            view2 = view;
        }
        o4 o4Var2 = (o4) view2;
        if (this.B == 2 || this.D || this.E) {
            o4Var2.setLetter("");
            return view2;
        }
        if (i12 != 0 && !this.A) {
            if (i10 < arrayList.size()) {
                o4Var2.setLetter(arrayList.get(i10));
                return view2;
            }
            o4Var2.setLetter("");
            return view2;
        }
        if (i10 == 0) {
            o4Var2.setLetter("");
            return view2;
        }
        int i13 = i10 - 1;
        if (i13 < arrayList.size()) {
            o4Var2.setLetter(arrayList.get(i13));
            return view2;
        }
        o4Var2.setLetter("");
        return view2;
    }

    @Override
    public final boolean V(int i10, int i11, o1 o1Var) {
        if (!this.G) {
            int i12 = this.v;
            int i13 = this.f45761r;
            ContactsController contactsController = ContactsController.getInstance(i13);
            HashMap<String, ArrayList<TLRPC.TL_contact>> map = i12 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
            ContactsController contactsController2 = ContactsController.getInstance(i13);
            ArrayList<String> arrayList = i12 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
            boolean z10 = this.A;
            if (i12 == 0 || z10) {
                if (i10 == 0) {
                    if (z10) {
                        if (i11 >= 1) {
                            return false;
                        }
                    } else if (this.f45763w) {
                        if (i11 >= 2) {
                            return false;
                        }
                    } else if (i11 >= 3) {
                        return false;
                    }
                } else {
                    if (this.E) {
                        return false;
                    }
                    if (this.B != 2) {
                        int i14 = i10 - 1;
                        if (i14 < arrayList.size() && i11 >= map.get(arrayList.get(i14)).size()) {
                            return false;
                        }
                    } else if (i10 == 1 && i11 >= this.f45765y.size()) {
                        return false;
                    }
                }
            } else if (this.E || i11 >= map.get(arrayList.get(i10)).size()) {
                return false;
            }
        } else if (i10 != 1 || i11 <= 1) {
            return false;
        }
        return true;
    }

    @Override
    public final void W(int i10, int i11, o1 o1Var) {
        ArrayList<TLRPC.TL_contact> arrayList;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        int i13 = 7;
        boolean z10 = this.A;
        int i14 = this.f45761r;
        if (i12 == 0) {
            sa saVar = (sa) view;
            saVar.P.f13391a = false;
            if (this.B != 2 && !this.D) {
                i13 = 58;
            }
            saVar.b(i13, 1);
            if (this.B == 2) {
                arrayList = this.f45765y;
            } else {
                int i15 = this.v;
                ContactsController contactsController = ContactsController.getInstance(i14);
                arrayList = (i15 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict).get((i15 == 2 ? ContactsController.getInstance(i14).sortedUsersMutualSectionsArray : ContactsController.getInstance(i14).sortedUsersSectionsArray).get(i10 - ((i15 == 0 || z10) ? 1 : 0)));
            }
            TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(arrayList.get(i11).user_id));
            saVar.e(user, null, null, false);
            saVar.c(this.f45764x.h(user.f22527id) >= 0, false);
            return;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                s3 s3Var = (s3) view;
                int i16 = this.B;
                if (i16 == 0) {
                    s3Var.setText(LocaleController.getString(R.string.Contacts));
                    return;
                } else if (i16 == 1) {
                    s3Var.setText(LocaleController.getString(R.string.SortedByName));
                    return;
                } else {
                    s3Var.setText(LocaleController.getString(R.string.SortedByLastSeen));
                    return;
                }
            }
            if (i12 == 4) {
                view.setPadding(0, AndroidUtilities.dp(!this.F ? 96.0f : 25.0f), 0, AndroidUtilities.dp(18.0f));
                return;
            }
            if (i12 != 7) {
                if (i12 != 8) {
                    return;
                }
                m4 m4Var = (m4) view;
                int i17 = i11 - 2;
                if (i17 < 0 || i17 >= ContactsController.getInstance(i14).phoneBookContacts.size()) {
                    return;
                }
                m4Var.f24683f = ContactsController.getInstance(i14).phoneBookContacts.get(i17);
                m4Var.h = null;
                m4Var.a();
                return;
            }
            j4 j4Var = (j4) view;
            if (this.G && i11 == 1 && i10 == 1) {
                j4Var.setText(LocaleController.getString(R.string.InviteFriends));
                return;
            } else if (this.B == 1) {
                j4Var.setText(LocaleController.getString(R.string.SortedByName));
                return;
            } else {
                j4Var.setText(LocaleController.getString(R.string.SortedByLastSeen));
                return;
            }
        }
        l8 l8Var = (l8) view;
        boolean z11 = this.f45763w;
        if (z11 || !z10) {
            int i18 = g6.G6;
            l8Var.e(i18, i18);
        } else {
            int i19 = g6.il;
            l8Var.e(i19, i19);
        }
        if (i10 != 0) {
            ContactsController.Contact contact = ContactsController.getInstance(i14).phoneBookContacts.get(i11);
            String str = contact.first_name;
            if (str == null || contact.last_name == null) {
                if (str == null || contact.last_name != null) {
                    l8Var.i(contact.last_name, false);
                    return;
                } else {
                    l8Var.i(str, false);
                    return;
                }
            }
            l8Var.i(contact.first_name + " " + contact.last_name, false);
            return;
        }
        if (z11) {
            if (i11 == 0) {
                l8Var.p(LocaleController.getString(R.string.InviteFriends), "", false, R.drawable.settings_invite, -14899731, -15431455, false);
                return;
            } else {
                if (i11 == 1) {
                    l8Var.p(LocaleController.getString(R.string.RecentCalls), "", false, R.drawable.settings_calls, -11154873, -14175180, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            if (this.C) {
                l8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                return;
            } else {
                l8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                return;
            }
        }
        if (i11 == 0) {
            l8Var.p(LocaleController.getString(R.string.NewGroup), "", false, R.drawable.settings_group, -14899731, -15431455, false);
        } else if (i11 == 1) {
            l8Var.p(LocaleController.getString(R.string.NewChannel), "", false, R.drawable.settings_channel, -11154873, -14175180, false);
        }
    }

    public final void Y(int i10, boolean z10) {
        this.B = i10;
        if (i10 != 2) {
            l();
            return;
        }
        if (this.f45765y == null || z10) {
            int i11 = this.f45761r;
            this.f45765y = new ArrayList(ContactsController.getInstance(i11).contacts);
            long j10 = UserConfig.getInstance(i11).clientUserId;
            int size = this.f45765y.size();
            for (int i12 = 0; i12 < size; i12++) {
                if (((TLRPC.TL_contact) this.f45765y.get(i12)).user_id == j10) {
                    this.f45765y.remove(i12);
                    break;
                }
            }
        }
        Z();
    }

    public final void Z() {
        int i10 = this.f45761r;
        if (this.f45765y == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            Collections.sort(this.f45765y, new b30(MessagesController.getInstance(i10), currentTime, 1));
            l();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final o1 x(ViewGroup viewGroup, int i10) {
        View j4Var;
        View view;
        Context context = this.f45762s;
        if (i10 == 0) {
            sa saVar = new sa(context, 58, 1, false);
            saVar.setCallCellStyle(58);
            j4Var = saVar;
        } else if (i10 == 1) {
            j4Var = new l8(context);
        } else if (i10 == 2) {
            j4Var = new s3(context, null);
        } else if (i10 != 3) {
            if (i10 == 4) {
                y1 y1Var = new y1(this, context, viewGroup, 29);
                y1Var.addView(new gq(context), z5.e(-1, -2, 17));
                y1Var.setLayoutParams(new f2.y0(-1, -2));
                y1Var.setTag(-33024);
                view = y1Var;
            } else if (i10 == 7) {
                j4Var = new j4(this.f45762s, g6.L6, 21, 14, 5, false, false, null);
            } else if (i10 == 8) {
                j4Var = new m4(context, false);
            } else if (i10 != 9) {
                j4Var = new w6(context, (rl) null);
            } else {
                zm zmVar = new zm(context, 28);
                zmVar.setId(9);
                zmVar.setTag(-33024);
                view = zmVar;
            }
            j4Var = view;
        } else {
            a3 a3Var = new a3(context, null);
            a3Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : 72.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 28.0f), AndroidUtilities.dp(8.0f));
            j4Var = a3Var;
        }
        return new lk0(j4Var);
    }
}
