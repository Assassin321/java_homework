package Lab03;

import java.util.List;

public interface SqlUtil {
	

    /**
     * ���ݴ���Ĳ������ز�ѯ���
     * @param user
     * @return ���ز�ѯ���
     */
    String query(User user);

    /**
     * ���ݴ���Ĳ������ز������
     * @param user
     * @return ���ز������
     */
    String insert(User user);

    /**
     * ���ݴ���Ĳ������ز������
     * @param users
     * @return ���ز������
     */
    String insert(List<User> users);

    /**
     * ���ݴ���Ĳ�������ɾ����䣨ɾ��idΪuser.id�ļ�¼��
     * @param user
     * @return ����ɾ�����
     */
    String delete(User user);
/**
     * ���ݴ���Ĳ������ظ�����䣨��idΪuser.id�ļ�¼�������ֶθ��³�user�еĶ�Ӧֵ��
     * @param user
     * @return ���ظ������
     */
    String update(User user);
}

