package t3;

import j$.util.Objects;
public final class e extends i {
    public final String f57688b;
    public final String f57689c;
    public final String d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f57688b = str;
        this.f57689c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f57689c, eVar.f57689c) && Objects.equals(this.f57688b, eVar.f57688b) && Objects.equals(this.d, eVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11 = 0;
        String str = this.f57688b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (527 + i7) * 31;
        String str2 = this.f57689c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i13 + i11;
    }

    @Override
    public final String toString() {
        return this.f57695a + ": language=" + this.f57688b + ", description=" + this.f57689c + ", text=" + this.d;
    }
}
