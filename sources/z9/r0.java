package z9;

import java.util.List;
public final class r0 extends r1 {
    public final String f51466a;
    public final int f51467b;
    public final List f51468c;

    public r0(String str, int i10, List list) {
        this.f51466a = str;
        this.f51467b = i10;
        this.f51468c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f51466a.equals(r0Var.f51466a) && this.f51467b == r0Var.f51467b && this.f51468c.equals(r0Var.f51468c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51466a.hashCode() ^ 1000003) * 1000003) ^ this.f51467b) * 1000003) ^ this.f51468c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f51466a + ", importance=" + this.f51467b + ", frames=" + this.f51468c + "}";
    }
}
