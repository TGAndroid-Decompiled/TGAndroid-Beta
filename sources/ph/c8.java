package ph;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class c8 {
    public final int f41437a;
    public final ArrayList f41438b;
    public final ArrayList f41439c;
    public final HashMap d;
    public final ArrayList e;
    public final ArrayList f41440f;

    public c8(int i10, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.f41438b = arrayList2;
        this.f41439c = new ArrayList();
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f41440f = new ArrayList();
        int i11 = 0;
        if (a(arrayList, TLRPC.TL_privacyValueAllowAll.class) != null) {
            this.f41437a = 4;
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
            TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = (TLRPC.TL_privacyValueDisallowUsers) a(arrayList, TLRPC.TL_privacyValueDisallowUsers.class);
            if (tL_privacyValueDisallowUsers != null) {
                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                MessagesController messagesController = MessagesController.getInstance(i10);
                while (i11 < tL_privacyValueDisallowUsers.users.size()) {
                    Long l10 = tL_privacyValueDisallowUsers.users.get(i11);
                    TLRPC.InputUser inputUser = messagesController.getInputUser(l10.longValue());
                    if (!(inputUser instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                        this.f41439c.add(l10);
                        this.e.add(inputUser);
                    }
                    i11++;
                }
                this.f41438b.add(tL_inputPrivacyValueDisallowUsers);
            }
        } else if (a(arrayList, TLRPC.TL_privacyValueAllowCloseFriends.class) != null) {
            this.f41437a = 1;
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
        } else {
            TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) a(arrayList, TLRPC.TL_privacyValueAllowUsers.class);
            if (tL_privacyValueAllowUsers != null) {
                this.f41437a = 3;
                TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                MessagesController messagesController2 = MessagesController.getInstance(i10);
                while (i11 < tL_privacyValueAllowUsers.users.size()) {
                    Long l11 = tL_privacyValueAllowUsers.users.get(i11);
                    TLRPC.InputUser inputUser2 = messagesController2.getInputUser(l11.longValue());
                    if (inputUser2 != null && !(inputUser2 instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueAllowUsers.users.add(inputUser2);
                        this.f41439c.add(l11);
                        this.e.add(inputUser2);
                    }
                    i11++;
                }
                this.f41438b.add(tL_inputPrivacyValueAllowUsers);
            } else if (a(arrayList, TLRPC.TL_privacyValueAllowContacts.class) != null) {
                this.f41437a = 2;
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers2 = (TLRPC.TL_privacyValueDisallowUsers) a(arrayList, TLRPC.TL_privacyValueDisallowUsers.class);
                if (tL_privacyValueDisallowUsers2 != null) {
                    TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                    MessagesController messagesController3 = MessagesController.getInstance(i10);
                    while (i11 < tL_privacyValueDisallowUsers2.users.size()) {
                        Long l12 = tL_privacyValueDisallowUsers2.users.get(i11);
                        TLRPC.InputUser inputUser3 = messagesController3.getInputUser(l12.longValue());
                        if (!(inputUser3 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueDisallowUsers2.users.add(inputUser3);
                            this.f41439c.add(l12);
                            this.e.add(inputUser3);
                        }
                        i11++;
                    }
                    this.f41438b.add(tL_inputPrivacyValueDisallowUsers2);
                }
            } else {
                this.f41437a = 4;
            }
        }
    }

    public static TLRPC.PrivacyRule a(ArrayList arrayList, Class cls) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i10);
            if (cls.isInstance(privacyRule)) {
                return privacyRule;
            }
        }
        return null;
    }

    public final boolean b(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        ArrayList arrayList = this.f41439c;
        int i10 = this.f41437a;
        if (i10 == 4) {
            return !arrayList.contains(Long.valueOf(user.f19306id));
        }
        if (i10 == 2) {
            if (arrayList.contains(Long.valueOf(user.f19306id)) || !user.contact) {
                return false;
            }
            return true;
        } else if (i10 == 1) {
            return user.close_friend;
        } else {
            if (i10 == 3) {
                if (arrayList.contains(Long.valueOf(user.f19306id))) {
                    return true;
                }
                for (ArrayList arrayList2 : this.d.values()) {
                    if (arrayList2.contains(Long.valueOf(user.f19306id))) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final String toString() {
        int size;
        ArrayList arrayList = this.f41440f;
        if (!arrayList.isEmpty()) {
            return LocaleController.formatPluralString("StoryPrivacyRecipients", arrayList.size(), new Object[0]);
        }
        ArrayList arrayList2 = this.f41438b;
        if (arrayList2.isEmpty()) {
            return LocaleController.getString(R.string.StoryPrivacyNone);
        }
        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList2.get(0);
        TLRPC.InputPrivacyRule inputPrivacyRule2 = null;
        int i10 = this.f41437a;
        if (i10 == 4) {
            if (arrayList2.size() >= 2) {
                inputPrivacyRule2 = (TLRPC.InputPrivacyRule) arrayList2.get(1);
            }
            if ((inputPrivacyRule2 instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) && (size = ((TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule2).users.size()) > 0) {
                return LocaleController.formatPluralString("StoryPrivacyEveryoneExclude", size, new Object[0]);
            }
            return LocaleController.getString(R.string.StoryPrivacyEveryone);
        } else if (i10 == 1) {
            return LocaleController.getString(R.string.StoryPrivacyCloseFriends);
        } else {
            if (i10 == 3 && (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers)) {
                return LocaleController.formatPluralString("StoryPrivacyContacts", ((TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule).users.size(), new Object[0]);
            }
            if (i10 == 2) {
                if (arrayList2.size() >= 2) {
                    inputPrivacyRule2 = (TLRPC.InputPrivacyRule) arrayList2.get(1);
                }
                if (inputPrivacyRule2 instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                    int size2 = ((TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule2).users.size();
                    if (size2 > 0) {
                        return LocaleController.formatPluralString("StoryPrivacyContactsExclude", size2, new Object[0]);
                    }
                    return LocaleController.getString(R.string.StoryPrivacyAllContacts);
                }
                return LocaleController.getString(R.string.StoryPrivacyAllContacts);
            } else if (i10 == 0) {
                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                    int size3 = ((TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule).users.size();
                    if (size3 <= 0) {
                        return LocaleController.getString(R.string.StoryPrivacyNone);
                    }
                    return LocaleController.formatPluralString("StoryPrivacyContacts", size3, new Object[0]);
                }
                return LocaleController.getString(R.string.StoryPrivacyNone);
            } else {
                return LocaleController.getString(R.string.StoryPrivacyNone);
            }
        }
    }

    public c8() {
        ArrayList arrayList = new ArrayList();
        this.f41438b = arrayList;
        this.f41439c = new ArrayList();
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f41440f = new ArrayList();
        this.f41437a = 4;
        arrayList.add(new TLRPC.TL_inputPrivacyValueAllowAll());
    }

    public c8(int i10, int i11, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.f41438b = arrayList2;
        this.f41439c = new ArrayList();
        this.d = new HashMap();
        this.e = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.f41440f = arrayList3;
        this.f41437a = i10;
        int i12 = 0;
        if (i10 == 4) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
            if (i11 < 0 || arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i12 < arrayList.size()) {
                Long l10 = (Long) arrayList.get(i12);
                long longValue = l10.longValue();
                this.f41439c.add(l10);
                TLRPC.InputUser inputUser = MessagesController.getInstance(i11).getInputUser(longValue);
                if (inputUser != null && !(inputUser instanceof TLRPC.TL_inputUserEmpty)) {
                    tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                    this.e.add(inputUser);
                }
                i12++;
            }
            this.f41438b.add(tL_inputPrivacyValueDisallowUsers);
        } else if (i10 == 1) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
        } else if (i10 == 2) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
            if (i11 < 0 || arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i12 < arrayList.size()) {
                Long l11 = (Long) arrayList.get(i12);
                long longValue2 = l11.longValue();
                this.f41439c.add(l11);
                TLRPC.InputUser inputUser2 = MessagesController.getInstance(i11).getInputUser(longValue2);
                if (inputUser2 != null && !(inputUser2 instanceof TLRPC.TL_inputUserEmpty)) {
                    tL_inputPrivacyValueDisallowUsers2.users.add(inputUser2);
                    this.e.add(inputUser2);
                }
                i12++;
            }
            this.f41438b.add(tL_inputPrivacyValueDisallowUsers2);
        } else if (i10 != 3) {
            if (i10 != 5 || arrayList == null) {
                return;
            }
            arrayList3.addAll(arrayList);
        } else {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
            if (i11 >= 0 && arrayList != null && !arrayList.isEmpty()) {
                while (i12 < arrayList.size()) {
                    Long l12 = (Long) arrayList.get(i12);
                    long longValue3 = l12.longValue();
                    this.f41439c.add(l12);
                    TLRPC.InputUser inputUser3 = MessagesController.getInstance(i11).getInputUser(longValue3);
                    if (inputUser3 != null && !(inputUser3 instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueAllowUsers.users.add(inputUser3);
                        this.e.add(inputUser3);
                    }
                    i12++;
                }
            }
            this.f41438b.add(tL_inputPrivacyValueAllowUsers);
        }
    }

    public c8(int i10, ArrayList arrayList, int i11) {
        ArrayList arrayList2 = new ArrayList();
        this.f41438b = arrayList2;
        this.f41439c = new ArrayList();
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f41440f = new ArrayList();
        this.f41437a = i10;
        int i12 = 0;
        if (i10 == 4) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
            if (arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i12 < arrayList.size()) {
                TLRPC.InputUser inputUser = (TLRPC.InputUser) arrayList.get(i12);
                if (inputUser != null) {
                    tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                    this.f41439c.add(Long.valueOf(inputUser.user_id));
                    this.e.add(inputUser);
                }
                i12++;
            }
            this.f41438b.add(tL_inputPrivacyValueDisallowUsers);
        } else if (i10 == 1) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
        } else if (i10 == 2) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
            if (arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i12 < arrayList.size()) {
                TLRPC.InputUser inputUser2 = (TLRPC.InputUser) arrayList.get(i12);
                if (inputUser2 != null) {
                    tL_inputPrivacyValueDisallowUsers2.users.add(inputUser2);
                    this.f41439c.add(Long.valueOf(inputUser2.user_id));
                    this.e.add(inputUser2);
                }
                i12++;
            }
            this.f41438b.add(tL_inputPrivacyValueDisallowUsers2);
        } else if (i10 != 3) {
            if (i10 == 5) {
                while (i12 < arrayList.size()) {
                    TLRPC.InputUser inputUser3 = (TLRPC.InputUser) arrayList.get(i12);
                    if (inputUser3 != null) {
                        this.f41440f.add(Long.valueOf(inputUser3.user_id));
                    }
                    i12++;
                }
            }
        } else {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
            if (!arrayList.isEmpty()) {
                while (i12 < arrayList.size()) {
                    TLRPC.InputUser inputUser4 = (TLRPC.InputUser) arrayList.get(i12);
                    if (inputUser4 != null) {
                        tL_inputPrivacyValueAllowUsers.users.add(inputUser4);
                        this.f41439c.add(Long.valueOf(inputUser4.user_id));
                        this.e.add(inputUser4);
                    }
                    i12++;
                }
            }
            this.f41438b.add(tL_inputPrivacyValueAllowUsers);
        }
    }
}
